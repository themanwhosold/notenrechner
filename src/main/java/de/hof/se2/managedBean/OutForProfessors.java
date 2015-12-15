/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
import de.hof.se2.entity.Studienfaecher;
import de.hof.se2.sessionBean.BerechnungNotenLocal;
import de.hof.se2.sessionBean.StatistikBeanLocal;
import de.hof.se2.logik.Statistik;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.w3c.dom.Document;

/**
 * Managed Bean mit der die Funktionalität für Dozenten erzeugt wird
 *
 * @author Christoph
 * @version 0.1
 * @since 10.11.2015
 */
@Named(value = "outForProfessors")
@Dependent
public class OutForProfessors implements Serializable {

    @Default
    Document doc;
    @LoggedIn
    User user;

    //    @Current Document doc;
//    @LoggedIn User user;
    @EJB
    private BerechnungNotenLocal berechnungNoten;

    @EJB
    private StatistikBeanLocal statistikBeanLocal;

    @PersistenceContext
    EntityManager em;

    /**
     * Creates a new instance of OutForProfessors
     */
    public OutForProfessors() {
    }

    /**
     * Klasse um ein Objekt vom Typ Personen zurück zu liefern um in der Ausgabe
     * einige Parameter gleich bei der Hand zu haben
     *
     * @author Christoph
     * @version 0.1
     * @since 10.11.2015
     * @param Dozent_id
     * @return Objekt vom Typ "Personen" zu der jeweiligen PersnenId.
     *
     *
     */
    public Personen getProfessor(int Dozent_id) {
        // Die Personen sind unique, deshalb kann hier ohne Bedenken das erste Element aus der Mange genommen werden, keine schöne Lösung
        // aber derzeit die stressfreiste
        // To do: 
        // - andere Lösung suchen
        List<Personen> person = em.createNamedQuery("Personen.findByIdPersonen", Personen.class).setParameter("idPersonen", Dozent_id).getResultList();
        return person.get(0);
    }

    /**
     * Erzeugt Notenliste für einen Professor
     * @param dozentID Professor, dem die Noten gehören
     * @return Notenliste des Professors
     */
    @Named
    public List<Noten> notenListByProfessor(int dozentID) {

        List<Noten> notenList = em.createNativeQuery("select noten.* from noten, studienfaecher, personen where noten.studienfach_id = studienfaecher.idStudienfach and personen.idPersonen = studienfaecher.dozent_id and personen.idPersonen = " + dozentID, Noten.class).getResultList();

//        Noten get = notenList.get(0);
        //  List<Noten> liste_noten_professor  = (List<Noten>) em.createNativeQuery("select noten.* from noten, studienfaecher, personen where noten.studienfach_id= studienfaecher.idStudienfach and personen.idPersonen = studienfaecher.dozent_id and personen.idPersonen=" + person.getIdPersonen(), Noten.class).getResultList();
        return notenList;

    }
    
    /**
     * Erzeugt Liste der Studienfächer des übergebenen Dozenten
     * @param dozentID Dozent, dessen Studienfachliste erzeugt werden soll
     * @return  Liste von Studienfächern
     */
    public List <Studienfaecher>  StudienfaecherListByProfessor (int dozentID){
        
        List <Studienfaecher> studienfaecherList ;
        studienfaecherList = em.createNativeQuery(" select distinct studienfaecher.* from noten, studienfaecher, personen where noten.studienfach_id = studienfaecher.idStudienfach and personen.idPersonen = studienfaecher.dozent_id and studienfaecher.dozent_id = " + dozentID, Studienfaecher.class).getResultList();
        return studienfaecherList;
    }

    /**
     * Erzeugt die Noten eines Studienfaches für einen spezifischen Dozenten
     * @param dozentID ID des Dozenten, dem die Notenliste gehören soll
     * @param studienfachID ID des Studienfaches, für das die Notenliste erzeugt werden soll
     * @return Notenliste eines Studienfaches für einen spezifischen Dozenten
     */
    public List <Noten> notenListByProfessorStudienfach (int dozentID, int studienfachID){
        
        List<Noten> notenList;
        notenList = em.createNativeQuery("select noten.* from noten, studienfaecher, personen where noten.studienfach_id = studienfaecher.idStudienfach and personen.idPersonen = studienfaecher.dozent_id and personen.idPersonen = " + dozentID + " and studienfaecher.idStudienfach = " + studienfachID + " order by noten.notenart_id, noten.Matrikelnr", Noten.class).getResultList();
        
        return notenList;
    }

    /**
     * Gibt den PRofessor aus der Datenbank zurück für den die ID angegeben wurde
     * @author max
     * @param personId
     * @return Person, in diesem Fall der Professor
     */

    @Named
    @Deprecated
    public Personen getPerson(int personId) {
        List person = em.createNativeQuery("select * from personen where idPersonen = " + personId, Personen.class).getResultList();
        return (Personen) person.get(0);
    }
    
    /**
     * Gibt eine Liste von Statistik Objekte zurueck, die nach Notenart unterscheiden 
     * @author Maximilian Schreiber
     * @param idStudienfach
     * @return List<Statistik>
     */
    @Named
    public List<Statistik> getStatistik(int idStudienfach) {
        return this.statistikBeanLocal.getStatistik(idStudienfach);
    }
}
