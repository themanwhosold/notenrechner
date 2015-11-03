/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import com.sun.jmx.snmp.UserAcl;
import de.hof.se2.entity.Noten;
import de.hof.se2.sessionBean.BerechnungNotenLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    @Current Document doc;
    @LoggedIn User user;
    @PersistenceContext
    EntityManager em;

    /**
     * Creates a new instance of OutForStudents
     */
    public OutForStudents() {
    }

    /**
     * Gibt eine Liste der Noten für den jeweiligen Studierenden zurück
     * @author markus
     * @version 0.1
     * @since 03.11.2015
     * @param matrikelNr
     * @return Liste der Noten für den jeweiligen Studenten
     */
    @Named
    public List<Noten> getAllNotenForStudent() {
        List<Noten> liste_noten_student = new ArrayList<Noten>();
        liste_noten_student = (List<Noten>) em.createNativeQuery("select * from noten where Matrikelnr = " + user.getUsername, Noten.class).getResultList();
        return liste_noten_student;
    }
    
    @EJB
    BerechnungNotenLocal bnl;
    
    public String getHallo() {
        String a = bnl.getHello();
        return a;
    }

}
