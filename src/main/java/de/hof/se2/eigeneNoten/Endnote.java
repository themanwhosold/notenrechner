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

    public Endnote(double endnote, double leistungsnachweisnote, Zwischenpruefungsnote zwischenpruefungsnote, List<Noten> notenListe, long summeGewichtung, long summeNoten) {
        this.endnote = endnote;
        this.leistungsnachweisnote = leistungsnachweisnote;
        this.zwischenpruefungsnote = zwischenpruefungsnote;
        this.notenListe = notenListe;
        //Geht auch gibt alle Noten zurueck, fraglich was man will (ungetestet):
//        this.notenListe = notenListe;
//        this.notenListe.addAll(this.zwischenpruefungsnote.getNotenListe());
        this.summeGewichtung = summeGewichtung;
        this.noteMultiGewichtung = summeNoten;
    }

    public double getEndnote() {
        return endnote;
    }

    public void setEndnote(double endnote) {
        this.endnote = endnote;
    }

    public double getLeistungsnachweisnote() {
        return leistungsnachweisnote;
    }

    public void setLeistungsnachweisnote(double leistungsnachweisnote) {
        this.leistungsnachweisnote = leistungsnachweisnote;
    }

    public Zwischenpruefungsnote getZwischenpruefungsnote() {
        return zwischenpruefungsnote;
    }

    public void setZwischenpruefungsnote(Zwischenpruefungsnote zwischenpruefungsnote) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
    }

    public List<Noten> getNotenListe() {
        return notenListe;
    }

    public void setNotenListe(List<Noten> notenListe) {
        this.notenListe = notenListe;
    }

    @Override
    public String toString() {
        return "Endnote{" + "endnote=" + endnote + ", leistungsnachweisnote=" + leistungsnachweisnote + ", zwischenpruefungsnote=" + zwischenpruefungsnote + ", notenListe.size()=" + notenListe.size() + ", summeGewichtung=" + summeGewichtung + ", noteMultiGewichtung=" + noteMultiGewichtung + '}';
    }

    public double getNoteMultiGewichtung() {
        return noteMultiGewichtung;
    }

    public void setNoteMultiGewichtung(double noteMultiGewichtung) {
        this.noteMultiGewichtung = noteMultiGewichtung;
    }

    public long getSummeGewichtung() {
        return summeGewichtung;
    }

    public void setSummeGewichtung(long summeGewichtung) {
        this.summeGewichtung = summeGewichtung;
    }

}
