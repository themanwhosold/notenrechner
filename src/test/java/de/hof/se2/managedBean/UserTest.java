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
public class UserTest {
    
    public UserTest() {
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
     * Test of getVorname method, of class User.
     */
    @Test
    public void testGetVorname() {
        System.out.println("getVorname");
        User instance = new User();
        String expResult = "";
        String result = instance.getVorname();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVorname method, of class User.
     */
    @Test
    public void testSetVorname() {
        System.out.println("setVorname");
        String vorname = "";
        User instance = new User();
        instance.setVorname(vorname);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNachname method, of class User.
     */
    @Test
    public void testGetNachname() {
        System.out.println("getNachname");
        User instance = new User();
        String expResult = "";
        String result = instance.getNachname();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNachname method, of class User.
     */
    @Test
    public void testSetNachname() {
        System.out.println("setNachname");
        String nachname = "";
        User instance = new User();
        instance.setNachname(nachname);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolle method, of class User.
     */
    @Test
    public void testGetRolle() {
        System.out.println("getRolle");
        User instance = new User();
        int expResult = 0;
        int result = instance.getRolle();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRolle method, of class User.
     */
    @Test
    public void testSetRolle() {
        System.out.println("setRolle");
        int rolle = 0;
        User instance = new User();
        instance.setRolle(rolle);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserId method, of class User.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        User instance = new User();
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class User.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        int userId = 0;
        User instance = new User();
        instance.setUserId(userId);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
