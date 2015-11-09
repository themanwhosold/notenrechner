/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.entity.Noten;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Logik für die Berechnung der Noten anhand der in der DB angegebenen
 * Verhältnisse
 *
 * @author markus
 * @version 0.1
 * @since 03.11.2015
 */
@Singleton
@Local(BerechnungNotenLocal.class)
public class BerechnungNoten implements BerechnungNotenLocal {

    @Resource
    SessionContext sessionContext;

    @PersistenceContext
    EntityManager em;

    public BerechnungNoten() {
    }

    /**
     * @author max
     * @param idStudienfach
     * @return arithmetisches Mittel des Studienfaches
     */
    @Override
    @Deprecated
    public double getArithmethischesMittel(int idStudienfach) {
        List<Noten> liste = (List<Noten>) em.createNativeQuery("select n.* from noten n, studienfaecher s where n.studienfach_id = s.idStudienfach and s.idStudienfach = " + idStudienfach, Noten.class).getResultList();
        if (liste.size() <= 0) {
            throw new RuntimeException("Fehler es gibt keine Noten zu dem angegebenen Studienfach mit der id " + idStudienfach);
        } else {
            double arithmetischesMittel = 0;
            long summe = 0;
            for (Noten noten : liste) {
                summe += noten.getNote();
            }
            arithmetischesMittel = (double) summe / (double) liste.size();
            return arithmetischesMittel;
        }

    }

    /**
     * @author max
     * @param idStudienfach
     * @return Wert der Standardabweichung des Studienfaches
     */
    @Override
    @Deprecated
    public double getStandardabweichung(int idStudienfach) {

        double varianz = this.getVarianz(idStudienfach);
        double standardabweichung = Math.sqrt(varianz);
        return standardabweichung;
    }

    /**
     * @author max
     * @param idStudienfach
     * @return den Median des Studiengangs
     */
    @Override
    @Deprecated
    public int getMedian(int idStudienfach) {
        List<Noten> liste = (List<Noten>) em.createNativeQuery("select n.* from noten n, studienfaecher s where n.studienfach_id = s.idStudienfach and s.idStudienfach = " + idStudienfach, Noten.class).getResultList();
        if (liste.size() <= 0) {
            throw new RuntimeException("Fehler es gibt keine Noten zu dem angegebenen Studienfach mit der id " + idStudienfach);
        } else {
            int median = 0;
            int mitte = liste.size() / 2;
            median = liste.get(mitte).getNote();
            return median;
        }
    }

    /**
     * @author max
     * @param idStudienfach
     * @return Den Wert der Varianz des Studiengangs
     */
    @Override
    @Deprecated
    public double getVarianz(int idStudienfach) {

        List<Noten> liste = (List<Noten>) em.createNativeQuery("select n.* from noten n, studienfaecher s where n.studienfach_id = s.idStudienfach and s.idStudienfach = " + idStudienfach, Noten.class).getResultList();
        if (liste.size() <= 0) {
            throw new RuntimeException("Fehler es gibt keine Noten zu dem angegebenen Studienfach mit der id " + idStudienfach);
        } else {
            double varianz = 0;
            double zaehler = 0;
            for (Noten noten : liste) {
                double temp = this.getArithmethischesMittel(idStudienfach) - noten.getNote();   //Eigentlich schlecht da nochmal eine Datenbankabfrage gemacht wird
                temp = Math.pow(temp, 2);
                zaehler += temp;
            }
            varianz = zaehler / liste.size();
            return varianz;
        }

    }

    /**
     * Die statistischen Methoden sind inperformant, da jeder fuer sich eine
     * Abfrage aus der Datenbank erzeugt es werden somit keine schon berechneten
     * Werte wiederverwendet Loesung: ueber Membervariablen der Bean -> wurde
     * verbessert
     */
    /**
     * Methode um die Endnote zu berechnen
     *
     * @author markus
     * @version 0.1
     * @param matrikelNr
     * @since 03.11.2015
     * @return Endnote
     */
    @Override
    public long getEndnote(int matrikelNr) {
        //Personen p = em.createNamedQuery(Personen.findByIdPersonen, Personen.class);
        //em.createNamedQuery(N, resultClass)
        return 0L;
    }

    /**
     * Methode um die Note nach dem Grundstudium zu berechnen
     *
     * @author markus
     * @version 0.1
     * @param matrikelNr
     * @since 03.11.2015
     * @return Note Grundstudium
     */
    @Override
    public long getNoteGrundstudium(int matrikelNr) {
        return 0L;
    }

    @Override
    public String getHello() {
        return "Hallo Welt";
    }

}
