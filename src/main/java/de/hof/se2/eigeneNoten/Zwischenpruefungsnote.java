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
    private long noteMultiGewichtung;
    private boolean mitWunschnoten;
    private int bisGrundstudium;
    private boolean istGueltig;

    /**
     *
     * @param zwischenpruefungsnote
     * @param leistungsnachweisnote
     * @param notenListe
     * @param summeGewichtung
     * @param bisGrundstudium
     * @param mitWunschnoten
     * @param istGueltig
     */
    public Zwischenpruefungsnote(double zwischenpruefungsnote, double leistungsnachweisnote, List<Noten> notenListe, long summeGewichtung, int bisGrundstudium, boolean mitWunschnoten, boolean istGueltig) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
        this.leistungsnachweisnote = leistungsnachweisnote;
        this.notenListe = notenListe;
        this.summeGewichtung = summeGewichtung;
        this.noteMultiGewichtung = (long)(this.zwischenpruefungsnote * this.summeGewichtung);
        this.bisGrundstudium = bisGrundstudium;
        this.mitWunschnoten = mitWunschnoten;
        this.istGueltig = istGueltig;
    }

    /**
     *
     * @return
     */
    public double getZwischenpruefungsnote() {
        return zwischenpruefungsnote;
    }

    /**
     *
     * @param zwischenpruefungsnote
     */
    public void setZwischenpruefungsnote(double zwischenpruefungsnote) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
    }

    /**
     *
     * @return
     */
    public double getLeistungsnachweisnote() {
        return leistungsnachweisnote;
    }

    /**
     *
     * @param leistungsnachweisnote
     */
    public void setLeistungsnachweisnote(double leistungsnachweisnote) {
        this.leistungsnachweisnote = leistungsnachweisnote;
    }

    /**
     *
     * @return
     */
    public List<Noten> getNotenListe() {
        return notenListe;
    }

    /**
     *
     * @param notenListe
     */
    public void setNotenListe(List<Noten> notenListe) {
        this.notenListe = notenListe;
    }

    /**
     *
     * @return
     */
    public long getNoteMultiGewichtung() {
        return noteMultiGewichtung;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Zwischenpruefungsnote{" + "zwischenpruefungsnote=" + zwischenpruefungsnote + ", leistungsnachweisnote=" + leistungsnachweisnote + ", notenListe.size()=" + notenListe.size() + ", summeGewichtung=" + summeGewichtung + ", noteMultiGewichtung=" + noteMultiGewichtung + ", mitWunschnoten=" + mitWunschnoten + ", bisGrundstudium=" + bisGrundstudium + ", istGueltig=" + istGueltig + '}';
    }

    /**
     *
     * @param noteMultiGewichtung
     */
    public void setNoteMultiGewichtung(long noteMultiGewichtung) {
        this.noteMultiGewichtung = noteMultiGewichtung;
    }

    /**
     *
     * @return
     */
    public long getSummeGewichtung() {
        return summeGewichtung;
    }

    /**
     *
     * @param summeGewichtung
     */
    public void setSummeGewichtung(long summeGewichtung) {
        this.summeGewichtung = summeGewichtung;
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
    public int getBisGrundstudium() {
        return bisGrundstudium;
    }

    /**
     *
     * @param bisGrundstudium
     */
    public void setBisGrundstudium(int bisGrundstudium) {
        this.bisGrundstudium = bisGrundstudium;
    }

    /**
     *
     * @return
     */
    public boolean isIstGueltig() {
        return istGueltig;
    }

    /**
     *
     * @param istGueltig
     */
    public void setIstGueltig(boolean istGueltig) {
        this.istGueltig = istGueltig;
    }

    
    
}
