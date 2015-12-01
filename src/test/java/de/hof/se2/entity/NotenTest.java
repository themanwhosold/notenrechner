/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.entity;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Schmidbauer
 */
public class NotenTest {
    
    public NotenTest() {
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
     * Test of getIdNoten method, of class Noten.
     */
    @Test
    public void testGetIdNoten() {
        System.out.println("getIdNoten");
        Noten instance = new Noten();
        Integer expResult = null;
        Integer result = instance.getIdNoten();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdNoten method, of class Noten.
     */
    @Test
    public void testSetIdNoten() {
        System.out.println("setIdNoten");
        Integer idNoten = null;
        Noten instance = new Noten();
        instance.setIdNoten(idNoten);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNote method, of class Noten.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Noten instance = new Noten();
        Integer expResult = null;
        Integer result = instance.getNote();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNote method, of class Noten.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        Integer note = null;
        Noten instance = new Noten();
        instance.setNote(note);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWunschnote method, of class Noten.
     */
    @Test
    public void testGetWunschnote() {
        System.out.println("getWunschnote");
        Noten instance = new Noten();
        Integer expResult = null;
        Integer result = instance.getWunschnote();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWunschnote method, of class Noten.
     */
    @Test
    public void testSetWunschnote() {
        System.out.println("setWunschnote");
        Integer wunschnote = null;
        Noten instance = new Noten();
        instance.setWunschnote(wunschnote);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEinzelgewicht method, of class Noten.
     */
    @Test
    public void testGetEinzelgewicht() {
        System.out.println("getEinzelgewicht");
        Noten instance = new Noten();
        int expResult = 0;
        int result = instance.getEinzelgewicht();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEinzelgewicht method, of class Noten.
     */
    @Test
    public void testSetEinzelgewicht() {
        System.out.println("setEinzelgewicht");
        int einzelgewicht = 0;
        Noten instance = new Noten();
        instance.setEinzelgewicht(einzelgewicht);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatrikelnr method, of class Noten.
     */
    @Test
    public void testGetMatrikelnr() {
        System.out.println("getMatrikelnr");
        Noten instance = new Noten();
        Personen expResult = null;
        Personen result = instance.getMatrikelnr();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatrikelnr method, of class Noten.
     */
    @Test
    public void testSetMatrikelnr() {
        System.out.println("setMatrikelnr");
        Personen matrikelnr = null;
        Noten instance = new Noten();
        instance.setMatrikelnr(matrikelnr);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenartId method, of class Noten.
     */
    @Test
    public void testGetNotenartId() {
        System.out.println("getNotenartId");
        Noten instance = new Noten();
        Notenart expResult = null;
        Notenart result = instance.getNotenartId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotenartId method, of class Noten.
     */
    @Test
    public void testSetNotenartId() {
        System.out.println("setNotenartId");
        Notenart notenartId = null;
        Noten instance = new Noten();
        instance.setNotenartId(notenartId);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudienfachId method, of class Noten.
     */
    @Test
    public void testGetStudienfachId() {
        System.out.println("getStudienfachId");
        Noten instance = new Noten();
        Studienfaecher expResult = null;
        Studienfaecher result = instance.getStudienfachId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudienfachId method, of class Noten.
     */
    @Test
    public void testSetStudienfachId() {
        System.out.println("setStudienfachId");
        Studienfaecher studienfachId = null;
        Noten instance = new Noten();
        instance.setStudienfachId(studienfachId);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Noten.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Noten instance = new Noten();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Noten.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Noten instance = new Noten();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Noten.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Noten instance = new Noten();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
