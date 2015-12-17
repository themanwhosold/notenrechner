/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.eigeneNoten.BerechneteNoten;
import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.entity.Noten;
import javax.ejb.Local;


/**
 * Hilfsbean um SessionBean der berechneten Noten zu erzeugen
 * @author markus
 */
@Local
public interface BerechnungNotenLocal {

    /**
     * Holt Arithmetisches Mittel eines Sturienfaches
     * @param idStudienfach
     * @return Arithmetisches Mittel eines Studienfaches
     */
    public double getArithmethischesMittel(int idStudienfach);

    /**
     * Holt Standardabeweichung eines Studienfaches 
     * @param idStudienfach
     * @return Standardabweichung eines Studienfaches
     */
    public double getStandardabweichung(int idStudienfach);

    /**
     * Holt Median eines Studienfaches 
     * @param idStudienfach
     * @return Median des Studienfachaches
     */
    public int getMedian(int idStudienfach);

    /**
     * Holt Varianz eines Studienfaches
     * @param idStudienfach 
     * @return Varianz des Studienfaches
     */
    public double getVarianz(int idStudienfach);

    /**
     * Holt Endnote eines spezifischen Dozenten
     * @param matrikelNr
     * @return Endnote eines Studenten
     */
    public Endnote getEndnote(int matrikelNr);

    /**
     * Holt Wunschendnote eines Studenten
     * @param matrikelNr
     * @return Wunschendnote eines Studenten
     */
    public double getWunschEndnote(int matrikelNr);
//    public Zwischenpruefungsnote getNoteGrundstudium(int matrikelNr);
//    public String getHello();

    /**
     * Berechnet Noten eines Studenten
     * @param matrikelNr
     * @return Berechnete Noten eines Studenten
     */
    public BerechneteNoten getBerechneteNoten(int matrikelNr);

    /**
     * Erzeugt relative gewichtung zur Endnote für eine spezifische Note
     * @param note Note, deren relative Gewichtung berechnet werden soll
     * @param endnote Endnote, die ausschlaggebend ist
     * @return Doublewert der Relaiven gewichtung einer Note
     */
    public double getRelativeGewichtung(Noten note, Endnote endnote);
    
}
