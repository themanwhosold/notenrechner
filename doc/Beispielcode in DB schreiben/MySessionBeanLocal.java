/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.ligaWeb.ejbs;

import de.hof.ligaWeb.classes.Spielergebnis;
import de.hof.ligaWeb.model.Goal;
import de.hof.ligaWeb.model.Matches;
import de.hof.ligaWeb.model.Team;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Maximilian Schreiber
 */
@Local
public interface MySessionBeanLocal {
    public ArrayList<Goal> getToreByTeam(Team team, Matches match);
    public ArrayList<Spielergebnis> getBerechneTabelle();
    public int[][] getWerteMatchAus(Matches match);
    public void schreibePlayerInDB(String name, Team team, int id);
}
