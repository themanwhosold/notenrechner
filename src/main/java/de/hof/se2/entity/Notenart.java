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
@Table(name = "notenart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notenart.findAll", query = "SELECT n FROM Notenart n"),
    @NamedQuery(name = "Notenart.findByIdNotenart", query = "SELECT n FROM Notenart n WHERE n.idNotenart = :idNotenart"),
    @NamedQuery(name = "Notenart.findByBezeichnung", query = "SELECT n FROM Notenart n WHERE n.bezeichnung = :bezeichnung")})
public class Notenart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idNotenart")
    private Integer idNotenart;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "bezeichnung")
    private String bezeichnung;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notenartId")
    private List<Noten> notenList;
    @JoinColumn(name = "studiengang_id", referencedColumnName = "idStudiengang")
    @ManyToOne(optional = false)
    private Studiengang studiengangId;

    /**
     *
     */
    public Notenart() {
    }

    /**
     *
     * @param idNotenart
     */
    public Notenart(Integer idNotenart) {
        this.idNotenart = idNotenart;
    }

    /**
     *
     * @param idNotenart
     * @param bezeichnung
     */
    public Notenart(Integer idNotenart, String bezeichnung) {
        this.idNotenart = idNotenart;
        this.bezeichnung = bezeichnung;
    }

    /**
     *
     * @return
     */
    public Integer getIdNotenart() {
        return idNotenart;
    }

    /**
     *
     * @param idNotenart
     */
    public void setIdNotenart(Integer idNotenart) {
        this.idNotenart = idNotenart;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotenart != null ? idNotenart.hashCode() : 0);
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
        if (!(object instanceof Notenart)) {
            return false;
        }
        Notenart other = (Notenart) object;
        if ((this.idNotenart == null && other.idNotenart != null) || (this.idNotenart != null && !this.idNotenart.equals(other.idNotenart))) {
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
        return "de.hof.se2.Notenart[ idNotenart=" + idNotenart + " ]";
    }
    
}
