/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Schmidbauer
 */
@Named(value = "user")
@RequestScoped
public class User {

    private String username;
    private int rolle;
    private String password;

    public int getRolle() {
        return rolle;
    }

    public void setRolle(int rolle) {
        this.rolle = rolle;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
