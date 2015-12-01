/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.managedBean.User;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Schmidbauer
 */
public class authSessionTest {
    
    public authSessionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

    }
    
    
    

    /**
     * Test of login method, of class authSession.
     */
    
    
    @Test
    
    
    public void testLogin() throws Exception {
        System.out.println("login");
        int id = 1;
        String password = "passwort";
        authSession instance = new authSession();
        instance.login(id, password);
        assertEquals(true, instance.isLoggedIn());
        fail("Test Failed");
    }

    /**
     * Test of logout method, of class authSession.
     */
    @Test
    public void testLogout() throws Exception {
        System.out.println("logout");
        authSession instance = new authSession();
        instance.login(1,"passwort");
        instance.logout();
        assertEquals(false, instance.isLoggedIn());
        fail("Test Failed");
    }

    /**
     * Test of isLoggedIn method, of class authSession.
     */
    @Test
    public void testIsLoggedIn() throws Exception {
        System.out.println("isLoggedIn");
        authSession instance = new authSession();
        boolean expResult = false;
        boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
        expResult = true;
        instance.login(1, "passwort");
        result= instance.isLoggedIn();
        assertEquals(expResult, result);
        fail("Test failed");
    }

    /**
     * Test of getCurrentUser method, of class authSession.
     */
    @Test
    public void testGetCurrentUser() throws Exception {
        System.out.println("getCurrentUser");
        authSession instance = new authSession();
        instance.login(1, "passwort");
        User result = instance.getCurrentUser();
        assertNotNull(result);
        fail("Test failed");
    }

    /**
     * Test of getUser method, of class authSession.
     */
    @Test
    public void testGetUser() throws Exception {
        System.out.println("getUser");
        authSession instance = new authSession();
        instance.login(1, "passwort");
        User result = instance.getUser();
        assertNotNull(result);
        fail("Test Failed");
    }

    /**
     * Test of setUser method, of class authSession.
     */
    @Test
    public void testSetUser() throws Exception {
        System.out.println("setUser");
        User user = new User();
        user.setNachname("Mueller");
        user.setVorname("Hans");
        user.setRolle(1);
        user.setUserId(1);
        user.setPassword("passwort");
        authSession instance = new authSession();
        instance.setUser(user);
        fail("Test failed");
    }
    
}
