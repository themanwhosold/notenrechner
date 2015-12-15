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
     * Holt Summe
     * @return
     */
    public long getSummeLeistungsnachweise() {
        return summeLeistungsnachweise;
    }

    /**
     *
     * @param summeLeistungsnachweise
     */
    public void setSummeLeistungsnachweise(long summeLeistungsnachweise) {
        this.summeLeistungsnachweise = summeLeistungsnachweise;
    }

    /**
     *
     * @return
     */
    public boolean isMitWunschnoten() {
        return mitWunschnoten;
    }

    /**
     *
     * @param mitWunschnoten
     */
    public void setMitWunschnoten(boolean mitWunschnoten) {
        this.mitWunschnoten = mitWunschnoten;
    }

    /**
     *
     * @return
     */
    public boolean isErfolgreichGerechnet() {
        return erfolgreichGerechnet;
    }

    /**
     *
     * @param erfolgreichGerechnet
     */
    public void setErfolgreichGerechnet(boolean erfolgreichGerechnet) {
        this.erfolgreichGerechnet = erfolgreichGerechnet;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "BerechneteWerte{" + "summeGewichtung=" + summeGewichtung + ", summeNoten=" + summeNoten + ", anzahlLeistungsnachweise=" + anzahlLeistungsnachweise + ", summeLeistungsnachweise=" + summeLeistungsnachweise + ", mitWunschnoten=" + mitWunschnoten + ", erfolgreichGerechnet=" + erfolgreichGerechnet + '}';
    }

    
    
    
    
}
