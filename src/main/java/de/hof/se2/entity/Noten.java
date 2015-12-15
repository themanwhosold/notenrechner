/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author markus
 */
@Entity
@Table(name = "noten")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Noten.findAll", query = "SELECT n FROM Noten n"),
    @NamedQuery(name = "Noten.findByIdNoten", query = "SELECT n FROM Noten n WHERE n.idNoten = :idNoten"),
    @NamedQuery(name = "Noten.findByNote", query = "SELECT n FROM Noten n WHERE n.note = :note"),
    @NamedQuery(name = "Noten.findByWunschnote", query = "SELECT n FROM Noten n WHERE n.wunschnote = :wunschnote"),
    @NamedQuery(name = "Noten.findByEinzelgewicht", query = "SELECT n FROM Noten n WHERE n.einzelgewicht = :einzelgewicht")})
public class Noten implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idNoten")
    private Integer idNoten;
    @Column(name = "note")
    private Integer note;
    @Column(name = "Wunschnote")
    private Integer wunschnote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "einzelgewicht")
    private int einzelgewicht;
    @JoinColumn(name = "Matrikelnr", referencedColumnName = "idPersonen")
    @ManyToOne(optional = false)
    private Personen matrikelnr;
    @JoinColumn(name = "notenart_id", referencedColumnName = "idNotenart")
    @ManyToOne(optional = false)
    private Notenart notenartId;
    @JoinColumn(name = "studienfach_id", referencedColumnName = "idStudienfach")
    @ManyToOne(optional = false)
    private Studienfaecher studienfachId;

    /**
     *
     */
    public Noten() {
    }

    /**
     *
     * @param idNoten
     */
    public Noten(Integer idNoten) {
        this.idNoten = idNoten;
    }

    /**
     *
     * @param idNoten
     * @param einzelgewicht
     */
    public Noten(Integer idNoten, int einzelgewicht) {
        this.idNoten = idNoten;
        this.einzelgewicht = einzelgewicht;
    }

    /**
     *
     * @return
     */
    public Integer getIdNoten() {
        return idNoten;
    }

    /**
     *
     * @param idNoten
     */
    public void setIdNoten(Integer idNoten) {
        this.idNoten = idNoten;
    }

    /**
     *
     * @return
     */
    public Integer getNote() {
        return note;
    }

    /**
     *
     * @param note
     */
    public void setNote(Integer note) {
        this.note = note;
    }

    /**
     *
     * @return
     */
    public Integer getWunschnote() {
        return wunschnote;
    }

    /**
     *
     * @param wunschnote
     */
    public void setWunschnote(Integer wunschnote) {
        this.wunschnote = wunschnote;
    }

    /**
     *
     * @return
     */
    public int getEinzelgewicht() {
        return einzelgewicht;
    }

    /**
     *
     * @param einzelgewicht
     */
    public void setEinzelgewicht(int einzelgewicht) {
        this.einzelgewicht = einzelgewicht;
    }

    /**
     *
     * @return
     */
    public Personen getMatrikelnr() {
        return matrikelnr;
    }

    /**
     *
     * @param matrikelnr
     */
    public void setMatrikelnr(Personen matrikelnr) {
        this.matrikelnr = matrikelnr;
    }

    /**
     *
     * @return
     */
    public Notenart getNotenartId() {
        return notenartId;
    }

    /**
     *
     * @param notenartId
     */
    public void setNotenartId(Notenart notenartId) {
        this.notenartId = notenartId;
    }

    /**
     *
     * @return
     */
    public Studienfaecher getStudienfachId() {
        return studienfachId;
    }

    /**
     *
     * @param studienfachId
     */
    public void setStudienfachId(Studienfaecher studienfachId) {
        this.studienfachId = studienfachId;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNoten != null ? idNoten.hashCode() : 0);
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
        if (!(object instanceof Noten)) {
            return false;
        }
        Noten other = (Noten) object;
        if ((this.idNoten == null && other.idNoten != null) || (this.idNoten != null && !this.idNoten.equals(other.idNoten))) {
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
        return "de.hof.se2.Noten[ idNoten=" + idNoten + " ]";
    }
    
}
