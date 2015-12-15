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
    
    /**
     *
     * @return
     */
    public String getVorname() {
        return vorname;
    }

    /**
     *
     * @param vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     *
     * @return
     */
    public String getNachname() {
        return nachname;
    }

    /**
     *
     * @param nachname
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     *
     * @return
     */
    public int getRolle() {
        return rolle;
    }

    /**
     *
     * @param rolle
     */
    public void setRolle(int rolle) {
        this.rolle = rolle;
    }

    /**
     *
     * @return
     */
    public int getUserId() {
        if (userId==0) return 1;
        else return userId;
    }

    /**
     *
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", vorname=" + vorname + ", nachname=" + nachname + '}';
    }
    
    

}
