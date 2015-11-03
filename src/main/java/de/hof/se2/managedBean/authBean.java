/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.web;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Named;

/**
 *
 * @author Schmidbauer
 */
@Stateless
@LocalBean
@Named (value = "login")
public class authBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Named
    public void logedIn(){
        
    }
    
    @Named
    public void login(){
        
    }
    @Named
    public void logout(){
        
    }
}
