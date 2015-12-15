/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

import de.hof.se2.entity.Noten;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasse repraesentiert die Endnote mit der Endnote, der Zwischenpruefungsnote,
 * der Note der Leistungsnachweise und den dazugehoerigen Einzelnoten
 * (List<Noten>)
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
    private double noteMultiGewichtung;
    private boolean mitWunschnoten;
    private boolean istGueltig;

    /**
     *
     * @param endnote
     * @param leistungsnachweisnote
     * @param zwischenpruefungsnote
     * @param notenListe
     * @param summeGewichtung
     * @param summeNoten
     * @param mitWunschnoten
     * @param istGueltig
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
        this.noteMultiGewichtung = summeNoten;
        this.mitWunschnoten = mitWunschnoten;
        this.istGueltig = istGueltig;
    }

    /**
     *
     * @return
     */
    public double getEndnote() {
        return endnote;
    }

    /**
     *
     * @param endnote
     */
    public void setEndnote(double endnote) {
        this.endnote = endnote;
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
    public Zwischenpruefungsnote getZwischenpruefungsnote() {
        return zwischenpruefungsnote;
    }

    /**
     *
     * @param zwischenpruefungsnote
     */
    public void setZwischenpruefungsnote(Zwischenpruefungsnote zwischenpruefungsnote) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
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
    @Override
    public String toString() {
        return "Endnote{" + "endnote=" + endnote + ", leistungsnachweisnote=" + leistungsnachweisnote + ", zwischenpruefungsnote=" + zwischenpruefungsnote + ", notenListe.size()=" + notenListe.size() + ", summeGewichtung=" + summeGewichtung + ", noteMultiGewichtung=" + noteMultiGewichtung + ", mitWunschnoten=" + mitWunschnoten + ", istGueltig=" + istGueltig + '}';
    }

    /**
     *
     * @return
     */
    public double getNoteMultiGewichtung() {
        return noteMultiGewichtung;
    }

    /**
     *
     * @param noteMultiGewichtung
     */
    public void setNoteMultiGewichtung(double noteMultiGewichtung) {
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
