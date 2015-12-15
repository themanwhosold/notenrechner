/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.logik;

import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Erzeugt für einen spezifischen Dozenten die Notenlisten sowie die Studienfächer, die 
 * er bearbeiten darf
 * @author Christoph
 */
public class Professors implements Serializable {
    
    @PersistenceContext
    EntityManager em;
    
    private Personen person;
    
    /**
     * Erzeugt einen Professor
     * @param person Person der Professor ist
     */
    public Professors(Personen person) {
        this.person = person;
    }

    /**
     * gibt den Professor als Person zurück
     * @return Professor als Person-Objekt
     */
    public Personen getPerson() {
        return person;
    }

    /**
     * Setzt den Professor auf die übergebene Person
     * @param person Der Professor, der gesetzt sein soll
     */
    public void setPerson(Personen person) {
        this.person = person;
    }
    
    /**
     * Gibt eine Notenliste zurück, die alle Noten enthält, für die der Professor zuständig ist
     * @param person Professor, der die Noten managen darf
     * @return Liste aller Noten, die vom PRofessor betreut werden.
     */
    @Named
   public List<Noten> getNotenlistByDozentId (Personen person) {
        
       
        List<Noten> liste_noten_professor  = (List<Noten>) em.createNativeQuery("select noten.* from noten, studienfaecher, personen where noten.studienfach_id= studienfaecher.idStudienfach and personen.idPersonen = studienfaecher.dozent_id and personen.idPersonen=" + person.getIdPersonen(), Noten.class).getResultList();
       return liste_noten_professor;
        
    }
    
    /**
     * Holt die Notenliste eines Professor
     * @return Notenliste des Professors
     */
    @XmlTransient
    public List<Noten> getNotenListByProfessor() {
       return person.getNotenList();
    }
    

}
