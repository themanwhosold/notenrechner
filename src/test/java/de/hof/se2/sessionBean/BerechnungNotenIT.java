/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.eigeneNoten.BerechneteNoten;
import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
import de.hof.se2.managedBean.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Schmidbauer
 */
public class BerechnungNotenIT {

    @EJB
    BerechnungNoten instance;
    @PersistenceContext
    static EntityManager em;
    
    List<Noten> nZpListe= new ArrayList();
    List<Noten> neListe= new ArrayList();
    Zwischenpruefungsnote zpNote= new Zwischenpruefungsnote(0, 0, nZpListe, 0, 0, true, true);
    Endnote eNote= new Endnote(0, 0, zpNote, neListe, 0, 0, true, true);

    public BerechnungNotenIT() {
    }

    @Deployment
    public static JavaArchive createDeployment() {

        JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
        jar.addAsResource("test-persistence.xml", "META-INF/persistence.xml");
        jar.addPackage("com.demopack.demoproj");
        jar.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

        return jar;
    }

    @BeforeClass
    public static void setUpClass() {


    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        User testUser = new User();

        List<Object> results = em.createQuery("select p from Personen p where p.idPersonen= 99990000").getResultList();
        testUser.setNachname(((Personen)results.get(0)).getNachname());
        testUser.setVorname(((Personen)results.get(0)).getVorname());
        testUser.setRolle(((Personen)results.get(0)).getRolle());
        testUser.setUserId(((Personen)results.get(0)).getIdPersonen());
        
//        nZpListe = em.createNamedQuery("");
    }

    /**
     * Test of getEndnote method, of class BerechnungNoten.
     */
    @Test
    public void testGetEndnote() throws Exception {
        System.out.println("getEndnote");
        
    }
}
