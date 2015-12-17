/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.entity.Personen;
import de.hof.se2.entity.Studiengang;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.w3c.dom.Document;

/**
 * Managed Bean, die die Funktionalitaet für die Admin Oberflaechen enthaelt
 *
 * @since 16.12.2015
 * @version 0.1
 * @author max
 */
@Named(value = "adminManagedBean")
@RequestScoped
public class AdminManagedBean implements Serializable {

    @Default
    Document doc;
    @LoggedIn
    User user;

//    @Current Document doc;
//    @LoggedIn User user;
//    @EJB
//    private AdminSessionBeanLocal adminBean;
    @PersistenceContext
    EntityManager em;

    private Personen ausgewaehltePerson = null;
    private Studiengang ausgewaehlterStudiengang = null;

    public AdminManagedBean() {
    }

    @Named
    public List<Personen> getAllPersonen() {
        List<Personen> rc = em.createNamedQuery("Personen.findAll", Personen.class).getResultList();
        return rc;
    }

    @Named
    public void valueChanged(ValueChangeEvent e) {
//        Personen p = (Personen)(e.getNewValue());
//           this.ausgewaehltePerson = (Personen) e.getNewValue().getClass().t;
        String s = e.getNewValue().toString(); // ist immer so aufgebaut: de.hof.se2.Personen[ idPersonen=number ]
        String rc = s.substring(32, s.length() - 2);  // Das ist echter rotten Code!
        this.ausgewaehltePerson = em.createNamedQuery("Personen.findByIdPersonen", Personen.class).setParameter("idPersonen", Integer.parseInt(rc)).getResultList().get(0);
//        throw new RuntimeException(ausgewaehltePerson.toString());
    }

    @Named
    public Personen getAusgewaehltePerson() {
        return this.ausgewaehltePerson;
    }

    public void valueStudiengangChanged(ValueChangeEvent e) {
        
//        Personen p = (Personen)(e.getNewValue());
//           this.ausgewaehltePerson = (Personen) e.getNewValue().getClass().t;
        String s = e.getNewValue().toString();
//        throw  new RuntimeException(e.toString());
        String rc = s.substring(38, s.length() - 2);  // Das ist echter rotten Code!
//        this.ausgewaehlterStudiengang = em.createNamedQuery("Studiengang.findByIdStudiengang", Studiengang.class).setParameter("idStudiengang", Integer.parseInt(rc)).getResultList().get(0);
        this.ausgewaehlterStudiengang = (Studiengang) em.createNativeQuery("select * from studiengang where idStudiengang = " + rc, Studiengang.class).getResultList().get(0);
    }

    @Named
    public List<Studiengang> getAlleStudiengaenge() {
        return em.createNamedQuery("Studiengang.findAll", Studiengang.class).getResultList();
    }

}
