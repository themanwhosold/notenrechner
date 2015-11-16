/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import java.util.List;
//import javax.annotation.ManagedBean;
//import javax.ejb.Stateless;
//import javax.ejb.LocalBean;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;

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

    @Default User credentials;
    @PersistenceContext EntityManager em;

    public User user;
    
    @Named
    public void login() {
        List<User> results = em.createQuery(
                "select u from personen p where p.idPersonen=:username and p.Passwort=:password")
                .setParameter("username", credentials.getUsername())
                .setParameter("password", credentials.getPassword())
                .getResultList();

        if (!results.isEmpty()) {

            user = results.get(0);

        }

    }

    public void logout() {

        user = null;

    }

    public boolean isLoggedIn() {

        return user != null;

    }

    @Produces
    @LoggedIn
    User getCurrentUser() {

        return user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
