/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.managedBean.User;

/**
 *
 * @author Schmidbauer
 */
public interface authSessionLocal {
    public User getCurrentUser();
    public void login(int id, String password);
    
}
