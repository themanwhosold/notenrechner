/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.eigeneNoten.BerechneteNoten;
import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
import de.hof.se2.logik.Statistik;
import de.hof.se2.sessionBean.BerechnungNotenLocal;
import de.hof.se2.sessionBean.StatistikBeanLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.w3c.dom.Document;

/**
 * Managed Bean mit der die Funktionalität für Studierende erzeugt wird
 *
 * @author markus
 * @version 0.3
 * @since 14.12.2015
 */
@Named(value = "outForStudents")
@SessionScoped

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

    private Personen student;

    //private Personen student;
    public OutForStudents() {
    }

    /**
     * Creates a new instance of OutForStudents
     *
     * @param matrikelNr
     */
    //public OutForStudents(int matrikelNr) {
    //    student = em.createNamedQuery("Personen.findByIdPersonen", Personen.class).setParameter("idPersonen", matrikelNr).getResultList().get(0);
    //}
    /**
     * Gibt eine Liste der Noten für den jeweiligen Studierenden zurück
     *
     * @author markus
     * @version 0.3
     * @since 10.11.2015
     * @param matrikelNr
     * @return Liste der Noten für den jeweiligen Studenten
     * @deprecated Weil auf der JSF Seite nur noch mit einem Personen Objekt
     * gearbeitet wird und die Notenliste direkt aus dem Objekt aufgerufen
     * werden kann
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
        //List<Personen> person = em.createNamedQuery("Personen.findByIdPersonen", Personen.class).setParameter("idPersonen", matrikelNr).getResultList();

        student = em.find(Personen.class, matrikelNr); //person.get(0);
        return student;
        //return person.get(0);
    }

    /**
     * Methode um Änderungen am Objekt "Student" in die DB zu schreiben
     *
     * @author markus
     * @version 0.2
     * @param student
     * @since 17.12.2015
     * @deprecated Derzeit nicht funktionsfähig
     *
     */
    @Deprecated
    @Transactional
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void setStudent(Personen student) {
    //public void setStudent() {
        //em.persist(student);
        System.out.println(student.getNotenList().toString());
        em.merge(student);
        em.flush();
        /*em.merge(student);
        em.persist(student);
        em.flush();*/

    }

    /**
     * Gibt das Arithmetische Mittel eines Studienfaches zurück
     *
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
     * Holt Varianz des übergebenen Studienfaches
     *
     * @author max
     * @param idStudienfach
     * @return Varianz des Studiengangs aus der berechnungNoten Bean
     */
    @Named
    public double getVarianz(int idStudienfach) {
        return this.berechnungNoten.getVarianz(idStudienfach);
    }

    /**
     * Holt Standardabweichung für das übergebene Studienfach
     *
     * @author max
     * @param idStudienfach
     * @return Standardabweichung des Studiengangs aus der berechnungNoten Bean
     */
    @Named
    public double getStandardabweichung(int idStudienfach) {
        return this.berechnungNoten.getStandardabweichung(idStudienfach);
    }

    /**
     * Holt MEdian des Studienfachs ab
     *
     * @author max
     * @param idStudienfach
     * @return Median des Studiengangs aus der berechnungNoten Bean
     */
    @Named
    public int getMedian(int idStudienfach) {
        return this.berechnungNoten.getMedian(idStudienfach);
    }

    /**
     * Gibt eine Liste von Statistik Objekte zurueck, die nach Notenart
     * unterscheiden
     *
     * @author Maximilian Schreiber
     * @param idStudienfach
     * @return List<Statistik>
     */
    @Named
    public List<Statistik> getStatistik(int idStudienfach) {
        return this.statistikBeanLocal.getStatistik(idStudienfach);
    }

    /**
     * Holt Ednote des Studenten ab
     *
     * @param personId Student
     * @return berechnete Endnote des Studenten
     */
    @Named
    public Endnote getEndnote(int personId) {
        return this.berechnungNoten.getEndnote(personId);
    }

    /**
     * Holt die Endnote mit den Wuschnoten des Studenten ab
     *
     * @param personId Student
     * @return Berechnete Endnote mit Wunschnoten
     */
    @Named
    public double getWunschEndnote(int personId) {
        return this.berechnungNoten.getWunschEndnote(personId);
    }

    /**
     * Holt Person aus der Datenbank, die dem Studenten entspricht aus der
     * Datenbank
     *
     * @param personId Studenten ID
     * @return Person, die eingeloggt ist
     */
    @Named
    public Personen getPerson(int personId) {
        List<Personen> liste = em.createNativeQuery("select * from personen where idPersonen = " + personId, Personen.class).getResultList();
        return liste.get(0);
    }

    /**
     * Erzeugt Statistik für eine Notenliste über die StatistikBean
     *
     * @param notenListe Notenliste aus der die Statistik erzeugt werden soll
     * @return Statistik der Notenliste
     * @deprecated
     */
    @Named
    @Deprecated
    public Statistik getStatistik(List<Noten> notenListe) {
        return this.statistikBeanLocal.getStatistik(notenListe);
    }

//    @Named
//    @Deprecated
//    public Zwischenpruefungsnote getZwischenpruefungsnote(int personID) {
//        return this.berechnungNoten.getNoteGrundstudium(personID);
//    }
    /**
     * Holt Note mit Relativer gewichtung zur Endnote
     *
     * @param note Die Einzelnote, deren gewichtung berechnet werden soll
     * @param endnote Endnote
     * @return Gewichtung der jeweiligen Note
     */
    @Named
    public double getRelativeGewichtung(Noten note, Endnote endnote) {
        return this.berechnungNoten.getRelativeGewichtung(note, endnote);
    }

    /**
     *
     * @param personID
     * @return
     */
    @Named
    public BerechneteNoten getBerechneteNoten(int personID) {
        return this.berechnungNoten.getBerechneteNoten(personID);
    }

    /**
     *
     * Erzeut eine Notenliste, geordnet nach Semestern der PErson, die abgefragt
     * wird
     *
     * @param personID Student für den die Liste erzeugt werden soll
     * @return Notenliste, sortiert nach Semestern für einen Studenten
     */
    @Named
    public List<Noten> getNotenListSortedSemester(int personID) {
        return this.em.createNativeQuery("select n.* from noten n, studienfaecher s where Matrikelnr = " + personID + " and s.idStudienfach = n.studienfach_id order by s.semester", Noten.class).getResultList();
    }

    /**
     * Methode um die Wunschnote in die Datenbank zu schreiben, soll aus der JSF
     * Seite mit bspw. onblur aufgerufen werden und eine(!) Note in die
     * Datenbank schreiben
     *
     * @param notenID ID der zu ändernden Note
     * @param wunschNote neuer Wert der Wunschnote
     * @author markus
     * @version 0.1
     * @since 15.12.2015
     * @todo Native Query umbauen
     */
    
    @Transactional
    public void setWunschnote(int notenID, int wunschNote) {
        //wunschNote = 5;
        //Query update_query_wunschnote = em.createNativeQuery("update noten.noten set Wunschnote=" + wunschNote + " where idNoten=" + notenID);
        //int wunschNoteI = Integer.parseInt(wunschNote);
        Query update_query_wunschnote = em.createNativeQuery("update noten.noten set Wunschnote= ? where idNoten= ?");
        update_query_wunschnote.setParameter(2, notenID);
        update_query_wunschnote.setParameter(1, wunschNote);
        update_query_wunschnote.executeUpdate();
    }

    /**
     * Methode um die komplette Seite zu speichern
     * http://stackoverflow.com/questions/19002570/retrieving-value-of-jsf-input-field-without-managed-bean-property
     *
     * @version 0.1
     * @since 15.12.2015
     */
    @Transactional
    public void save() {
        //em.persist(student);
        //ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        //ec.getRequestParameterMap().get("");
    }

}
