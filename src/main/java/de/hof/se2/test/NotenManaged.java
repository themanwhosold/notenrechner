/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.test;

import de.hof.se2.entity.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Testklasse um zu überprüfen ob alle Noten aus der Datenbank abgeholt werden können
 * @author markus
 */
@Named(value = "notenManaged")
@SessionScoped
public class NotenManaged implements Serializable {

    @PersistenceContext
    EntityManager em;

    List<Studiengang> a;

    /**
     * Creates a new instance of NotenManaged
     */
    public NotenManaged() {

    }

    /**
     *
     * @return
     */
    @Named
    @Deprecated
    public List<Noten> getAllNoten() {
        List<Noten> rc = new ArrayList<>();
//        rc = em.createNamedQuery("Noten.findAll").getResultList();

        // So sollte es funktionieren, macht es aber nicht:
        rc = (List<Noten>) em.createNativeQuery("select * from noten", Noten.class).getResultList();

//        rc = (List<Noten>) em.createNativeQuery("select * from noten").getResultList();
        return rc;
    }

}
