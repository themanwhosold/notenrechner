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

    public Zwischenpruefungsnote(double zwischenpruefungsnote, double leistungsnachweisnote, List<Noten> notenListe, long summeGewichtung) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
        this.leistungsnachweisnote = leistungsnachweisnote;
        this.notenListe = notenListe;
        this.summeGewichtung = summeGewichtung;
        this.noteMultiGewichtung = (long)(this.zwischenpruefungsnote * this.summeGewichtung);
    }

    public double getZwischenpruefungsnote() {
        return zwischenpruefungsnote;
    }

    public void setZwischenpruefungsnote(double zwischenpruefungsnote) {
        this.zwischenpruefungsnote = zwischenpruefungsnote;
    }

    public double getLeistungsnachweisnote() {
        return leistungsnachweisnote;
    }

    public void setLeistungsnachweisnote(double leistungsnachweisnote) {
        this.leistungsnachweisnote = leistungsnachweisnote;
    }

    public List<Noten> getNotenListe() {
        return notenListe;
    }

    public void setNotenListe(List<Noten> notenListe) {
        this.notenListe = notenListe;
    }

    public long getNoteMultiGewichtung() {
        return noteMultiGewichtung;
    }

    @Override
    public String toString() {
        return "Zwischenpruefungsnote{" + "zwischenpruefungsnote=" + zwischenpruefungsnote + ", leistungsnachweisnote=" + leistungsnachweisnote + ", notenListe.size()=" + notenListe.size() + ", summeGewichtung=" + summeGewichtung + ", noteMultiGewichtung=" + noteMultiGewichtung + '}';
    }

    public void setNoteMultiGewichtung(long noteMultiGewichtung) {
        this.noteMultiGewichtung = noteMultiGewichtung;
    }

    public long getSummeGewichtung() {
        return summeGewichtung;
    }

    public void setSummeGewichtung(long summeGewichtung) {
        this.summeGewichtung = summeGewichtung;
    }

}
