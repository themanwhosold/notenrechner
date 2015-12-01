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
public class CredentialsTest {
    
    public CredentialsTest() {
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
     * Test of getUsername method, of class Credentials.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Credentials instance = new Credentials();
        int expResult = 0;
        int result = instance.getUsername();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Credentials.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        int username = 0;
        Credentials instance = new Credentials();
        instance.setUsername(username);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Credentials.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Credentials instance = new Credentials();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Credentials.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Credentials instance = new Credentials();
        instance.setPassword(password);
        fail("The test case is a prototype.");
    }
    
}
