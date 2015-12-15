/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

import de.hof.se2.entity.Noten;
import java.util.List;

/**
 * Klasse repraesentiert die Zwischenpruefungsnote mit der Note, der Note der
 * Leistungsnachweise und den dazugehoerigen Einzelnoten (List<Noten>)
 *
 * @author max
 * @since 25.11.2015
 */
public class Zwischenpruefungsnote extends BerechneteNoten {

    private double zwischenpruefungsnote;
    private double leistungsnachweisnote;
    private List<Noten> notenListe;     // Fraglich, ob ich das hier will
    private long summeGewichtung;
    private long summeZPNoteMitGewichtung;
    private boolean mitWunschnoten;
    private int dauerGrundstudiumBisSemester;
    private boolean istGueltig;

    /**
     * Setzt Zwischenprüfungsnote mit allen im Grundstudium existierenden Werten eines Studenten
     * @param zwischenpruefungsnote Die Note die als ZP-NOte berechnet wurde
     * @param leistungsnachweisnote Note der Leistungsnachweise im Grundstudium
     * @param notenListe Liste aller Noten des Grundstudiums
     * @param summeGewichtung Summe der Gewichtungen. Durch diesen Wert muss geteilt werden
     * @param dauerGrundstudiumBisSemester Das Grundstudium dauert bis zum übergebenen Semester
     * @param mitWunschnoten Student hat Wunschnoten eingetragen
     * @param istGueltig Berechnete Zwischenprüfungsnote ist gültig
     */
    public Zwischenpruefungsnote(double zwischenpruefungsnote, double leistungsnachweisnote, List<Noten> notenListe, long summeGewichtung, int dauerGrundstudiumBisSemester, boolean mitWunschnoten, boolean istGueltig) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
        this.leistungsnachweisnote = leistungsnachweisnote;
        this.notenListe = notenListe;
        this.summeGewichtung = summeGewichtung;
        this.summeZPNoteMitGewichtung = (long)(this.zwischenpruefungsnote * this.summeGewichtung);
        this.dauerGrundstudiumBisSemester = dauerGrundstudiumBisSemester;
        this.mitWunschnoten = mitWunschnoten;
        this.istGueltig = istGueltig;
    }

    /**
     * Holt die Zwischenprüfungsnote eines Studenten
     * @return Zwischenprüfungsnote eines Studenten
     */
    public double getZwischenpruefungsnote() {
        return zwischenpruefungsnote;
    }

    /**
     * Setzt die Zwischenprüfungsnote auf den Folgenden Wert
     * @param zwischenpruefungsnote Entspricht der ZP Note eines Studenten
     */
    public void setZwischenpruefungsnote(double zwischenpruefungsnote) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
    }

    /**
     * Note der Leistungsnachweise im Grundstudium
     * @return Note der Leistungsnachweise im GS
     */
    public double getLeistungsnachweisnote() {
        return leistungsnachweisnote;
    }

    /**
     * Setzt Note der LEistungsnachweise auf den übergebenen Wert
     * @param leistungsnachweisnote Entspricht der LEistungsnachweisnote des GS
     */
    public void setLeistungsnachweisnote(double leistungsnachweisnote) {
        this.leistungsnachweisnote = leistungsnachweisnote;
    }

    /**
     * Liste aller Noten des Grundstudiums wird geholt
     * @return Liste aller Noten des Grundstudiums
     */
    public List<Noten> getNotenListe() {
        return notenListe;
    }

    /**
     * Setzt Liste aller Noten des Grundstudiums auf die Übergebene Liste
     * @param notenListe Liste aller Noten des Grundstudiums muss übergeben werden. Muss Noten enthalten
     */
    public void setNotenListe(List<Noten> notenListe) {
        this.notenListe = notenListe;
    }

    /**
     * Summe aller noten der Zwischenprüfung inclusive richtiger Geichtung
     * @return Zwischenprüfungsnote mit Gewichtung
     */
    public long getSummeZPNoteMitGewichtung() {
        return summeZPNoteMitGewichtung;
    }

    /**
     * Zwischenprüfungsnote wird inclusive aller gesetzten Werte als String ausgegeben
     * @return String einer Zwischenprüfungsnote mit den gesetzten Werten
     */
    @Override
    public String toString() {
        return "Zwischenpruefungsnote{" + "zwischenpruefungsnote=" + zwischenpruefungsnote + ", leistungsnachweisnote=" + leistungsnachweisnote + ", notenListe.size()=" + notenListe.size() + ", summeGewichtung=" + summeGewichtung + ", noteMultiGewichtung=" + summeZPNoteMitGewichtung + ", mitWunschnoten=" + mitWunschnoten + ", bisGrundstudium=" + dauerGrundstudiumBisSemester + ", istGueltig=" + istGueltig + '}';
    }

    /**
     * Setzt die Richtig gewichtete Zwischenprüfungsnote auf den übergebenen Wertt
     * @param summeZPNoteMitGewichtung Zwischenprüfungsnote mit richiger Gewichtung
     */
    public void setSummeZPNoteMitGewichtung(long summeZPNoteMitGewichtung) {
        this.summeZPNoteMitGewichtung = summeZPNoteMitGewichtung;
    }

    /**
     * Gibt die Summe der Gewichtungen zurück. Durch diesen Wert muss geteilt werden um die richtig
     * gewerteten Note der Zwischenprüfung zu berechnen
     * @return Summe aller Gewichtungen, durch die geteilt werden muss
     */
    public long getSummeGewichtung() {
        return summeGewichtung;
    }

    /**
     * Setzt die Summe der Gewichtungen aller ZP Noten durch welche geteilt weren muss
     * @param summeGewichtung Wert durch den Die Summe de rNoten geteilt werden muss
     */
    public void setSummeGewichtung(long summeGewichtung) {
        this.summeGewichtung = summeGewichtung;
    }

    /**
     * Student hat wunschnoten gesezt?
     * @return boolean ob Wunschnoten gesetzt
     */
    public boolean isMitWunschnoten() {
        return mitWunschnoten;
    }

    /**
     * Setzt ob Studen Wunschnoten eingetragen hat, die zur berechnung herangezogen werden müssen
     * @param mitWunschnoten wenn Student Wunschnoten eingetragen hat
     */
    public void setMitWunschnoten(boolean mitWunschnoten) {
        this.mitWunschnoten = mitWunschnoten;
    }

    /**
     * Bis inklusive dieses Semesters dauert das Grundstudium
     * @return Bis zu diesem Semster dauer das Grundstudium
     */
    public int getDauerGrundstudiumBisSemester() {
        return dauerGrundstudiumBisSemester;
    }

    /**
     * Setzt dauer des Grundstudiums auf den übergebenen Wert. Bis inclusive des angegebenen Semesters
     * @param dauerGrundstudiumBisSemester bis zu diesem Semester dauert das Grundstudium
     */
    public void setDauerGrundstudiumBisSemester(int dauerGrundstudiumBisSemester) {
        this.dauerGrundstudiumBisSemester = dauerGrundstudiumBisSemester;
    }

    /**
     * Berechneten Werte sind gültig
     * @return Ob die Werte die berechnet wurden gültig sind.
     */
    public boolean isIstGueltig() {
        return istGueltig;
    }

    /**
     * Wenn berechnung aller Werte richtig ist kann auf gültig gesetzt werden
     * @param istGueltig gibt an ob die berechneten Werte rictig sind
     */
    public void setIstGueltig(boolean istGueltig) {
        this.istGueltig = istGueltig;
    }

    
    
}
