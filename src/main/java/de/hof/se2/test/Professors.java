/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.test;

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
 *
 * @author Christoph
 */
public class Professors implements Serializable {
    
    @PersistenceContext
    EntityManager em;
    
    private Personen person;
    
    
    public Professors(Personen person) {
        this.person = person;
    }

    public Personen getPerson() {
        return person;
    }

    public void setPerson(Personen person) {
        this.person = person;
    }
    
    /**
     *
     * @param person
     * @return
     */
    @Named
   public List<Noten> getNotenlistByDozentId (Personen person) {
        
       
        List<Noten> liste_noten_professor  = (List<Noten>) em.createNativeQuery("select noten.* from noten, studienfaecher, personen where noten.studienfach_id= studienfaecher.idStudienfach and personen.idPersonen = studienfaecher.dozent_id and personen.idPersonen=" + person.getIdPersonen(), Noten.class).getResultList();
       return liste_noten_professor;
        
    }
    
    
    @XmlTransient
    public List<Noten> getNotenListByProfessor() {
       return person.getNotenList();
    }
    

}
