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

    public BerechneteWerte(long summeGewichtung, long summeNoten, long anzahlLeistungsnachweise, long summeLeistungsnachweise, boolean mitWunschnoten, boolean erfolgreichGerechnet) {
        this.summeGewichtung = summeGewichtung;
        this.summeNoten = summeNoten;
        this.anzahlLeistungsnachweise = anzahlLeistungsnachweise;
        this.summeLeistungsnachweise = summeLeistungsnachweise;
        this.mitWunschnoten = mitWunschnoten;
        this.erfolgreichGerechnet = erfolgreichGerechnet;
    }

    public long getSummeGewichtung() {
        return summeGewichtung;
    }

    public void setSummeGewichtung(long summeGewichtung) {
        this.summeGewichtung = summeGewichtung;
    }

    public long getSummeNoten() {
        return summeNoten;
    }

    public void setSummeNoten(long summeNoten) {
        this.summeNoten = summeNoten;
    }

    public long getAnzahlLeistungsnachweise() {
        return anzahlLeistungsnachweise;
    }

    public void setAnzahlLeistungsnachweise(long anzahlLeistungsnachweise) {
        this.anzahlLeistungsnachweise = anzahlLeistungsnachweise;
    }

    public long getSummeLeistungsnachweise() {
        return summeLeistungsnachweise;
    }

    public void setSummeLeistungsnachweise(long summeLeistungsnachweise) {
        this.summeLeistungsnachweise = summeLeistungsnachweise;
    }

    public boolean isMitWunschnoten() {
        return mitWunschnoten;
    }

    public void setMitWunschnoten(boolean mitWunschnoten) {
        this.mitWunschnoten = mitWunschnoten;
    }

    public boolean isErfolgreichGerechnet() {
        return erfolgreichGerechnet;
    }

    public void setErfolgreichGerechnet(boolean erfolgreichGerechnet) {
        this.erfolgreichGerechnet = erfolgreichGerechnet;
    }

    @Override
    public String toString() {
        return "BerechneteWerte{" + "summeGewichtung=" + summeGewichtung + ", summeNoten=" + summeNoten + ", anzahlLeistungsnachweise=" + anzahlLeistungsnachweise + ", summeLeistungsnachweise=" + summeLeistungsnachweise + ", mitWunschnoten=" + mitWunschnoten + ", erfolgreichGerechnet=" + erfolgreichGerechnet + '}';
    }

    
    
    
    
}
