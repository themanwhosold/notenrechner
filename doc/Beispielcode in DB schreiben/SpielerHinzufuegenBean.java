/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.ligaWeb.ManagedBeans;

import de.hof.ligaWeb.ejbs.MySessionBeanManagedBean;
import de.hof.ligaWeb.model.Player;
import de.hof.ligaWeb.model.Team;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maximilian Schreiber
 */
@Named(value = "spielerHinzufuegenBean")
@RequestScoped
public class SpielerHinzufuegenBean implements Serializable {

    @PersistenceContext
    EntityManager em;

    @Inject
    MySessionBeanManagedBean ejb;

    String vorname;
    String nachname;
    int id;

    public SpielerHinzufuegenBean() {
    }

    public void schreibenPlayerInDB(int teamID) {

        String name = this.vorname + " " + this.nachname;
        int tempID = (int) em.createNativeQuery("select id from player order by id desc").getResultList().get(0);
        tempID++;
        this.id = tempID;

        Player player = new Player(this.id, name);
        Team team = (Team) em.createNativeQuery("select * from team where id = " + teamID, Team.class).getResultList().get(0);
        player.setTeamId(team);

        ejb.schreibePlayerInDB(name, team, id);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
