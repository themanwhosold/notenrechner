/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

/**
 * Klasse dient zur Berechnung der End- bzw. Zwischenpruefungsnote -> Siehe
 * Verwendung in der BerechnungNoten Bean
 *
 * @author max
 */
public class BerechneteWerte {

    private long summeGewichtung;
    private long summeNoten;
    private long anzahlLeistungsnachweise;
    private long summeLeistungsnachweise;
    private boolean mitWunschnoten;
    private boolean erfolgreichGerechnet;

    /**
     * Konstrutor zum setzen aller berechneten Werte
     * @param summeGewichtung die Summe aller Gewichtungen
     * @param summeNoten die Summe aller Noten
     * @param anzahlLeistungsnachweise die Anzahl aller Leistungsnachweise
     * @param summeLeistungsnachweise die Summe aller Leistungsnachweise
     * @param mitWunschnoten es sind Wunschnoten angegeben worden
     * @param erfolgreichGerechnet Berechnung wurde erfolgreich abgeschlossen
     */
    public BerechneteWerte(long summeGewichtung, long summeNoten, long anzahlLeistungsnachweise, long summeLeistungsnachweise, boolean mitWunschnoten, boolean erfolgreichGerechnet) {
        this.summeGewichtung = summeGewichtung;
        this.summeNoten = summeNoten;
        this.anzahlLeistungsnachweise = anzahlLeistungsnachweise;
        this.summeLeistungsnachweise = summeLeistungsnachweise;
        this.mitWunschnoten = mitWunschnoten;
        this.erfolgreichGerechnet = erfolgreichGerechnet;
    }

    /**
     * Holt die Gesamtsumme der Gewichtung
     * @return Longwert, Gewichtungssumme
     */
    public long getSummeGewichtung() {
        return summeGewichtung;
    }

    /**
     * setzt die Gesamtgewichtung auf den übergebenen Parameter
     * @param summeGewichtung Longwert zum setzen der Gesamtgewichtung
     */
    public void setSummeGewichtung(long summeGewichtung) {
        this.summeGewichtung = summeGewichtung;
    }

    /**
     * Summe aller Noten holen
     * @return Summe der Noten wird als Long zurückgegeben
     */
    public long getSummeNoten() {
        return summeNoten;
    }

    /**
     * Summe aller Noten setzen
     * @param summeNoten longwert der zu setzenden Summe
     */
    public void setSummeNoten(long summeNoten) {
        this.summeNoten = summeNoten;
    }

    /**
     * Die Anzahl der Gesamten Leistungsnachweise wird geholt. Du diese wird die Summe der Leistungsnachweise geteilt
     * @return longwert mit Anzahl der Leistungsnachweise. Durch diese wird die Summer der Leistungsnachweise geteilt
     */
    public long getAnzahlLeistungsnachweise() {
        return anzahlLeistungsnachweise;
    }

    /**
     * Setzt Anzahl Leistungsnachweise auf den übergebenen Wert. Durch diesen wird die Summe geteilt
     * @param anzahlLeistungsnachweise Durch diesen Wert wird die Summe der Leistungsnachweise geteilt
     */
    public void setAnzahlLeistungsnachweise(long anzahlLeistungsnachweise) {
        this.anzahlLeistungsnachweise = anzahlLeistungsnachweise;
    }

    /**
     * Holt Summe der Leistungsnachweise. Muss noch durch Anzahl geteilt werden
     * @return Gesamtsumme aller Notenwerte der Leistungsnachweise
     */
    public long getSummeLeistungsnachweise() {
        return summeLeistungsnachweise;
    }

    /**
     * Setzt Summe der Noten der Leistungsnachweise, muss noch durch Anzahl geteilt werden
     * @param summeLeistungsnachweise Setzt die Summe der Leistungsnachweisnoten auf den Parameter
     */
    public void setSummeLeistungsnachweise(long summeLeistungsnachweise) {
        this.summeLeistungsnachweise = summeLeistungsnachweise;
    }

    /**
     * Der Student hat Wunschnoten angegeben, diese werden zur berechnung herangezogen
     * @return Wunschnoten sind gesetzt oder nicht
     */
    public boolean isMitWunschnoten() {
        return mitWunschnoten;
    }

    /**
     * Bestimmt ob Wunschnoten angegeben wurden, die zur berechnung herangezogen werden müssen
     * @param mitWunschnoten Wurden Noten vom Studenten gesetzt oder nicht?
     */
    public void setMitWunschnoten(boolean mitWunschnoten) {
        this.mitWunschnoten = mitWunschnoten;
    }

    /**
     * Überprüft ob alle berechnungen erfolgreich waren
     * @return Wert gibt an ob Noten erfolgreich berechnet wurden
     */
    public boolean isErfolgreichGerechnet() {
        return erfolgreichGerechnet;
    }

    /**
     * Setzt erfolgreiche berechnung auf true oder false
     * @param erfolgreichGerechnet bestimmt ob Berechnung der Noten erfolgreich war oder nicht
     */
    public void setErfolgreichGerechnet(boolean erfolgreichGerechnet) {
        this.erfolgreichGerechnet = erfolgreichGerechnet;
    }

    /**
     * Tostring gibt alle Berechneten Werte aus
     * @return String der berechneten Werte
     */
    @Override
    public String toString() {
        return "BerechneteWerte{" + "summeGewichtung=" + summeGewichtung + ", summeNoten=" + summeNoten + ", anzahlLeistungsnachweise=" + anzahlLeistungsnachweise + ", summeLeistungsnachweise=" + summeLeistungsnachweise + ", mitWunschnoten=" + mitWunschnoten + ", erfolgreichGerechnet=" + erfolgreichGerechnet + '}';
    }

    
    
    
    
}
