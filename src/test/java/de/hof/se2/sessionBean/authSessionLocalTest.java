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
public class authSessionLocalTest {
    
    public authSessionLocalTest() {
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
     * Test of getCurrentUser method, of class authSessionLocal.
     */
    @Test
    public void testGetCurrentUser() {
        System.out.println("getCurrentUser");
        authSessionLocal instance = new authSessionLocalImpl();
        User expResult = null;
        User result = instance.getCurrentUser();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class authSessionLocal.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        int id = 0;
        String password = "";
        authSessionLocal instance = new authSessionLocalImpl();
        instance.login(id, password);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class authSessionLocal.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        authSessionLocal instance = new authSessionLocalImpl();
        instance.setUser(user);
        fail("The test case is a prototype.");
    }

    public class authSessionLocalImpl implements authSessionLocal {

        public User getCurrentUser() {
            return null;
        }

        public void login(int id, String password) {
        }

        public void setUser(User user) {
        }
    }
    
}
