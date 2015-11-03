/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *Logik für die Berechnung der Noten anhand der in der DB angegebenen Verhältnisse
 * @author markus
 * @version 0.1
 * @since 03.11.2015
 */
@Singleton
@Local(BerechnungNotenLocal.class)
public class BerechnungNoten implements BerechnungNotenLocal {

    @PersistenceContext
    private EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    /**
     *Methode um die Endnote zu berechnen
     * 
     * @author markus
     * @version 0.1
     * @param matrikelNr
     * @since 03.11.2015
     * @return Endnote
     */
    @Override
    public long getEndnote(int matrikelNr){
        return 0L;
    }

    /**
     *Methode um die Note nach dem Grundstudium zu berechnen
     * 
     * @author markus
     * @version 0.1
     * @param matrikelNr
     * @since 03.11.2015
     * @return Note Grundstudium
     */
    @Override
    public long getNoteGrundstudium(int matrikelNr) {
        return 0L;
    }
}
