/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
import de.hof.se2.entity.Noten;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.SessionContext;
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
     * Bei den Berechnungen der Zwischen- bzw. der Endnote geht alles, 
     * außer die korreckte Berechnung der Leistungsnachweisdurchschnittsnoten
     */
    /**
     * Methode um die Endnote zu berechnen -> funktioniert nur wenn die in der
     * Datenbank abgelegte Einzelgewicht immer relativ zur Endnote ist
     *
     * @author Max
     * @version 0.1
     * @param matrikelNr
     * @since 10.11.2015
     * @return Endnote
     */
    @Override
    public Endnote getEndnote(int matrikelNr) {
        //Personen p = em.createNamedQuery(Personen.findByIdPersonen, Personen.class);
        //em.createNamedQuery(N, resultClass)

//        double rc = 0.;
//        List<Noten> notenListe = em.createNativeQuery("select * from noten where Matrikelnr = " + matrikelNr, Noten.class).getResultList();
//        long summeGewichtung = 0;
//        long summeNoten = 0;
//        for (Noten noten : notenListe) {
//            summeNoten += noten.getEinzelgewicht() * noten.getNote();
//            summeGewichtung += noten.getEinzelgewicht();
//        }
//        rc = (double) summeNoten / (double) summeGewichtung;
//        return rc;
        Zwischenpruefungsnote zwischenpruefungsnote = this.getNoteGrundstudium(matrikelNr);

        int bisGrundstudium = (Integer) em.createNativeQuery("select s.grundstudiumBis from studiengang s, personen p where p.studiengang_id = s.idStudiengang and p.idPersonen = " + matrikelNr).getResultList().get(0);
        List<Noten> notenListe = em.createNativeQuery("select n.* from noten n,studienfaecher s where n.Matrikelnr = " + matrikelNr + " and n.studienfach_id = s.idStudienfach and s.semester > " + bisGrundstudium, Noten.class).getResultList();

        long summeGewichtung = 0;
        long summeNoten = 0;

        long anzahlLeistungsnachweise = 0;
        long summeLeistungsnachweise = 0;
        for (Noten noten : notenListe) {
            summeNoten += noten.getEinzelgewicht() * noten.getNote();
            summeGewichtung += noten.getEinzelgewicht();
            if (noten.getNotenartId().getIdNotenart() == 2) {     //Achtung 2 ist hardcodiert!!!!
                anzahlLeistungsnachweise++;
                summeLeistungsnachweise += noten.getNote();
            }
        }

        // Nicht ganz trivial:
//Alternative zu sout:
//        throw new RuntimeException(
//                "zwischenpruefungsnote: " + zwischenpruefungsnote.getZwischenpruefungsnote() + "   "
//                + "zwischenpruefungsnoteGewichtung: " + zwischenpruefungsnote.getSummeGewichtung() + "  "
//                + "SummeNoten: " + summeNoten + "  "
//                + "Summe Gewichtung: " + summeGewichtung + "   "
//        );
        
        double multi1 = zwischenpruefungsnote.getZwischenpruefungsnote() * zwischenpruefungsnote.getSummeGewichtung();
        double endnote = (multi1 + summeNoten) / (double) (zwischenpruefungsnote.getSummeGewichtung() + summeGewichtung);
        double leistungsnachweisNote = (double) summeLeistungsnachweise / (double) anzahlLeistungsnachweise;

        Endnote rc = new Endnote(endnote, leistungsnachweisNote, zwischenpruefungsnote, notenListe, summeGewichtung, summeNoten);
        return rc;

    }

    /**
     * Methode um die Endnote auf Basis der Wunschnoten zu berechnen
     *
     * @author markus
     * @version 0.1
     * @param matrikelNr
     * @since 17.11.2015
     * @return Endnote
     */
    @Override
    public double getWunschEndnote(int matrikelNr) {
        //Personen p = em.createNamedQuery(Personen.findByIdPersonen, Personen.class);
        //em.createNamedQuery(N, resultClass)
        double rc = 0.;
        List<Noten> notenListe = em.createNativeQuery("select * from noten where Matrikelnr = " + matrikelNr, Noten.class).getResultList();
        long summeGewichtung = 0;
        long summeNoten = 0;
        for (Noten noten : notenListe) {
            summeNoten += noten.getEinzelgewicht() * noten.getWunschnote();
            summeGewichtung += noten.getEinzelgewicht();
        }
        rc = (double) summeNoten / (double) summeGewichtung;
        return rc;
    }

    /**
     * Methode um die Note nach dem Grundstudium zu berechnen
     *
     * @author max
     * @version 0.1
     * @param matrikelNr
     * @since 03.11.2015, 25.11.2015
     * @return Note Grundstudium
     */
    @Override
    public Zwischenpruefungsnote getNoteGrundstudium(int matrikelNr) {
        int bisGrundstudium = (Integer) em.createNativeQuery("select s.grundstudiumBis from studiengang s, personen p where p.studiengang_id = s.idStudiengang and p.idPersonen = " + matrikelNr).getResultList().get(0);
        List<Noten> notenListe = em.createNativeQuery("select n.* from noten n,studienfaecher s where n.Matrikelnr = " + matrikelNr + " and n.studienfach_id = s.idStudienfach and s.semester <= " + bisGrundstudium, Noten.class).getResultList();

        long summeGewichtung = 0;
        long summeNoten = 0;

        long anzahlLeistungsnachweise = 0;
        long summeLeistungsnachweise = 0;
        for (Noten noten : notenListe) {
            summeNoten += noten.getEinzelgewicht() * noten.getNote();
            summeGewichtung += noten.getEinzelgewicht();
            if (noten.getNotenartId().getIdNotenart() == 2) {     //Achtung 2 ist hardcodiert!!!!
                anzahlLeistungsnachweise++;
                summeLeistungsnachweise += noten.getNote();
            }
        }
        double note = (double) summeNoten / (double) summeGewichtung;
        double leistungsnachweisNote = (double) summeLeistungsnachweise / (double) anzahlLeistungsnachweise;
        Zwischenpruefungsnote rc = new Zwischenpruefungsnote(note, leistungsnachweisNote, notenListe, summeGewichtung);
        return rc;
    }

    @Override
    public String getHello() {
        return "Hallo Welt";
    }

}
