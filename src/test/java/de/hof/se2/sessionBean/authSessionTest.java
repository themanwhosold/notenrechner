///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hof.se2.sessionBean;
//
//import de.hof.se2.managedBean.User;
//import javax.ejb.EJB;
//import javax.ejb.embeddable.EJBContainer;
//import javax.naming.Context;
//import javax.naming.NamingException;
//import javax.persistence.EntityManager;
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.container.test.impl.deployment.ArquillianDeploymentAppender;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.runner.RunWith;
//
//
///**
// *
// * @author Schmidbauer
// */
////@RunWith(Arquillian.class)
//public class authSessionTest {
////    authSession instance;
////    EntityManager entityManager;
//    @EJB
//    authSession instance;
//    
//        @Deployment
//    public static JavaArchive createDeployment() {
//
//        JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
//        jar.addAsResource("test-persistence.xml", "META-INF/persistence.xml");
//        jar.addPackage("com.demopack.demoproj");
//        jar.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//
//        return jar;
//    }
//    
//    public authSessionTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() throws NamingException {
//        instance= new authSession();
////        entityManager = mock();
////        EJBContainer cont = EJBContainer.createEJBContainer();
////        Context ctxt = cont.getContext();
////        authSession instance= (authSession)ctxt.lookup("java:global/classes/de/hof/se2/sessionBean/authSession");
//    }
//    
//    
//    
//
//    /**
//     * Test of login method, of class authSession.
//     */
//    
//    
//    @Test
//    
//    
//    public void testLogin() throws Exception {
//        System.out.println("login");
//        int id = 1;
//        String password = "passwort";
////        authSession instance = new authSession();
////        EJBContainer cont = EJBContainer.createEJBContainer();
////        Context ctxt = cont.getContext();
////        authSession instance= (authSession)ctxt.lookup("java:global/classes/de/hof/se2/sessionBean/authSession");
//        instance.login(id, password);
//        assertEquals(true, instance.isLoggedIn());
//        fail("Test Failed");
//    }
//
//    /**
//     * Test of logout method, of class authSession.
//     */
//    @Test
//    public void testLogout() throws Exception {
//        System.out.println("logout");
////        authSession instance = new authSession();
////        EJBContainer cont = EJBContainer.createEJBContainer();
////        Context ctxt = cont.getContext();
////        authSession instance= (authSession)ctxt.lookup("java:global/classes/de/hof/se2/sessionBean/authSession");
//        instance.login(1,"passwort");
//        instance.logout();
//        assertEquals(false, instance.isLoggedIn());
//        fail("Test Failed");
//    }
//
//    /**
//     * Test of isLoggedIn method, of class authSession.
//     */
//    @Test
//    public void testIsLoggedIn() throws Exception {
//        System.out.println("isLoggedIn");
////        authSession instance = new authSession();
////        EJBContainer cont = EJBContainer.createEJBContainer();
////        Context ctxt = cont.getContext();
////        authSession instance= (authSession)ctxt.lookup("java:global/classes/de/hof/se2/sessionBean/authSession");
//        boolean expResult = false;
//        boolean result = instance.isLoggedIn();
//        assertEquals(expResult, result);
//        expResult = true;
//        instance.login(1, "passwort");
//        result= instance.isLoggedIn();
//        assertEquals(expResult, result);
//        fail("Test failed");
//    }
//
//    /**
//     * Test of getCurrentUser method, of class authSession.
//     */
//    @Test
//    public void testGetCurrentUser() throws Exception {
//        System.out.println("getCurrentUser");
////        authSession instance = new authSession();
////        EJBContainer cont = EJBContainer.createEJBContainer();
////        Context ctxt = cont.getContext();
////        authSession instance= (authSession)ctxt.lookup("java:global/classes/de/hof/se2/sessionBean/authSession");
//        instance.login(1, "passwort");
//        User result = instance.getCurrentUser();
//        assertNotNull(result);
//        fail("Test failed");
//    }
//
//    /**
//     * Test of getUser method, of class authSession.
//     */
//    @Test
//    public void testGetUser() throws Exception {
//        System.out.println("getUser");
// //        authSession instance = new authSession();
////        EJBContainer cont = EJBContainer.createEJBContainer();
////        Context ctxt = cont.getContext();
////        authSession instance= (authSession)ctxt.lookup("java:global/classes/de/hof/se2/sessionBean/authSession");
//        instance.login(1, "passwort");
//        User result = instance.getUser();
//        assertNotNull(result);
//        fail("Test Failed");
//    }
//
//    /**
//     * Test of setUser method, of class authSession.
//     */
//    @Test
//    public void testSetUser() throws Exception {
//        System.out.println("setUser");
//        User user = new User();
//        user.setNachname("Mueller");
//        user.setVorname("Hans");
//        user.setRolle(1);
//        user.setUserId(1);
//        user.setPassword("passwort");
////        authSession instance = new authSession();
////        EJBContainer cont = EJBContainer.createEJBContainer();
////        Context ctxt = cont.getContext();
////        authSession instance= (authSession)ctxt.lookup("java:global/classes/de/hof/se2/sessionBean/authSession");
//        instance.setUser(user);
//        fail("Test failed");
//    }
//    
//}
