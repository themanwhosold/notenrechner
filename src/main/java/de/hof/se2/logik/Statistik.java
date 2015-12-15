/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.logik;

import de.hof.se2.entity.Notenart;
import de.hof.se2.entity.Studienfaecher;

/**
 * Stellt eine Statistik dar mit arithmetischesMittel, standardabweichung,
 * median und varianz, Beste und schlechteste Note (max-/minNote)
 *
 * @author max
 * @version 0.1
 * @since 08.11.2015
 */
public class Statistik {

    private double arithmetischesMittel;
    private double standardabweichung;
    private int median;
    private double varianz;
    private int maxNote;
    private int minNote;
    private Studienfaecher studienfach;
    private Notenart notenart;

    /**
     * Erzeungt eine Staristik inklusive aller Werte, die für eine Studienfach berechnet werden können
     * @param arithmetischesMittel arithmetisches Mittel eines Studienganges
     * @param standardabweichung Standardabweichung eines Studienganges 
     * @param median Median eines Studienganges
     * @param varianz Varaianz der Werte
     * @param maxNote Höchste Note
     * @param minNote Kleinste Note 
     * @param studienfach Das Studienfach für das die berechneten Werte Gelten
     * @param notenart Leistungsnachweis oder Prüfung
     */
    public Statistik(double arithmetischesMittel, double standardabweichung, int median, double varianz, int maxNote, int minNote, Studienfaecher studienfach, Notenart notenart) {
        this.arithmetischesMittel = arithmetischesMittel;
        this.standardabweichung = standardabweichung;
        this.median = median;
        this.varianz = varianz;
        this.maxNote = maxNote;
        this.minNote = minNote;
        this.studienfach = studienfach;
        this.notenart = notenart;
    }

    /**
     * Holt das Artihmetische Mittel eines Studienfaches
     * @return Artithmetisches Mittel eines Studienfaches
     */
    public double getArithmetischesMittel() {
        return arithmetischesMittel;
    }

    /**
     * Holt Standardabweichung eines Studienfaches ab
     * @return Standardabeweichung von Noten eines Studienfaches
     */
    public double getStandardabweichung() {
        return standardabweichung;
    }

    /**
     * Holt MEdian eines Studienfaches ab
     * @return Median des jeweiligen Studienfaches
     */
    public int getMedian() {
        return median;
    }

    /**
     * Holt Varianz des jeweiligen Studienfaches ab
     * @return Varianz des Studienfaches
     */
    public double getVarianz() {
        return varianz;
    }

    /**
     * Holt die Höchste Punktzahl eines Studienfaches ab
     * @return Höchste Note
     */
    public int getMaxNote() {
        return maxNote;
    }

    /**
     * Holt Minimale Note eines Studienfaches ab
     * @return kleinste Note eines Studienfaches
     */
    public int getMinNote() {
        return minNote;
    }

    /**
     * Gibt das Studienfach zurück, für welches die berechneten Werte gelten
     * @return Studienfach ID so wie es in der Datenbank steht
     */
    public Studienfaecher getStudienfachID() {
        return this.studienfach;
    }

    /**
     * Gibt die Notenart zurück, für die die berechneten Werte gelten
     * @return Notenart, Leistungsnachweis, Note oder Seminararbeit
     */
    public Notenart getNotenartID() {
        return this.notenart;
    }

    /**
     * Gibt die komplette Statistik eines Studienfaches als String zurück
     * @return String der Statistik eines Studienfaches
     */
    @Override
    public String toString() {
        return "Statistik{" + "arithmetischesMittel=" + arithmetischesMittel + ", standardabweichung=" + standardabweichung + ", median=" + median + ", varianz=" + varianz + ", maxNote=" + maxNote + ", minNote=" + minNote + ", studienfachID=" + studienfach.getIdStudienfach() + ", notenartID=" + notenart.getIdNotenart() + '}';
    }

    
   
    
}
