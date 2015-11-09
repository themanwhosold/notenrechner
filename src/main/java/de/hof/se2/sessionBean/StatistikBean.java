/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.entity.Noten;
import de.hof.se2.test.Statistik;
import java.util.List;
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
public class StatistikBean implements StatistikBeanLocal {

    @Resource
    SessionContext sessionContext;

    @PersistenceContext
    EntityManager em;

    public StatistikBean() {
    }

    /**
     *
     * @param idStudienfach
     * @return List<Noten> -> Noten aus der Datenbank, die zum Studienfach
     * (idStudienfach) gehoeren
     */
    private List<Noten> dbAbfrage(int idStudienfach) {
        List<Noten> liste = null;
        try {
            liste = (List<Noten>) em.createNativeQuery("select n.* from noten n, studienfaecher s where n.studienfach_id = s.idStudienfach and s.idStudienfach = " + idStudienfach, Noten.class).getResultList();
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
     * @author max Wert des Arithmetischen Mittels des Studienfaches
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
     * @author max Wert der Standardabweichung des Studienfaches
     */
    private double berechneStandardabweichung(double varianz) {
//        this.standardabweichung = Math.sqrt(varianz);
        return Math.sqrt(varianz);
    }

    /**
     * @author max den Median des Studiengangs
     */
    private int berechneMedian(List<Noten> notenListe) {
        int median = 0;
        int mitte = notenListe.size() / 2;
        median = notenListe.get(mitte).getNote();
        return median;
    }

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
     * @author max Erzeugt ein Objekt der Klasse Statistik
     * @param idStudienfach
     * @return ein Objekt der Klasse Statistik
     */
    @Override
    public Statistik getStatistik(int idStudienfach) {
        List<Noten> notenListe = this.dbAbfrage(idStudienfach);
        double aritmetischesMittel = this.berechneArithmetischesMittel(notenListe);
        int median = this.berechneMedian(notenListe);
        double varianz = this.berechneVarianz(notenListe, aritmetischesMittel);
        double standardAbweichung = this.berechneStandardabweichung(varianz);

        return new Statistik(aritmetischesMittel, standardAbweichung, median, varianz);
    }

}
