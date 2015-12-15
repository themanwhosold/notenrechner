/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.entity.Noten;
import de.hof.se2.logWriter.LogWriter;
import de.hof.se2.logik.Statistik;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Stellt die Statistik-Methoden zur Verfügung und zwar so, dass alte Ergebnisse
 * wiederverwendet und nur einmal auf die Datenbank zugegriffen werden muss
 *
 * @author max
 * @version 0.1
 * @since 08.11.2015
 */
@Singleton
@Local(StatistikBeanLocal.class)
public class StatistikBean implements StatistikBeanLocal, Serializable {

    @Resource
    SessionContext sessionContext;

    @PersistenceContext
    EntityManager em;

    LogWriter logBerechnungWriter;
    Logger logBerechnung;

    /**
     * Logger für die Statistikberechnugn
     * @throws IOException
     */
    public StatistikBean() throws IOException {
        this.logBerechnungWriter = new LogWriter(new File("/home/max/studium/statistikLog"), Boolean.TRUE);
        this.logBerechnung = logBerechnungWriter.newLog();
    }

    /**
     * Holt Liste der Noten eines Studienfaches aus der Datenbank
     * @param idStudienfach
     * @return List<Noten> -> Noten aus der Datenbank, die zum Studienfach
     * (idStudienfach) gehoeren
     */
    private List<Noten> dbAbfrageAllerNoten(int idStudienfach) {
        List<Noten> liste = null;
        try {
            //Gibt die notenListe aufsteigend sortiert zurueck (muss man spaeter nicht nochmal sortieren):
            liste = (List<Noten>) em.createNativeQuery("select n.* from noten n, studienfaecher s where n.studienfach_id = s.idStudienfach and s.idStudienfach = " + idStudienfach + " order by n.note", Noten.class).getResultList();
        } catch (Exception ex) {
//            ex.printStackTrace();   // schlecht wird nicht angezeigt
            throw new RuntimeException(ex); //Naja

        }
        if (liste.size() <= 0) {
            throw new RuntimeException("Fehler es gibt keine Noten zu dem angegebenen Studienfach mit der id " + idStudienfach);
        }

        return liste;
    }

    /**
     * Wert des Arithmetischen Mittels des Studienfaches
     * @author max 
     */
    private double berechneArithmetischesMittel(List<Noten> notenListe) {

        double arithmetischesMittel = 0;
        long summe = 0;
        for (Noten noten : notenListe) {
            summe += noten.getNote();
        }
        arithmetischesMittel = (double) summe / (double) notenListe.size();
        return arithmetischesMittel;
    }

    /**
     * Wert der Standardabweichung des Studienfaches
     * @author max 
     */
    private double berechneStandardabweichung(double varianz) {
//        this.standardabweichung = Math.sqrt(varianz);
        return Math.sqrt(varianz);
    }

    /**
     * den Median des Studiengangs
     * @author max 
     */
    private int berechneMedian(List<Noten> notenListe) {
        int median = 0;
        int mitte = notenListe.size() / 2;
        median = notenListe.get(mitte).getNote();
        return median;
    }

    /**
     * Wert der Varianz des Studiengangs
     * @author max 
     */
    private double berechneVarianz(List<Noten> notenListe, double arithmetischesMittel) {

        double zaehler = 0.;
        for (Noten noten : notenListe) {
            double temp = arithmetischesMittel - noten.getNote();   //Eigentlich schlecht da nochmal eine Datenbankabfrage gemacht wird
            temp = Math.pow(temp, 2);
            zaehler += temp;
        }
        double varianz = zaehler / notenListe.size();
        return varianz;
    }

    /**
     * Holt minimale und Maximale Note der Liste, die übergeben wurde
     * @author max
     * @param List<Noten> Liste der Noten, deren Maximum, Minimum ermittelt werden soll
     * @return ein int[] -> erster Eintrag = Minimum, zweiter Eintrag = Maximum
     */
    private int[] getMinMaxNoten(List<Noten> notenListe) {
        notenListe.sort(new Comparator<Noten>() {
            @Override
            public int compare(Noten n1, Noten n2) {
                if (n1.getNote() > n2.getNote()) {
                    return 1;
                } else if (n1.getNote() < n2.getNote()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int rc[] = {notenListe.get(0).getNote(), notenListe.get(notenListe.size() - 1).getNote()};
        return rc;
    }

    /**
     *
     * Gibt die Anzahl der Notenarten eines Studienfaches zurueck
     *
     * @author max
     * @since 24.11.2015
     * @param idStudienfach
     * @return anzahlNotenArten
     */
    @Override
    public int getAnzahlNotenArten(int idStudienfach) {
        BigInteger anzahlNotenArten = BigInteger.ZERO;  //BigInteger Typsicherheit fraglich
        try {
            anzahlNotenArten = (BigInteger) em.createNativeQuery("select count(distinct notenart_id) from noten where studienfach_id =" + idStudienfach).getResultList().get(0);
        } catch (Exception ex) {
//            ex.printStackTrace();   // schlecht wird nicht angezeigt
            throw new RuntimeException(ex); //Naja

        }
        return anzahlNotenArten.intValue();
    }

    /**
     *
     * Gibt die NotenIDs eines Studienfaches zurueck
     *
     * @author max
     * @since 24.11.2015
     * @param idStudienfach
     * @return ArrayList<Integer>
     */
    private List<Integer> getIDsNotenarten(int idStudienfach) {

        ArrayList<Integer> rc = new ArrayList<>();
        try {
            rc = (ArrayList<Integer>) em.createNativeQuery("select distinct notenart_id from noten where studienfach_id = " + idStudienfach).getResultList();
        } catch (Exception ex) {
//            ex.printStackTrace();   // schlecht wird nicht angezeigt
            throw new RuntimeException(ex); //Naja

        }

        return rc;
    }

    /**
     * @author max Erzeugt ein Objekt der Klasse Statistik
     * @param idStudienfach
     * @return ein Objekt der Klasse Statistik
     */
    @Override
    public List<Statistik> getStatistik(int idStudienfach) {
        List<Statistik> rc = new ArrayList<>();

        List<Noten> notenListe = this.dbAbfrageAllerNoten(idStudienfach); //Liefert sortierte NotenListe, aber nicht unterschieden nach Art
        for (int i : this.getIDsNotenarten(idStudienfach)) {
            ArrayList<Noten> temp = new ArrayList<>();
            for (Noten noten : notenListe) {
                if (noten.getNotenartId().getIdNotenart() == i) {
                    temp.add(noten);
                }
            }
            //Alter Code
//        for (int i = 0; i < anzahl; i++) {
//            ArrayList<Noten> temp = new ArrayList<>();
//            for (Noten noten : notenListe) {
//                if (noten.getNotenartId().getIdNotenart() == i) {
//                    temp.add(noten);
//                }
//            }
//            liste.add(temp);
            double aritmetischesMittel = this.berechneArithmetischesMittel(temp);
            int median = this.berechneMedian(temp);
            double varianz = this.berechneVarianz(temp, aritmetischesMittel);
            double standardAbweichung = this.berechneStandardabweichung(varianz);
            Noten tempNote = temp.get(0);
            Statistik stat = new Statistik(aritmetischesMittel, standardAbweichung, median, varianz, temp.get(temp.size() - 1).getNote(), tempNote.getNote(), tempNote.getStudienfachId(), tempNote.getNotenartId());
            rc.add(stat);
        }
        logBerechnung.info(rc.toString());
        return rc;
    }

    /**
     * Von Christoph angefragt, da man nun flexibler die Statistik erzeugen kann
     * -> ist performancetechnisch schlechter -> Deprecated!
     *
     * @author max Erzeugt ein Objekt der Klasse Statistik
     * @param notenListe
     * @return ein Objekt der Klasse Statistik
     */
    @Override
    @Deprecated
    public Statistik getStatistik(List<Noten> notenListe) {
        double aritmetischesMittel = this.berechneArithmetischesMittel(notenListe);
        int median = this.berechneMedian(notenListe);
        double varianz = this.berechneVarianz(notenListe, aritmetischesMittel);
        double standardAbweichung = this.berechneStandardabweichung(varianz);
        int minMax[] = this.getMinMaxNoten(notenListe);
        return new Statistik(aritmetischesMittel, standardAbweichung, median, varianz, minMax[1], minMax[0], null, null);
    }

}
