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
public class EndnoteTest {
    
    public EndnoteTest() {
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
     * Test of getEndnote method, of class Endnote.
     */
    @Test
    public void testGetEndnote() {
        System.out.println("getEndnote");
        Endnote instance = null;
        double expResult = 0.0;
        double result = instance.getEndnote();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndnote method, of class Endnote.
     */
    @Test
    public void testSetEndnote() {
        System.out.println("setEndnote");
        double endnote = 0.0;
        Endnote instance = null;
        instance.setEndnote(endnote);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeistungsnachweisnote method, of class Endnote.
     */
    @Test
    public void testGetLeistungsnachweisnote() {
        System.out.println("getLeistungsnachweisnote");
        Endnote instance = null;
        double expResult = 0.0;
        double result = instance.getLeistungsnachweisnote();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeistungsnachweisnote method, of class Endnote.
     */
    @Test
    public void testSetLeistungsnachweisnote() {
        System.out.println("setLeistungsnachweisnote");
        double leistungsnachweisnote = 0.0;
        Endnote instance = null;
        instance.setLeistungsnachweisnote(leistungsnachweisnote);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZwischenpruefungsnote method, of class Endnote.
     */
    @Test
    public void testGetZwischenpruefungsnote() {
        System.out.println("getZwischenpruefungsnote");
        Endnote instance = null;
        Zwischenpruefungsnote expResult = null;
        Zwischenpruefungsnote result = instance.getZwischenpruefungsnote();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZwischenpruefungsnote method, of class Endnote.
     */
    @Test
    public void testSetZwischenpruefungsnote() {
        System.out.println("setZwischenpruefungsnote");
        Zwischenpruefungsnote zwischenpruefungsnote = null;
        Endnote instance = null;
        instance.setZwischenpruefungsnote(zwischenpruefungsnote);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenListe method, of class Endnote.
     */
    @Test
    public void testGetNotenListe() {
        System.out.println("getNotenListe");
        Endnote instance = null;
        List<Noten> expResult = null;
        List<Noten> result = instance.getNotenListe();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotenListe method, of class Endnote.
     */
    @Test
    public void testSetNotenListe() {
        System.out.println("setNotenListe");
        List<Noten> notenListe = null;
        Endnote instance = null;
        instance.setNotenListe(notenListe);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Endnote.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Endnote instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoteMultiGewichtung method, of class Endnote.
     */
    @Test
    public void testGetNoteMultiGewichtung() {
        System.out.println("getNoteMultiGewichtung");
        Endnote instance = null;
        double expResult = 0.0;
        double result = instance.getNoteMultiGewichtung();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoteMultiGewichtung method, of class Endnote.
     */
    @Test
    public void testSetNoteMultiGewichtung() {
        System.out.println("setNoteMultiGewichtung");
        double noteMultiGewichtung = 0.0;
        Endnote instance = null;
        instance.setNoteMultiGewichtung(noteMultiGewichtung);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSummeGewichtung method, of class Endnote.
     */
    @Test
    public void testGetSummeGewichtung() {
        System.out.println("getSummeGewichtung");
        Endnote instance = null;
        long expResult = 0L;
        long result = instance.getSummeGewichtung();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSummeGewichtung method, of class Endnote.
     */
    @Test
    public void testSetSummeGewichtung() {
        System.out.println("setSummeGewichtung");
        long summeGewichtung = 0L;
        Endnote instance = null;
        instance.setSummeGewichtung(summeGewichtung);
        fail("The test case is a prototype.");
    }
    
}
