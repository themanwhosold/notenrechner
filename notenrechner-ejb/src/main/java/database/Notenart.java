/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

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
 * @author Schmidbauer
 */
@Entity
@Table(name = "notenart", catalog = "noten", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notenart.findAll", query = "SELECT n FROM Notenart n"),
    @NamedQuery(name = "Notenart.findByNotenartId", query = "SELECT n FROM Notenart n WHERE n.notenartId = :notenartId"),
    @NamedQuery(name = "Notenart.findByBezeichnung", query = "SELECT n FROM Notenart n WHERE n.bezeichnung = :bezeichnung")})
public class Notenart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "notenart_id")
    private Integer notenartId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "bezeichnung")
    private String bezeichnung;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notenartId")
    private List<Noten> notenList;
    @JoinColumn(name = "studiengang_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Studiengang studiengangId;

    public Notenart() {
    }

    public Notenart(Integer notenartId) {
        this.notenartId = notenartId;
    }

    public Notenart(Integer notenartId, String bezeichnung) {
        this.notenartId = notenartId;
        this.bezeichnung = bezeichnung;
    }

    public Integer getNotenartId() {
        return notenartId;
    }

    public void setNotenartId(Integer notenartId) {
        this.notenartId = notenartId;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @XmlTransient
    public List<Noten> getNotenList() {
        return notenList;
    }

    public void setNotenList(List<Noten> notenList) {
        this.notenList = notenList;
    }

    public Studiengang getStudiengangId() {
        return studiengangId;
    }

    public void setStudiengangId(Studiengang studiengangId) {
        this.studiengangId = studiengangId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notenartId != null ? notenartId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notenart)) {
            return false;
        }
        Notenart other = (Notenart) object;
        if ((this.notenartId == null && other.notenartId != null) || (this.notenartId != null && !this.notenartId.equals(other.notenartId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Notenart[ notenartId=" + notenartId + " ]";
    }
    
}
