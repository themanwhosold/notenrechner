/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.ligaWeb.ejbs;

import de.hof.ligaWeb.classes.Spielergebnis;
import de.hof.ligaWeb.model.Goal;
import de.hof.ligaWeb.model.Matches;
import de.hof.ligaWeb.model.Player;
import de.hof.ligaWeb.model.Team;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maximilian Schreiber
 */
@Singleton
public class MySessionBean implements MySessionBeanLocal {

    @PersistenceContext
    EntityManager em;

    public MySessionBean() {
    }

    @Override
    public ArrayList<Goal> getToreByTeam(Team team, Matches match) {
        ArrayList<Goal> rc = new ArrayList<>();

        for (Goal g : (ArrayList<Goal>) em.createNativeQuery("select * from goal where match_Id = " + match.getId(), Goal.class).getResultList()) {

            if (team.getPlayerList().contains(g.getPlayerId())) {
                rc.add(g);
            }

        }

        return rc;
    }

    @Override
    public ArrayList<Spielergebnis> getBerechneTabelle() {

        HashMap<Integer, Spielergebnis> spielErgebnisHashMap = new HashMap<>();
        List<Matches> matchesListe = em.createNativeQuery("select * from matches", Matches.class).getResultList();
        List<Team> teamListe = em.createNativeQuery("select * from team", Team.class).getResultList();
        for (Team team : teamListe) {
            spielErgebnisHashMap.put(team.getId(), new Spielergebnis(team));
        }

        for (Matches match : matchesListe) {

            int[][] ergebnis = this.getWerteMatchAus(match);

            Spielergebnis heim = spielErgebnisHashMap.get(match.getHeimteam().getId());
            Spielergebnis aus = spielErgebnisHashMap.get(match.getAuswaertsteam().getId());

            heim.addPunkte(ergebnis[0][0]);
            heim.addTore(ergebnis[0][1]);
            heim.addGegentore(ergebnis[0][2]);
            heim.addTorverhaeltnis(ergebnis[0][3]);

            aus.addPunkte(ergebnis[1][0]);
            aus.addTore(ergebnis[1][1]);
            aus.addGegentore(ergebnis[1][2]);
            aus.addTorverhaeltnis(ergebnis[1][3]);

        }

        ArrayList<Spielergebnis> rc = new ArrayList<>();

        for (Integer i : spielErgebnisHashMap.keySet()) {
            rc.add(spielErgebnisHashMap.get(i));
        }
        Collections.sort(rc);
        return rc;
    }

    /*
     int[][] -> erstes Feld ist für die Heimmanschaft und zweites Feld für Auswärtsteam
     die jeweils vier Felder stehen für die Punkte, tore, Gegentore und das Torverhältnis
     */
    @Override
    public int[][] getWerteMatchAus(Matches match) {

        int[][] rc = new int[2][4];
        Team heim = match.getHeimteam();
        ArrayList<Goal> goalList = (ArrayList<Goal>) em.createNativeQuery("select * from goal where match_id = " + match.getId(), Goal.class).getResultList();

        for (Goal goal : goalList) {

            if (heim.getPlayerList().contains(goal.getPlayerId())) {

                rc[0][1] += 1;
                rc[1][2] += 1;  //Gegentor für die Auswärtsmannschaft
            } else {

                rc[1][1] += 1;
                rc[0][2] += 1;      //Gegentor für die Heimmannschaft

            }

        }

        if (rc[0][1] > rc[1][1]) {    //Sieg Heimmanschaft
            rc[0][0] += 3;

        } else if (rc[0][1] < rc[1][1]) {      //Sieg Auswärtsmannschaft
            rc[1][0] += +3;
        } else {  //Unentschieden
            rc[0][0] += 1;
            rc[1][0] += 1;
        }

        rc[0][3] = rc[0][1] - rc[0][2];
        rc[1][3] = rc[1][1] - rc[1][2];

        return rc;
    }

    @Override
    public void schreibePlayerInDB(String name, Team team, int id) {
        Player player = new Player(id, name);
        player.setTeamId(team);
        em.persist(player);
    }

}
