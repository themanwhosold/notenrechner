/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.test;

import de.hof.se2.entity.Noten;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Schmidbauer
 */
public class NotenManagedTest {
    
    public NotenManagedTest() {
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
     * Test of getAllNoten method, of class NotenManaged.
     */
    @Test
    public void testGetAllNoten() {
        System.out.println("getAllNoten");
        NotenManaged instance = new NotenManaged();
        List<Noten> expResult = null;
        List<Noten> result = instance.getAllNoten();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
