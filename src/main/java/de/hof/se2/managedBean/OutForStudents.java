/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.entity.Noten;

import de.hof.se2.sessionBean.BerechnungNotenLocal;
import de.hof.se2.sessionBean.StatistikBeanLocal;
import de.hof.se2.test.Statistik;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.w3c.dom.Document;

/**
 * Managed Bean mit der die Funktionalität für Studierende erzeugt wird
 *
 * @author markus
 * @version 0.1
 * @since 03.11.2015
 */
@Named(value = "outForStudents")
@Dependent

public class OutForStudents implements Serializable {
<<<<<<< HEAD

    @Default
    Document doc;
    @LoggedIn
    UserDaten user;
=======
//    @Current Document doc;
//    @LoggedIn User user;
>>>>>>> bb73ac0d1eaa0cf2450353610f16ca52881bfb40

    @EJB
    private BerechnungNotenLocal berechnungNoten;

    @EJB
    private StatistikBeanLocal statistikBeanLocal;

    @PersistenceContext
    EntityManager em;

    /**
     * Creates a new instance of OutForStudents
     */
    public OutForStudents() {

    }

    /**
     * Gibt eine Liste der Noten für den jeweiligen Studierenden zurück
     *
     * @author markus
     * @version 0.1
     * @since 03.11.2015
     * @param matrikelNr
     * @return Liste der Noten für den jeweiligen Studenten
     */
    @Named
    public List<Noten> getAllNotenForStudent(int matrikelNr) {
        List<Noten> liste_noten_student = new ArrayList<Noten>();
<<<<<<< HEAD
        liste_noten_student = (List<Noten>) em.createNativeQuery("select * from noten where Matrikelnr = " + user.getUsername(), Noten.class).getResultList();
=======
        liste_noten_student = (List<Noten>) em.createNativeQuery("select * from noten where Matrikelnr = " + matrikelNr, Noten.class).getResultList();
>>>>>>> bb73ac0d1eaa0cf2450353610f16ca52881bfb40
        return liste_noten_student;
    }

    /**
     * @author max
     * @param idStudienfach
     * @return Arithmetisches Mittel des Studiengangs aus der berechnungNoten
     * Bean
     */
    @Named
    public double getArithmetischesMittel(int idStudienfach) {
        return this.berechnungNoten.getArithmethischesMittel(idStudienfach);
    }

    /**
     * @author max
     * @param idStudienfach
     * @return Varianz des Studiengangs aus der berechnungNoten Bean
     */
    @Named
    public double getVarianz(int idStudienfach) {
        return this.berechnungNoten.getVarianz(idStudienfach);
    }

    /**
     * @author max
     * @param idStudienfach
     * @return Standardabweichung des Studiengangs aus der berechnungNoten Bean
     */
    @Named
    public double getStandardabweichung(int idStudienfach) {
        return this.berechnungNoten.getStandardabweichung(idStudienfach);
    }

    /**
     * @author max
     * @param idStudienfach
     * @return Median des Studiengangs aus der berechnungNoten Bean
     */
    @Named
    public int getMedian(int idStudienfach) {
        return this.berechnungNoten.getMedian(idStudienfach);
    }

<<<<<<< HEAD
=======
    @Named
    public Statistik getStatistik(int idStudienfach) {

        return this.statistikBeanLocal.getStatistik(idStudienfach);
    }

>>>>>>> bb73ac0d1eaa0cf2450353610f16ca52881bfb40
    public String getHallo() {
        String a = berechnungNoten.getHello();
        return a;
    }

}
