/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.entity.Personen;
import de.hof.se2.sessionBean.authSessionLocal;
import java.util.List;
import javax.ejb.EJB;
//import javax.annotation.ManagedBean;
//import javax.ejb.Stateless;
//import javax.ejb.LocalBean;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Schmidbauer
 */
@SessionScoped
@Named(value = "authBean")
public class authBean {
    @EJB 
    private authSessionLocal localSession;

    @Inject Credentials credentials;
    @PersistenceContext EntityManager em;

    private User user;
    
    @Named 
    public void login(int id, String password) {
        this.localSession.login(id, password);
    }

    public void logout() {

        user = null;

    }

    public boolean isLoggedIn() {

        return user != null;

    }

    @Produces
    @LoggedIn
    @Named
   public User getCurrentUser() {
       return this.localSession.getCurrentUser();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
