/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

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
public class ZwischenpruefungsnoteTest {
    
    public ZwischenpruefungsnoteTest() {
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
     * Test of getZwischenpruefungsnote method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetZwischenpruefungsnote() {
        System.out.println("getZwischenpruefungsnote");
        Zwischenpruefungsnote instance = null;
        double expResult = 0.0;
        double result = instance.getZwischenpruefungsnote();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZwischenpruefungsnote method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetZwischenpruefungsnote() {
        System.out.println("setZwischenpruefungsnote");
        double zwischenpruefungsnote = 0.0;
        Zwischenpruefungsnote instance = null;
        instance.setZwischenpruefungsnote(zwischenpruefungsnote);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeistungsnachweisnote method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetLeistungsnachweisnote() {
        System.out.println("getLeistungsnachweisnote");
        Zwischenpruefungsnote instance = null;
        double expResult = 0.0;
        double result = instance.getLeistungsnachweisnote();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeistungsnachweisnote method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetLeistungsnachweisnote() {
        System.out.println("setLeistungsnachweisnote");
        double leistungsnachweisnote = 0.0;
        Zwischenpruefungsnote instance = null;
        instance.setLeistungsnachweisnote(leistungsnachweisnote);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenListe method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetNotenListe() {
        System.out.println("getNotenListe");
        Zwischenpruefungsnote instance = null;
        List<Noten> expResult = null;
        List<Noten> result = instance.getNotenListe();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotenListe method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetNotenListe() {
        System.out.println("setNotenListe");
        List<Noten> notenListe = null;
        Zwischenpruefungsnote instance = null;
        instance.setNotenListe(notenListe);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoteMultiGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetNoteMultiGewichtung() {
        System.out.println("getNoteMultiGewichtung");
        Zwischenpruefungsnote instance = null;
        long expResult = 0L;
        long result = instance.getNoteMultiGewichtung();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Zwischenpruefungsnote instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoteMultiGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetNoteMultiGewichtung() {
        System.out.println("setNoteMultiGewichtung");
        long noteMultiGewichtung = 0L;
        Zwischenpruefungsnote instance = null;
        instance.setNoteMultiGewichtung(noteMultiGewichtung);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSummeGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetSummeGewichtung() {
        System.out.println("getSummeGewichtung");
        Zwischenpruefungsnote instance = null;
        long expResult = 0L;
        long result = instance.getSummeGewichtung();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSummeGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetSummeGewichtung() {
        System.out.println("setSummeGewichtung");
        long summeGewichtung = 0L;
        Zwischenpruefungsnote instance = null;
        instance.setSummeGewichtung(summeGewichtung);
        fail("The test case is a prototype.");
    }
    
}
