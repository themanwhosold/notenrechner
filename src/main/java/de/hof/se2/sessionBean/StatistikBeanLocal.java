/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.entity.Noten;
import de.hof.se2.test.Statistik;
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
     *
     * @param idStudienfach
     * @return
     */
    public List<Statistik> getStatistik(int idStudienfach);

    /**
     *
     * @param notenListe
     * @return
     */
    public Statistik getStatistik(List<Noten> notenListe);

    /**
     *
     * @param idStudienfach
     * @return
     */
    public int getAnzahlNotenArten(int idStudienfach);
}
