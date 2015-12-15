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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "studienfaecher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studienfaecher.findAll", query = "SELECT s FROM Studienfaecher s"),
    @NamedQuery(name = "Studienfaecher.findByIdStudienfach", query = "SELECT s FROM Studienfaecher s WHERE s.idStudienfach = :idStudienfach"),
    @NamedQuery(name = "Studienfaecher.findByBezeichnung", query = "SELECT s FROM Studienfaecher s WHERE s.bezeichnung = :bezeichnung"),
    @NamedQuery(name = "Studienfaecher.findBySemester", query = "SELECT s FROM Studienfaecher s WHERE s.semester = :semester")})
public class Studienfaecher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idStudienfach")
    private Integer idStudienfach;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "bezeichnung")
    private String bezeichnung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "semester")
    private int semester;
    @JoinColumn(name = "dozent_id", referencedColumnName = "idPersonen")
    @ManyToOne(optional = false)
    private Personen dozentId;
    @JoinColumn(name = "studiengang_id", referencedColumnName = "idStudiengang")
    @ManyToOne(optional = false)
    private Studiengang studiengangId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studienfachId")
    private List<Noten> notenList;

    /**
     *
     */
    public Studienfaecher() {
    }

    /**
     *
     * @param idStudienfach
     */
    public Studienfaecher(Integer idStudienfach) {
        this.idStudienfach = idStudienfach;
    }

    /**
     *
     * @param idStudienfach
     * @param bezeichnung
     * @param semester
     */
    public Studienfaecher(Integer idStudienfach, String bezeichnung, int semester) {
        this.idStudienfach = idStudienfach;
        this.bezeichnung = bezeichnung;
        this.semester = semester;
    }

    /**
     *
     * @return
     */
    public Integer getIdStudienfach() {
        return idStudienfach;
    }

    /**
     *
     * @param idStudienfach
     */
    public void setIdStudienfach(Integer idStudienfach) {
        this.idStudienfach = idStudienfach;
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
    public int getSemester() {
        return semester;
    }

    /**
     *
     * @param semester
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     *
     * @return
     */
    public Personen getDozentId() {
        return dozentId;
    }

    /**
     *
     * @param dozentId
     */
    public void setDozentId(Personen dozentId) {
        this.dozentId = dozentId;
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
        hash += (idStudienfach != null ? idStudienfach.hashCode() : 0);
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
        if (!(object instanceof Studienfaecher)) {
            return false;
        }
        Studienfaecher other = (Studienfaecher) object;
        if ((this.idStudienfach == null && other.idStudienfach != null) || (this.idStudienfach != null && !this.idStudienfach.equals(other.idStudienfach))) {
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
        return "de.hof.se2.Studienfaecher[ idStudienfach=" + idStudienfach + " ]";
    }
    
}
