/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

import de.hof.se2.entity.Noten;
import java.util.List;

/**
 * Klasse repraesentiert die Endnote mit der Endnote, der Zwischenpruefungsnote,
 * der Note der Leistungsnachweise und den dazugehoerigen Einzelnoten
 * 
 *
 * @author max
 * @since 25.11.2015
 */
public class Endnote extends BerechneteNoten {

    private double endnote;
    private double leistungsnachweisnote;
    private Zwischenpruefungsnote zwischenpruefungsnote;
    private List<Noten> notenListe;     // Fraglich, ob ich das hier will
    private long summeGewichtung;
    private double summeNoten;
    private boolean mitWunschnoten;
    private boolean istGueltig;

    /**
     * Endnote eines Studenten wird im Gesamten mit allen unterkomponenten gesetzt
     * @param endnote Endnote ist die Gesamtnote eines Studenten
     * @param leistungsnachweisnote Note aller Leistungsnachweise innerhalb des Hauptstudiums
     * @param zwischenpruefungsnote Zwischenprüfungsnote enthält als Objekt alle Noten des Grundstudiums
     * @param notenListe Alle Noten des Hauptstudiums 
     * @param summeGewichtung Gesamtsumme der Geichtung, durch die geteilt werden muss
     * @param summeNoten Die Summe aller Noten des kompletten Studiums
     * @param mitWunschnoten Wunschnoten wurde vom Studenten gesetzt und müssen zur berechnung herangezogen werden
     * @param istGueltig Alle berechneten Werte sind gültig
     */
    public Endnote(double endnote, double leistungsnachweisnote, Zwischenpruefungsnote zwischenpruefungsnote, List<Noten> notenListe, long summeGewichtung, long summeNoten, boolean mitWunschnoten, boolean istGueltig) {
        this.endnote = endnote;
        this.leistungsnachweisnote = leistungsnachweisnote;
        this.zwischenpruefungsnote = zwischenpruefungsnote;
        this.notenListe = notenListe;
        //Geht auch gibt alle Noten zurueck, fraglich was man will (ungetestet):
//        this.notenListe = notenListe;
//        this.notenListe.addAll(this.zwischenpruefungsnote.getNotenListe());
        this.summeGewichtung = summeGewichtung;
        this.summeNoten = summeNoten;
        this.mitWunschnoten = mitWunschnoten;
        this.istGueltig = istGueltig;
    }

    /**
     * Gibt die Endnote des Gesamten Studiums zurück
     * @return Endnote eines Studenten mit allen bisherigen Werten
     */
    public double getEndnote() {
        return endnote;
    }

    /**
     * Setzt Endnote auf den übergebenen Wert
     * @param endnote
     */
    public void setEndnote(double endnote) {
        this.endnote = endnote;
    }

    /**
     * Holt die eingetragenen Leistungsnachweisnoten des Hauptstudiums
     * @return Leistungsnachweisnoten des Hauptstudiums
     */
    public double getLeistungsnachweisnote() {
        return leistungsnachweisnote;
    }

    /**
     * Setzt LEistungsnachweisnote auf den übergebenen Wert
     * @param leistungsnachweisnote
     */
    public void setLeistungsnachweisnote(double leistungsnachweisnote) {
        this.leistungsnachweisnote = leistungsnachweisnote;
    }

    /**
     * Holt die Zwischenprüfungsnote. Dieses Objekt enthält Alle eingetragenen Noten des Grundstudiums
     * @return Zwischenprüfungsnote
     */
    public Zwischenpruefungsnote getZwischenpruefungsnote() {
        return zwischenpruefungsnote;
    }

    /**
     * Setzt Zwischenprüfungsnote auf den Übergebenen Wert
     * @param zwischenpruefungsnote muss alle Werte des Grundstudiums enthalten, die bereits existieren
     */
    public void setZwischenpruefungsnote(Zwischenpruefungsnote zwischenpruefungsnote) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
    }

    /**
     * Notenliste des Hauptstudiums wird geholt
     * @return Liste aller Noten des Hauptstudiums
     */
    public List<Noten> getNotenListe() {
        return notenListe;
    }

    /**
     * Setzt Notenliste auf den übergebenen Wert
     * @param notenListe Liste aller Noten. Muss das Objekt als Note enthalten
     */
    public void setNotenListe(List<Noten> notenListe) {
        this.notenListe = notenListe;
    }

    /**
     * Endnote mit allen Werten wird als String ausgegeben
     * @return String aller Endnotenwerte
     */
    @Override
    public String toString() {
        return "Endnote{" + "endnote=" + endnote + ", leistungsnachweisnote=" + leistungsnachweisnote + ", zwischenpruefungsnote=" + zwischenpruefungsnote + ", notenListe.size()=" + notenListe.size() + ", summeGewichtung=" + summeGewichtung + ", noteMultiGewichtung=" + summeNoten + ", mitWunschnoten=" + mitWunschnoten + ", istGueltig=" + istGueltig + '}';
    }

    /**
     * Holt die richtig gewichteten Noten aus der Gesamtnote
     * @return Summe der richtig gewichteten Noten
     */
    public double getSummeNoten() {
        return summeNoten;
    }

    /**
     * Setzt die Summe der Noten mit ihrere jeweiligen Gwichtung
     * @param summeNoten Dieser Wert entspricht dem späteren Notenwert inklusive Gewichtung
     */
    public void setSummeNoten(double summeNoten) {
        this.summeNoten = summeNoten;
    }

    /**
     * Summe der Gesamtgewichtung aufaddiert. durch diese wird geteilt
     * @return Summe der Gesamtgewichtung durch welche geteilt werden muss
     */
    public long getSummeGewichtung() {
        return summeGewichtung;
    }

    /**
     * Setzt die Gesamtgewichtung durch die später geteilt werden muss
     * @param summeGewichtung Dies entspricht dem Wert durch welchen geteilt werden muss
     */
    public void setSummeGewichtung(long summeGewichtung) {
        this.summeGewichtung = summeGewichtung;
    }

    /**
     * Wunschnoten wurden vom Studenten angegeben und müssen zur berechnung hinzugezogen werden
     * @return Wunschnoten gesetzt
     */
    public boolean isMitWunschnoten() {
        return mitWunschnoten;
    }

    /**
     * Setzt einen Flag ob der Student Wunschnoten angegeben hat
     * @param mitWunschnoten Student hat Wunschnoten angegeben
     */
    public void setMitWunschnoten(boolean mitWunschnoten) {
        this.mitWunschnoten = mitWunschnoten;
    }

    /**
     * Setzt den Wert auf true wenn die Berechnugn erfolgreich war
     * @return Wurden Noten richtig berechnet?
     */ 
    public boolean isIstGueltig() {
        return istGueltig;
    }

    /**
     * Die berechneten Werte sind Gültig
     * @param istGueltig ist true wenn die Berechnung erfolgreich war
     */
    public void setIstGueltig(boolean istGueltig) {
        this.istGueltig = istGueltig;
    }

    
}
