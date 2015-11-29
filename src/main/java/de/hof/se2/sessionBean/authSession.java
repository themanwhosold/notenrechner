/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.entity.Personen;
import de.hof.se2.managedBean.Credentials;
import de.hof.se2.managedBean.LoggedIn;
import de.hof.se2.managedBean.User;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Schmidbauer
 */
@Singleton
@Local(authSessionLocal.class)
public class authSession implements authSessionLocal{
    
    @Inject Credentials credentials;
    @PersistenceContext EntityManager em;

    private User user;
    
    @Override
    public void login(int id, String password) {
//        User test= new User();
//        test.setPassword("passwort");
//        test.setUserId(1);
        List<Personen> results = em.createQuery(
                
                
                "select p from Personen p where p.idPersonen=:username and p.passwort=:password")
                .setParameter("username", credentials.getUsername())
//                .setParameter("username", id)
//                .setParameter("username", test.getUserId())
                .setParameter("password", credentials.getPassword())
//                .setParameter("password", password)
//                .setParameter("password", test.getPassword())
                .getResultList();

        if (!results.isEmpty()) {
            
            user = new User();
            user.setUserId(results.get(0).getIdPersonen());
            user.setNachname(results.get(0).getNachname());
            user.setVorname(results.get(0).getVorname());
            user.setRolle((int)results.get(0).getRolle());
            

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
    @Override
   public User getCurrentUser() {
//       User myUSer=new User();
//       myUSer.setUserId(2);
        return user;
//return myUSer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
