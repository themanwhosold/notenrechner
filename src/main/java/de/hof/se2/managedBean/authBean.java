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
 * authBean ist das Gegenstück der authSession im Package de.hof.se2.sessionBean 
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
    
    /**
     *Login per localSession Bean. Erzeugt einen User, der Injected werden kann
     */
    @Named 
    public void login() {
        this.localSession.login();
    }

    /**
     * Loggt einen USer aus. Bedient sich der Localen SessionBean
     */
    public void logout() {

        this.localSession.setUser(null);

    }

    /**
     * Stellt fest ob ein USer eingeloggt ist. Bedient sich der Localen SessionBean
     * @return boolean
     */
    public boolean isLoggedIn() {

        return this.localSession.getCurrentUser() != null;

    }

    /**
     * Gibt den momentan eingeloggten BEnutzer zurück
     * Bedient sich der SessionBean authSession
     * @return Den momentanen BEnutzer, der Injected werden kann
     */
    @Produces
    @LoggedIn
    @Named
   public User getCurrentUser() {
       return this.localSession.getCurrentUser();
    }

    
}
