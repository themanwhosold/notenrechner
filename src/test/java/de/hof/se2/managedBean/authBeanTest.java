/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Schmidbauer
 */
public class authBeanTest {
    
    public authBeanTest() {
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
     * Test of login method, of class authBean.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        int id = 0;
        String password = "";
        authBean instance = new authBean();
        instance.login(id, password);
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class authBean.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        authBean instance = new authBean();
        instance.logout();
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLoggedIn method, of class authBean.
     */
    @Test
    public void testIsLoggedIn() {
        System.out.println("isLoggedIn");
        authBean instance = new authBean();
        boolean expResult = false;
        boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentUser method, of class authBean.
     */
    @Test
    public void testGetCurrentUser() {
        System.out.println("getCurrentUser");
        authBean instance = new authBean();
        User expResult = null;
        User result = instance.getCurrentUser();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
