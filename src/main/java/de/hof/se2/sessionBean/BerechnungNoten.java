/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.eigeneNoten.BerechneteNoten;
import de.hof.se2.eigeneNoten.BerechneteWerte;
import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
import de.hof.se2.entity.Noten;
import de.hof.se2.logWriter.LogWriter;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

/**
 * Logik für die Berechnung der Noten anhand der in der DB angegebenen
 * Verhältnisse
 *
 * @author markus
 * @version 0.2
 * @since 16.12.2015
 */
@Singleton
@Local(BerechnungNotenLocal.class)
public class BerechnungNoten implements BerechnungNotenLocal, Serializable {
    //Auskommentiert wegen Fehler WFLYEJB0406 Interface nicht gefunden
    //@EJB
    //BerechneteNoten instance;
    @Resource
    SessionContext sessionContext;

    @PersistenceContext
    EntityManager em;

    LogWriter logBerechnungWriter;
    Logger logBerechnung;

    /**
     * Logging für die berechnung der Noten
     *
     * @throws IOException
     */
    public BerechnungNoten() throws IOException {
        //this.logBerechnungWriter = new LogWriter(new File("/home/max/studium/Logging/berechnungNotenLog"),Boolean.TRUE);
        this.logBerechnungWriter = new LogWriter(new File("/home/markus/berechnungNotenLog"), Boolean.TRUE);
        this.logBerechnung = logBerechnungWriter.newLog();
    }

    /**
     * Mathode die zum Testen von BEans notewendig ist
     *
     * @return
     * @deprecated
     */
    @Deployment
    @Deprecated
    public static JavaArchive createDeployment() {

        JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
        jar.addAsResource("test-persistence.xml", "META-INF/persistence.xml");
        jar.addPackage("com.demopack.demoproj");
        jar.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

        return jar;
    }

    /**
     * Erzeugt Arithmetisches Mittel eines Studienfaches
     *
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
     * Holt standardabweichung eines Studienfaches
     *
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
     * Holt MEdian eines Studienfaches
     *
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
     * Holt Varianz eines Studienganges
     *
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
     * Bei den Berechnungen der Zwischen- bzw. der Endnote geht alles, außer die
     * korreckte Berechnung der Leistungsnachweisdurchschnittsnoten
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

        Zwischenpruefungsnote zwischenpruefungsnote = this.getNoteGrundstudium(matrikelNr);

        int bisGrundstudium = zwischenpruefungsnote.getDauerGrundstudiumBisSemester();   //Sparen einer DB Abfrage
        List<Noten> notenListe = em.createNativeQuery("select n.* from noten n,studienfaecher s where n.Matrikelnr = " + matrikelNr + " and n.studienfach_id = s.idStudienfach and s.semester > " + bisGrundstudium, Noten.class).getResultList();

        BerechneteWerte berechneteWerte = this.getBerechneteWerte(notenListe);
        long summeGewichtung = berechneteWerte.getSummeGewichtung();
        long summeNoten = berechneteWerte.getSummeNoten();

        long anzahlLeistungsnachweise = berechneteWerte.getAnzahlLeistungsnachweise();
        long summeLeistungsnachweise = berechneteWerte.getSummeLeistungsnachweise();
        boolean mitWunschnoten = berechneteWerte.isMitWunschnoten();

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
        double leistungsnachweisNote = (double) anzahlLeistungsnachweise / (double) summeLeistungsnachweise;

        Endnote rc = new Endnote(endnote, leistungsnachweisNote, zwischenpruefungsnote, notenListe, summeGewichtung, summeNoten, mitWunschnoten, berechneteWerte.isErfolgreichGerechnet());
//       logBerechnung.info(rc.toString());
        return rc;

    }

    /**
     * Dient zur Vermeidung von Coderedundanz und zur Berechnung der jeweiligen
     * Noten
     *
     * @since 02.12.2015
     * @author Maximilian Schreiber
     * @param notenListe
     * @return
     */
    private BerechneteWerte getBerechneteWerte(List<Noten> notenListe) {
        long summeGewichtung = 0;
        long summeNoten = 0;
        long anzahlLeistungsnachweise = 0;
        long summeLeistungsnachweise = 0;
        boolean mitWunschnoten = false;
        boolean erfolgreichGerechnet = true;

        /**
         * Vier Fallunterscheidungen: 1. Student hat in Fach x eine Note und
         * eine Wunschnote = nur Note relevant 2. Student hat in Fach x eine
         * Note, aber keine Wunschnote = nur Note relevant 3. Student hat in
         * Fach x keine Note, aber dafuer eine Wunschnote = Wunschnote relevant
         * 4. Student hat in Fach x weder eine Note noch eine Wunschnote =
         * Endnotenberechnung nicht moeglich, aber vllt. Grundstudiumsnote
         * berechenbar
         */
        for (Noten noten : notenListe) {
            if (noten.getNote() != null) {      //Note ist nicht null
                //Fall 1 und 2
                summeNoten += noten.getEinzelgewicht() * noten.getNote();
                summeGewichtung += noten.getEinzelgewicht();
                if (noten.getNotenartId().getIdNotenart() == 2) {     //Achtung 2 ist hardcodiert!!!!
                    anzahlLeistungsnachweise += noten.getEinzelgewicht() * noten.getNote();
                    summeLeistungsnachweise += noten.getEinzelgewicht();
                }
            } else if (noten.getWunschnote() != null) { //Note ist null, aber Wunschnote ist nicht null
                //Fall 3
                summeNoten += noten.getEinzelgewicht() * noten.getWunschnote();
                summeGewichtung += noten.getEinzelgewicht();
                mitWunschnoten = true;
                if (noten.getNotenartId().getIdNotenart() == 2) {     //Achtung 2 ist hardcodiert!!!!
                    anzahlLeistungsnachweise += noten.getEinzelgewicht() * noten.getNote();
                    summeLeistungsnachweise += noten.getEinzelgewicht();
                }
            } else {    // Sowohl Note als auch Wunschnote ist Null
                //Fall 4
                erfolgreichGerechnet = false;
//                return null;    //Fehlerzustand
            }

        }

        BerechneteWerte rc = new BerechneteWerte(summeGewichtung, summeNoten, anzahlLeistungsnachweise, summeLeistungsnachweise, mitWunschnoten, erfolgreichGerechnet);
//        logBerechnung.info(rc.toString());
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
    private Zwischenpruefungsnote getNoteGrundstudium(int matrikelNr) {
        int bisGrundstudium = this.getBisGrundstudium(matrikelNr);
        List<Noten> notenListe = em.createNativeQuery("select n.* from noten n,studienfaecher s where n.Matrikelnr = " + matrikelNr + " and n.studienfach_id = s.idStudienfach and s.semester <= " + bisGrundstudium, Noten.class).getResultList();

        BerechneteWerte berechneteWerte = this.getBerechneteWerte(notenListe);
        long summeGewichtung = berechneteWerte.getSummeGewichtung();
        long summeNoten = berechneteWerte.getSummeNoten();
        long anzahlLeistungsnachweise = berechneteWerte.getAnzahlLeistungsnachweise();
        long summeLeistungsnachweise = berechneteWerte.getSummeLeistungsnachweise();
        boolean mitWunschnoten = berechneteWerte.isMitWunschnoten();

        double note = (double) summeNoten / (double) summeGewichtung;
        double leistungsnachweisNote = (double) anzahlLeistungsnachweise / (double) summeLeistungsnachweise;
        Zwischenpruefungsnote rc = new Zwischenpruefungsnote(note, leistungsnachweisNote, notenListe, summeGewichtung, bisGrundstudium, mitWunschnoten, berechneteWerte.isErfolgreichGerechnet());
        return rc;
    }

    /**
     * Gibt als Ergebnis zurück bis zu welchen Semster das Grundstudium geht
     *
     * @author Maximilian Schreiber
     * @since 02.12.2015
     * @param matrikelNr
     * @return
     */
    private int getBisGrundstudium(int matrikelNr) {
        logBerechnung.info("Test"); //nur einer Test des Loggers
        return (Integer) em.createNativeQuery("select s.grundstudiumBis from studiengang s, personen p where p.studiengang_id = s.idStudiengang and p.idPersonen = " + matrikelNr).getResultList().get(0);
    }

    /**
     * Berechnet Noten für einen bestimmten Studenten, Unterscheidung in 4
     * Fälle, je nachdem ob Wunschnoten gesetzt sind oder nicht
     *
     * @param matrikelNr ID Dest Studenten, für den die berechnung durchgeführt
     * werden soll
     * @return Berechnete Noten eines Studenten
     */
    @Override
    public BerechneteNoten getBerechneteNoten(int matrikelNr) {

        /**
         * Vier Fallunterscheidungen: 1. Student hat in Fach x eine Note und
         * eine Wunschnote = nur Note relevant 2. Student hat in Fach x eine
         * Note, aber keine Wunschnote = nur Note relevant 3. Student hat in
         * Fach x keine Note, aber dafuer eine Wunschnote = Wunschnote relevant
         * 4. Student hat in Fach x weder eine Note noch eine Wunschnote =
         * Endnotenberechnung nicht moeglich, aber vllt. Grundstudiumsnote
         * berechenbar
         */
        BerechneteNoten rc;
        rc = this.getNoteGrundstudium(matrikelNr);
        if (rc == null) {
            return null;
        } else {
            rc = this.getEndnote(matrikelNr);
        }

        return rc;
    }

    /**
     * Gibt die Gewichtung der Einzelnote relativ zur Endnote zurueck
     *
     * @author Maximilian Schreiber
     * @param note
     * @param endnote
     * @return
     */
    @Override
    public double getRelativeGewichtung(Noten note, Endnote endnote) {
        return ((note.getEinzelgewicht() / endnote.getSummeGewichtung() + endnote.getZwischenpruefungsnote().getSummeGewichtung()) * 100);
    }

}
