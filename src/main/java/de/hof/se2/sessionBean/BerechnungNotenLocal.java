/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.eigeneNoten.BerechneteNoten;
import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
import de.hof.se2.entity.Noten;
import javax.ejb.Local;

/**
 *
 * @author markus
 */
@Local
public interface BerechnungNotenLocal {

    /**
     *
     * @param idStudienfach
     * @return
     */
    public double getArithmethischesMittel(int idStudienfach);

    /**
     *
     * @param idStudienfach
     * @return
     */
    public double getStandardabweichung(int idStudienfach);

    /**
     *
     * @param idStudienfach
     * @return
     */
    public int getMedian(int idStudienfach);

    /**
     *
     * @param idStudienfach
     * @return
     */
    public double getVarianz(int idStudienfach);

    /**
     *
     * @param matrikelNr
     * @return
     */
    public Endnote getEndnote(int matrikelNr);

    /**
     *
     * @param matrikelNr
     * @return
     */
    public double getWunschEndnote(int matrikelNr);
//    public Zwischenpruefungsnote getNoteGrundstudium(int matrikelNr);
//    public String getHello();

    /**
     *
     * @param matrikelNr
     * @return
     */
    public BerechneteNoten getBerechneteNoten(int matrikelNr);

    /**
     *
     * @param note
     * @param endnote
     * @return
     */
    public double getRelativeGewichtung(Noten note, Endnote endnote);
    
}
