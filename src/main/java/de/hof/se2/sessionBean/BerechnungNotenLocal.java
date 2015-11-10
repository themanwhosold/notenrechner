/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import javax.ejb.Local;

/**
 *
 * @author markus
 */
@Local
public interface BerechnungNotenLocal {


    public double getArithmethischesMittel(int idStudienfach);
    public double getStandardabweichung(int idStudienfach);
    public int getMedian(int idStudienfach);
    public double getVarianz(int idStudienfach);
    public double getEndnote(int matrikelNr);
    public double getNoteGrundstudium(int matrikelNr);
    public String getHello();

    
}
