/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

import de.hof.se2.entity.Noten;
import java.util.List;

/**
 * Abstrakte Klasse, die Eigenschaften sowohl fuer die Zwischenpruefungsnote als
 * auch die Endnote enthaelt
 *
 * @since 25.11.2015
 * @author max
 */
public abstract class BerechneteNoten {

    private double note;
    private double leistungsnachweisnote;
    private List<Noten> notenListe;
    private long summeGewichtung;
    private double noteMultiGewichtung;

//    abstract long berechnenoteMultiGewichtung();

}
