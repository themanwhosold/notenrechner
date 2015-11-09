/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.test;

/**
 * Stellt eine Statistik dar mit arithmetischesMittel, standardabweichung,
 * median und varianz
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

    public Statistik(double arithmetischesMittel, double standardabweichung, int median, double varianz) {
        this.arithmetischesMittel = arithmetischesMittel;
        this.standardabweichung = standardabweichung;
        this.median = median;
        this.varianz = varianz;
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

    @Override
    public String toString() {
        return "Statistik{" + "arithmetischesMittel=" + arithmetischesMittel + ", standardabweichung=" + standardabweichung + ", median=" + median + ", varianz=" + varianz + '}';
    }

}
