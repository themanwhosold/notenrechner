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
@LoggedIn
public class User{
    

    private int userId=0;
    private int rolle;
    private String password;
    private String vorname;
    private String nachname;
    
    
    
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

    
    
    public int getRolle() {
        return rolle;
    }

    public void setRolle(int rolle) {
        this.rolle = rolle;
    }

    public int getUserId() {
        if (userId==0) return 1;
        else return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", vorname=" + vorname + ", nachname=" + nachname + '}';
    }
    
    

}
