/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Schmidbauer
 */
@Named(value = "credentials")
@RequestScoped

public class Credentials {

        

    private int username;

    private String password;

    /**
     *
     * @return
     */
    public int getUsername() { return username; }

    /**
     *
     * @param username
     */
    public void setUsername(int username) { this.username = username; }

    /**
     *
     * @return
     */
    public String getPassword() { return password; }

    /**
     *
     * @param password
     */
    public void setPassword(String password) { this.password = password; }

    

}