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
@Table(name = "studiengang", catalog = "noten", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studiengang.findAll", query = "SELECT s FROM Studiengang s"),
    @NamedQuery(name = "Studiengang.findById", query = "SELECT s FROM Studiengang s WHERE s.id = :id"),
    @NamedQuery(name = "Studiengang.findByStudiengangsleiter", query = "SELECT s FROM Studiengang s WHERE s.studiengangsleiter = :studiengangsleiter"),
    @NamedQuery(name = "Studiengang.findByBezeichnung", query = "SELECT s FROM Studiengang s WHERE s.bezeichnung = :bezeichnung"),
    @NamedQuery(name = "Studiengang.findByAnzSemester", query = "SELECT s FROM Studiengang s WHERE s.anzSemester = :anzSemester"),
    @NamedQuery(name = "Studiengang.findByGrundstudiumBis", query = "SELECT s FROM Studiengang s WHERE s.grundstudiumBis = :grundstudiumBis")})
public class Studiengang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "studiengangsleiter")
    private int studiengangsleiter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "bezeichnung")
    @Transient
    private String bezeichnung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anz_semester")
    @Transient
    private int anzSemester;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grundstudiumBis")
    @Transient
    private int grundstudiumBis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studiengangId")
    @Transient
    private List<Personen> personenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studiengangID")
    @Transient
    private List<Studienfaecher> studienfaecherList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studiengangId")
    @Transient
    private List<Notenart> notenartList;

    public Studiengang() {
    }

    public Studiengang(Integer id) {
        this.id = id;
    }

    public Studiengang(Integer id, int studiengangsleiter, String bezeichnung, int anzSemester, int grundstudiumBis) {
        this.id = id;
        this.studiengangsleiter = studiengangsleiter;
        this.bezeichnung = bezeichnung;
        this.anzSemester = anzSemester;
        this.grundstudiumBis = grundstudiumBis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStudiengangsleiter() {
        return studiengangsleiter;
    }

    public void setStudiengangsleiter(int studiengangsleiter) {
        this.studiengangsleiter = studiengangsleiter;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getAnzSemester() {
        return anzSemester;
    }

    public void setAnzSemester(int anzSemester) {
        this.anzSemester = anzSemester;
    }

    public int getGrundstudiumBis() {
        return grundstudiumBis;
    }

    public void setGrundstudiumBis(int grundstudiumBis) {
        this.grundstudiumBis = grundstudiumBis;
    }

    @XmlTransient
    public List<Personen> getPersonenList() {
        return personenList;
    }

    public void setPersonenList(List<Personen> personenList) {
        this.personenList = personenList;
    }

    @XmlTransient
    public List<Studienfaecher> getStudienfaecherList() {
        return studienfaecherList;
    }

    public void setStudienfaecherList(List<Studienfaecher> studienfaecherList) {
        this.studienfaecherList = studienfaecherList;
    }

    @XmlTransient
    public List<Notenart> getNotenartList() {
        return notenartList;
    }

    public void setNotenartList(List<Notenart> notenartList) {
        this.notenartList = notenartList;
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
        if (!(object instanceof Studiengang)) {
            return false;
        }
        Studiengang other = (Studiengang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Studiengang[ id=" + id + " ]";
    }
    
}
