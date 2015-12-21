/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.test;

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

    public double getArithmetischesMittel() {
        return arithmetischesMittel;
    }

    public double getStandardabweichung() {
        return standardabweichung;
    }

    public int getMedian() {
        return median;
    }

    public double getVarianz() {
        return varianz;
    }

    public int getMaxNote() {
        return maxNote;
    }

    public int getMinNote() {
        return minNote;
    }

    public Studienfaecher getStudienfachID() {
        return this.studienfach;
    }

    public Notenart getNotenartID() {
        return this.notenart;
    }

    @Override
    public String toString() {
        return "Statistik{" + "arithmetischesMittel=" + arithmetischesMittel + ", standardabweichung=" + standardabweichung + ", median=" + median + ", varianz=" + varianz + ", maxNote=" + maxNote + ", minNote=" + minNote + ", studienfachID=" + studienfach.getIdStudienfach() + ", notenartID=" + notenart.getIdNotenart() + '}';
    }

    
   
    
}
