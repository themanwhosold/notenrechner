/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
import de.hof.se2.sessionBean.BerechnungNotenLocal;
import de.hof.se2.sessionBean.StatistikBeanLocal;
import de.hof.se2.test.Statistik;
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
 * Managed Bean mit der die Funktionalität für Studierende erzeugt wird
 *
 * @author markus
 * @version 0.2
 * @since 09.11.2015
 */
@Named(value = "outForStudents")
@Dependent

public class OutForStudents implements Serializable {

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
     * Creates a new instance of OutForStudents
     */
    public OutForStudents() {
    }

    /**
     * Gibt eine Liste der Noten für den jeweiligen Studierenden zurück
     * 
     * @author markus
     * @version 0.3
     * @since 10.11.2015
     * @param matrikelNr
     * @return Liste der Noten für den jeweiligen Studenten
     * @deprecated Weil auf der JSF Seite nur noch mit einem Personen Objekt gearbeitet wird und die Notenliste direkt aus dem Objekt aufgerufen werden kann
     */
    @Deprecated
    @Named
    public List<Noten> getAllNotenForStudent(int matrikelNr) {
        /* Alte Version ohne Named Query:
        List<Noten> liste_noten_student = new ArrayList<Noten>();
        liste_noten_student = (List<Noten>) em.createNativeQuery("select * from noten where Matrikelnr = " + matrikelNr, Noten.class).getResultList();
        return liste_noten_student;
        Neue Version:
         */
        Personen person = this.getStudent(matrikelNr);
        return person.getNotenList();
    }

    /**
     * Klasse um ein Objekt vom Typ Personen zurück zu liefern um in der Ausgabe
     * einige Parameter gleich bei der Hand zu haben
     *
     * @author markus
     * @version 0.1
     * @since 09.11.2015
     * @param matrikelNr
     * @return Objekt vom Typ "Personen" zu der jeweiligen Matrikelnr.
     */
    public Personen getStudent(int matrikelNr) {
        // Die Personen sind unique, deshalb kann hier ohne Bedenken das erste Element aus der Mange genommen werden, keine schöne Lösung
        // aber derzeit die stressfreiste
        // To do: 
        // - andere Lösung suchen
        List<Personen> person = em.createNamedQuery("Personen.findByIdPersonen", Personen.class).setParameter("idPersonen", matrikelNr).getResultList();
        return person.get(0);
    }
    /**
     * Methode um Änderungen an den Wunschnoten in die DB zu schreiben
     * @param matrikelNr 
     */
    public void setStudent(int matrikelNr) {
        
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

    public String getHallo() {
        String a = berechnungNoten.getHello();
        return a;
    }
    
    @Named
    public Endnote getEndnote(int personId){
        return this.berechnungNoten.getEndnote(personId);
    }
    
    @Named
    public double getWunschEndnote(int personId){
        return this.berechnungNoten.getWunschEndnote(personId);
    }

    @Named
    public Personen getPerson(int personId) {
        List<Personen> liste = em.createNativeQuery("select * from personen where idPersonen = " + personId, Personen.class).getResultList();
        return liste.get(0);
    }
    
    @Named
    @Deprecated
    public Statistik getStatistik(List<Noten> notenListe) {
        return this.statistikBeanLocal.getStatistik(notenListe);
    }
    
    @Named
    public Zwischenpruefungsnote getZwischenpruefungsnote(int personID){
        return this.berechnungNoten.getNoteGrundstudium(personID);
    }
    
}
