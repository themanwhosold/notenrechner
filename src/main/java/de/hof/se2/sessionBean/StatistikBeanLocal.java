/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.entity.Noten;
import de.hof.se2.logik.Statistik;
import java.util.List;

/**
 * Lokales Interface der StatistikBean
 *
 * @author max
 * @version 0.1
 * @since 08.11.2015
 */
public interface StatistikBeanLocal {

    /**
     * Holt Liste der Statistiken eines Studienfaches
     * @param idStudienfach
     * @return Liste der Statistiken eines Studienfaches
     */
    public List<Statistik> getStatistik(int idStudienfach);

    /**
     * Erzeugt Statistik für eine Liste von Noten
     * @param notenListe
     * @return Statistikobjekt für die Notenliste
     */
    public Statistik getStatistik(List<Noten> notenListe);

    /**
     * Holt anzahl der Notenarten aus der DB
     * @param idStudienfach
     * @return Anzahl der Notenarten
     */
    public int getAnzahlNotenArten(int idStudienfach);
}
