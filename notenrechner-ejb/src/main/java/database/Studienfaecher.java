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
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Schmidbauer
 */
@Entity
@Table(name = "studienfaecher", catalog = "noten", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studienfaecher.findAll", query = "SELECT s FROM Studienfaecher s"),
    @NamedQuery(name = "Studienfaecher.findById", query = "SELECT s FROM Studienfaecher s WHERE s.id = :id"),
    @NamedQuery(name = "Studienfaecher.findByBezeichnung", query = "SELECT s FROM Studienfaecher s WHERE s.bezeichnung = :bezeichnung"),
    @NamedQuery(name = "Studienfaecher.findBySemester", query = "SELECT s FROM Studienfaecher s WHERE s.semester = :semester")})
public class Studienfaecher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "bezeichnung")
    private String bezeichnung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Semester")
    @Transient
    private int semester;
    @JoinColumn(name = "Dozent_ID", referencedColumnName = "idPersonen")
    @ManyToOne(optional = false)
    @Transient
    private Personen dozentID;
    @JoinColumn(name = "studiengangID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    @Transient
    private Studiengang studiengangID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studienfachID")
    @Transient
    private List<Noten> notenList;

    public Studienfaecher() {
    }

    public Studienfaecher(Integer id) {
        this.id = id;
    }

    public Studienfaecher(Integer id, String bezeichnung, int semester) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.semester = semester;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Personen getDozentID() {
        return dozentID;
    }

    public void setDozentID(Personen dozentID) {
        this.dozentID = dozentID;
    }

    public Studiengang getStudiengangID() {
        return studiengangID;
    }

    public void setStudiengangID(Studiengang studiengangID) {
        this.studiengangID = studiengangID;
    }

    @XmlTransient
    public List<Noten> getNotenList() {
        return notenList;
    }

    public void setNotenList(List<Noten> notenList) {
        this.notenList = notenList;
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
        if (!(object instanceof Studienfaecher)) {
            return false;
        }
        Studienfaecher other = (Studienfaecher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Studienfaecher[ id=" + id + " ]";
    }
    
}
