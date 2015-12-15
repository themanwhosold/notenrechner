/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.managedBean.User;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

/**
 *Lokales Interface der authSession
 * @author Schmidbauer
 */
public interface authSessionLocal {
        @Deployment
//public static JavaArchive createDeployment() {
//
//    JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
//    jar.addAsResource("test-persistence.xml", "META-INF/persistence.xml");
//    jar.addPackage("com.demopack.demoproj");
//    jar.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//
//    return jar;
//    }

    /**
     *
     * @return
     */
    public User getCurrentUser();

    /**
     *
     */
    public void login();

    /**
     *
     * @param user
     */
    public void setUser(User user);
    
}
