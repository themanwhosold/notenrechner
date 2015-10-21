/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

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
 * @author Schmidbauer
 */
@Entity
@Table(name = "noten", catalog = "noten", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Noten.findAll", query = "SELECT n FROM Noten n"),
    @NamedQuery(name = "Noten.findById", query = "SELECT n FROM Noten n WHERE n.id = :id"),
    @NamedQuery(name = "Noten.findByNote", query = "SELECT n FROM Noten n WHERE n.note = :note"),
    @NamedQuery(name = "Noten.findByWunschnote", query = "SELECT n FROM Noten n WHERE n.wunschnote = :wunschnote"),
    @NamedQuery(name = "Noten.findByEinzelgewicht", query = "SELECT n FROM Noten n WHERE n.einzelgewicht = :einzelgewicht")})
public class Noten implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
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
    @JoinColumn(name = "notenart_id", referencedColumnName = "notenart_id")
    @ManyToOne(optional = false)
    private Notenart notenartId;
    @JoinColumn(name = "studienfachID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Studienfaecher studienfachID;

    public Noten() {
    }

    public Noten(Integer id) {
        this.id = id;
    }

    public Noten(Integer id, int einzelgewicht) {
        this.id = id;
        this.einzelgewicht = einzelgewicht;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getWunschnote() {
        return wunschnote;
    }

    public void setWunschnote(Integer wunschnote) {
        this.wunschnote = wunschnote;
    }

    public int getEinzelgewicht() {
        return einzelgewicht;
    }

    public void setEinzelgewicht(int einzelgewicht) {
        this.einzelgewicht = einzelgewicht;
    }

    public Personen getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(Personen matrikelnr) {
        this.matrikelnr = matrikelnr;
    }

    public Notenart getNotenartId() {
        return notenartId;
    }

    public void setNotenartId(Notenart notenartId) {
        this.notenartId = notenartId;
    }

    public Studienfaecher getStudienfachID() {
        return studienfachID;
    }

    public void setStudienfachID(Studienfaecher studienfachID) {
        this.studienfachID = studienfachID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Noten)) {
            return false;
        }
        Noten other = (Noten) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Noten[ id=" + id + " ]";
    }
    
}
