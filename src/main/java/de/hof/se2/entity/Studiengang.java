/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author markus
 */
@Entity
@Table(name = "studiengang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studiengang.findAll", query = "SELECT s FROM Studiengang s"),
    @NamedQuery(name = "Studiengang.findByIdStudiengang", query = "SELECT s FROM Studiengang s WHERE s.idStudiengang = :idStudiengang"),
    @NamedQuery(name = "Studiengang.findByStudiengangsleiter", query = "SELECT s FROM Studiengang s WHERE s.studiengangsleiter = :studiengangsleiter"),
    @NamedQuery(name = "Studiengang.findByBezeichnung", query = "SELECT s FROM Studiengang s WHERE s.bezeichnung = :bezeichnung"),
    @NamedQuery(name = "Studiengang.findByAnzSemester", query = "SELECT s FROM Studiengang s WHERE s.anzSemester = :anzSemester"),
    @NamedQuery(name = "Studiengang.findByGrundstudiumBis", query = "SELECT s FROM Studiengang s WHERE s.grundstudiumBis = :grundstudiumBis")})
public class Studiengang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idStudiengang")
    private Integer idStudiengang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "studiengangsleiter")
    private int studiengangsleiter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "bezeichnung")
    private String bezeichnung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anz_semester")
    private int anzSemester;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grundstudiumBis")
    private int grundstudiumBis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studiengangId")
    private List<Personen> personenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studiengangId")
    private List<Studienfaecher> studienfaecherList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studiengangId")
    private List<Notenart> notenartList;

    /**
     *
     */
    public Studiengang() {
    }

    /**
     *
     * @param idStudiengang
     */
    public Studiengang(Integer idStudiengang) {
        this.idStudiengang = idStudiengang;
    }

    /**
     *
     * @param idStudiengang
     * @param studiengangsleiter
     * @param bezeichnung
     * @param anzSemester
     * @param grundstudiumBis
     */
    public Studiengang(Integer idStudiengang, int studiengangsleiter, String bezeichnung, int anzSemester, int grundstudiumBis) {
        this.idStudiengang = idStudiengang;
        this.studiengangsleiter = studiengangsleiter;
        this.bezeichnung = bezeichnung;
        this.anzSemester = anzSemester;
        this.grundstudiumBis = grundstudiumBis;
    }

    /**
     *
     * @return
     */
    public Integer getIdStudiengang() {
        return idStudiengang;
    }

    /**
     *
     * @param idStudiengang
     */
    public void setIdStudiengang(Integer idStudiengang) {
        this.idStudiengang = idStudiengang;
    }

    /**
     *
     * @return
     */
    public int getStudiengangsleiter() {
        return studiengangsleiter;
    }

    /**
     *
     * @param studiengangsleiter
     */
    public void setStudiengangsleiter(int studiengangsleiter) {
        this.studiengangsleiter = studiengangsleiter;
    }

    /**
     *
     * @return
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     *
     * @param bezeichnung
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     *
     * @return
     */
    public int getAnzSemester() {
        return anzSemester;
    }

    /**
     *
     * @param anzSemester
     */
    public void setAnzSemester(int anzSemester) {
        this.anzSemester = anzSemester;
    }

    /**
     *
     * @return
     */
    public int getGrundstudiumBis() {
        return grundstudiumBis;
    }

    /**
     *
     * @param grundstudiumBis
     */
    public void setGrundstudiumBis(int grundstudiumBis) {
        this.grundstudiumBis = grundstudiumBis;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Personen> getPersonenList() {
        return personenList;
    }

    /**
     *
     * @param personenList
     */
    public void setPersonenList(List<Personen> personenList) {
        this.personenList = personenList;
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
    public List<Notenart> getNotenartList() {
        return notenartList;
    }

    /**
     *
     * @param notenartList
     */
    public void setNotenartList(List<Notenart> notenartList) {
        this.notenartList = notenartList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStudiengang != null ? idStudiengang.hashCode() : 0);
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
        if (!(object instanceof Studiengang)) {
            return false;
        }
        Studiengang other = (Studiengang) object;
        if ((this.idStudiengang == null && other.idStudiengang != null) || (this.idStudiengang != null && !this.idStudiengang.equals(other.idStudiengang))) {
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
        return "de.hof.se2.Studiengang[ idStudiengang=" + idStudiengang + " ]";
    }
    
}
