/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.entity;

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
public class NotenartTest {
    
    public NotenartTest() {
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
     * Test of getIdNotenart method, of class Notenart.
     */
    @Test
    public void testGetIdNotenart() {
        System.out.println("getIdNotenart");
        Notenart instance = new Notenart();
        Integer expResult = null;
        Integer result = instance.getIdNotenart();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdNotenart method, of class Notenart.
     */
    @Test
    public void testSetIdNotenart() {
        System.out.println("setIdNotenart");
        Integer idNotenart = null;
        Notenart instance = new Notenart();
        instance.setIdNotenart(idNotenart);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBezeichnung method, of class Notenart.
     */
    @Test
    public void testGetBezeichnung() {
        System.out.println("getBezeichnung");
        Notenart instance = new Notenart();
        String expResult = "";
        String result = instance.getBezeichnung();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBezeichnung method, of class Notenart.
     */
    @Test
    public void testSetBezeichnung() {
        System.out.println("setBezeichnung");
        String bezeichnung = "";
        Notenart instance = new Notenart();
        instance.setBezeichnung(bezeichnung);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenList method, of class Notenart.
     */
    @Test
    public void testGetNotenList() {
        System.out.println("getNotenList");
        Notenart instance = new Notenart();
        List<Noten> expResult = null;
        List<Noten> result = instance.getNotenList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotenList method, of class Notenart.
     */
    @Test
    public void testSetNotenList() {
        System.out.println("setNotenList");
        List<Noten> notenList = null;
        Notenart instance = new Notenart();
        instance.setNotenList(notenList);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudiengangId method, of class Notenart.
     */
    @Test
    public void testGetStudiengangId() {
        System.out.println("getStudiengangId");
        Notenart instance = new Notenart();
        Studiengang expResult = null;
        Studiengang result = instance.getStudiengangId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudiengangId method, of class Notenart.
     */
    @Test
    public void testSetStudiengangId() {
        System.out.println("setStudiengangId");
        Studiengang studiengangId = null;
        Notenart instance = new Notenart();
        instance.setStudiengangId(studiengangId);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Notenart.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Notenart instance = new Notenart();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Notenart.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Notenart instance = new Notenart();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Notenart.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Notenart instance = new Notenart();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
