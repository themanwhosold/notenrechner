/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.EAGER;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author markus
 */
@Entity
@Table(name = "personen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personen.findAll", query = "SELECT p FROM Personen p"),
    @NamedQuery(name = "Personen.findByIdPersonen", query = "SELECT p FROM Personen p WHERE p.idPersonen = :idPersonen"),
    @NamedQuery(name = "Personen.findByNachname", query = "SELECT p FROM Personen p WHERE p.nachname = :nachname"),
    @NamedQuery(name = "Personen.findByVorname", query = "SELECT p FROM Personen p WHERE p.vorname = :vorname"),
    @NamedQuery(name = "Personen.findByBioGeschlecht", query = "SELECT p FROM Personen p WHERE p.bioGeschlecht = :bioGeschlecht"),
    @NamedQuery(name = "Personen.findByGeburtsdatum", query = "SELECT p FROM Personen p WHERE p.geburtsdatum = :geburtsdatum"),
    @NamedQuery(name = "Personen.findByPasswort", query = "SELECT p FROM Personen p WHERE p.passwort = :passwort"),
    @NamedQuery(name = "Personen.findByRolle", query = "SELECT p FROM Personen p WHERE p.rolle = :rolle")})
public class Personen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPersonen")
    private Integer idPersonen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nachname")
    private String nachname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Vorname")
    private String vorname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bio_geschlecht")
    private boolean bioGeschlecht;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Geburtsdatum")
    @Temporal(TemporalType.DATE)
    private Date geburtsdatum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Passwort")
    private String passwort;
    @Column(name = "Rolle")
    private Short rolle;
    @JoinColumn(name = "studiengang_id", referencedColumnName = "idStudiengang")
    @ManyToOne(optional = false)
    private Studiengang studiengangId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dozentId")
    private List<Studienfaecher> studienfaecherList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matrikelnr",fetch = EAGER)
    private List<Noten> notenList;

    /**
     *
     */
    public Personen() {
    }

    /**
     *
     * @param idPersonen
     */
    public Personen(Integer idPersonen) {
        this.idPersonen = idPersonen;
    }

    /**
     *
     * @param idPersonen
     * @param nachname
     * @param vorname
     * @param bioGeschlecht
     * @param geburtsdatum
     * @param passwort
     */
    public Personen(Integer idPersonen, String nachname, String vorname, boolean bioGeschlecht, Date geburtsdatum, String passwort) {
        this.idPersonen = idPersonen;
        this.nachname = nachname;
        this.vorname = vorname;
        this.bioGeschlecht = bioGeschlecht;
        this.geburtsdatum = geburtsdatum;
        this.passwort = passwort;
    }

    /**
     *
     * @return
     */
    public Integer getIdPersonen() {
        return idPersonen;
    }

    /**
     *
     * @param idPersonen
     */
    public void setIdPersonen(Integer idPersonen) {
        this.idPersonen = idPersonen;
    }

    /**
     *
     * @return
     */
    public String getNachname() {
        return nachname;
    }

    /**
     *
     * @param nachname
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     *
     * @return
     */
    public String getVorname() {
        return vorname;
    }

    /**
     *
     * @param vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     *
     * @return
     */
    public boolean getBioGeschlecht() {
        return bioGeschlecht;
    }

    /**
     *
     * @param bioGeschlecht
     */
    public void setBioGeschlecht(boolean bioGeschlecht) {
        this.bioGeschlecht = bioGeschlecht;
    }

    /**
     *
     * @return
     */
    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     *
     * @param geburtsdatum
     */
    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    /**
     *
     * @return
     */
    public String getPasswort() {
        return passwort;
    }

    /**
     *
     * @param passwort
     */
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    /**
     *
     * @return
     */
    public Short getRolle() {
        return rolle;
    }

    /**
     *
     * @param rolle
     */
    public void setRolle(Short rolle) {
        this.rolle = rolle;
    }

    /**
     *
     * @return
     */
    public Studiengang getStudiengangId() {
        return studiengangId;
    }

    /**
     *
     * @param studiengangId
     */
    public void setStudiengangId(Studiengang studiengangId) {
        this.studiengangId = studiengangId;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Studienfaecher> getStudienfaecherList() {
        return studienfaecherList;
    }

    /**
     *
     * @param studienfaecherList
     */
    public void setStudienfaecherList(List<Studienfaecher> studienfaecherList) {
        this.studienfaecherList = studienfaecherList;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Noten> getNotenList() {
        return notenList;
    }

    /**
     *
     * @param notenList
     */
    public void setNotenList(List<Noten> notenList) {
        this.notenList = notenList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonen != null ? idPersonen.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personen)) {
            return false;
        }
        Personen other = (Personen) object;
        if ((this.idPersonen == null && other.idPersonen != null) || (this.idPersonen != null && !this.idPersonen.equals(other.idPersonen))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "de.hof.se2.Personen[ idPersonen=" + idPersonen + " ]";
    }
    
}
