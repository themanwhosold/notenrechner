///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hof.se2.sessionBean;
//
//import de.hof.se2.managedBean.User;
//import javax.ejb.EJB;
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Schmidbauer
// */
//public class authSessionLocalTest {
//        @EJB
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
//    public authSessionLocalTest() {
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
//    public void setUp() {
//    }
//
//    /**
//     * Test of getCurrentUser method, of class authSessionLocal.
//     */
//    @Test
//    public void testGetCurrentUser() {
//        System.out.println("getCurrentUser");
////        authSessionLocal instance = new authSessionLocalImpl();
//        User expResult = new User();
//        expResult.setNachname("Mueller");
//        expResult.setVorname("Hans");
//        expResult.setRolle(1);
//        expResult.setUserId(1);
//        expResult.setPassword("passwort");
//        instance.login(1, "passwort");
//        User result = instance.getCurrentUser();
//        assertEquals(expResult, result);
//        fail("test failed");
//    }
//
//    /**
//     * Test of login method, of class authSessionLocal.
//     */
//    @Test
//    public void testLogin() {
//        System.out.println("login");
//        int id = 1;
//        String password = "passwort";
////        authSessionLocal instance = new authSessionLocalImpl();
//        instance.login(id, password);
//        fail("test failed");
//    }
//
//    /**
//     * Test of setUser method, of class authSessionLocal.
//     */
//    @Test
//    public void testSetUser() {
//        System.out.println("setUser");
//        User user = new User();
//        user.setNachname("Mueller");
//        user.setVorname("Hans");
//        user.setRolle(1);
//        user.setUserId(1);
//        user.setPassword("passwort");
////        authSessionLocal instance = new authSessionLocalImpl();
//        instance.setUser(user);
//        fail("test failed");
//    }
//
//    public class authSessionLocalImpl implements authSessionLocal {
//
//        public User getCurrentUser() {
//            return null;
//        }
//
//        public void login(int id, String password) {
//        }
//
//        public void setUser(User user) {
//        }
//    }
//    
//}
