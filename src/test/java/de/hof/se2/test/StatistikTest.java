/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.test;

import de.hof.se2.entity.Notenart;
import de.hof.se2.entity.Studienfaecher;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Schmidbauer
 */
public class StatistikTest {
    
    public StatistikTest() {
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
     * Test of getArithmetischesMittel method, of class Statistik.
     */
    @Test
    public void testGetArithmetischesMittel() {
        System.out.println("getArithmetischesMittel");
        Statistik instance = null;
        double expResult = 0.0;
        double result = instance.getArithmetischesMittel();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStandardabweichung method, of class Statistik.
     */
    @Test
    public void testGetStandardabweichung() {
        System.out.println("getStandardabweichung");
        Statistik instance = null;
        double expResult = 0.0;
        double result = instance.getStandardabweichung();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedian method, of class Statistik.
     */
    @Test
    public void testGetMedian() {
        System.out.println("getMedian");
        Statistik instance = null;
        int expResult = 0;
        int result = instance.getMedian();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVarianz method, of class Statistik.
     */
    @Test
    public void testGetVarianz() {
        System.out.println("getVarianz");
        Statistik instance = null;
        double expResult = 0.0;
        double result = instance.getVarianz();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxNote method, of class Statistik.
     */
    @Test
    public void testGetMaxNote() {
        System.out.println("getMaxNote");
        Statistik instance = null;
        int expResult = 0;
        int result = instance.getMaxNote();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinNote method, of class Statistik.
     */
    @Test
    public void testGetMinNote() {
        System.out.println("getMinNote");
        Statistik instance = null;
        int expResult = 0;
        int result = instance.getMinNote();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudienfachID method, of class Statistik.
     */
    @Test
    public void testGetStudienfachID() {
        System.out.println("getStudienfachID");
        Statistik instance = null;
        Studienfaecher expResult = null;
        Studienfaecher result = instance.getStudienfachID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenartID method, of class Statistik.
     */
    @Test
    public void testGetNotenartID() {
        System.out.println("getNotenartID");
        Statistik instance = null;
        Notenart expResult = null;
        Notenart result = instance.getNotenartID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Statistik.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Statistik instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
