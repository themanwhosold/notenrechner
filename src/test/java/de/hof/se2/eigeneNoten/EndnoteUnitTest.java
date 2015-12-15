/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

import de.hof.se2.entity.Noten;
import java.util.ArrayList;
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
public class EndnoteUnitTest {
    
    public EndnoteUnitTest() {
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
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        assertNotNull(instance.getEndnote());
//        fail("Endnote nicht erfolgreich geholt.");
    }

    /**
     * Test of setEndnote method, of class Endnote.
     */
    @Test
    public void testSetEndnote() {
        System.out.println("setEndnote");
        double endnote = 0.0;
        
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        instance.setEndnote(endnote);
//        fail("Endnote nicht erfolgreich gesetzt");
    }

    /**
     * Test of getLeistungsnachweisnote method, of class Endnote.
     */
    @Test
    public void testGetLeistungsnachweisnote() {
        System.out.println("getLeistungsnachweisnote");
        
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        assertNotNull(instance.getLeistungsnachweisnote());
//        fail("Lestungsnachweisnote nicht erfolgreich geholt.");
    }

    /**
     * Test of setLeistungsnachweisnote method, of class Endnote.
     */
    @Test
    public void testSetLeistungsnachweisnote() {
        System.out.println("setLeistungsnachweisnote");
        double leistungsnachweisnote = 0.0;
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        instance.setLeistungsnachweisnote(leistungsnachweisnote);
//        fail("Lestungsnachweisnote nicht erfolgreich gesetzt");
    }

    /**
     * Test of getZwischenpruefungsnote method, of class Endnote.
     */
    @Test
    public void testGetZwischenpruefungsnote() {
        System.out.println("getZwischenpruefungsnote");
        
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        assertNotNull(instance.getZwischenpruefungsnote());
//        fail("Zwischenprüfungsnte nicht erfolgreich geholt.");
    }

    /**
     * Test of setZwischenpruefungsnote method, of class Endnote.
     */
    @Test
    public void testSetZwischenpruefungsnote() {
        System.out.println("setZwischenpruefungsnote");
        Zwischenpruefungsnote zwischenpruefungsnote = new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true,true);
        
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        instance.setZwischenpruefungsnote(zwischenpruefungsnote);
//        fail("Zwischenprüfungsnte nicht erfolgreich gesetzt");
    }

    /**
     * Test of getNotenListe method, of class Endnote.
     */
    @Test
    public void testGetNotenListe() {
        System.out.println("getNotenListe");
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        assertNotNull(instance.getNotenListe());
//        fail("Notenliste nicht erfolgreich geholt");
    }

    /**
     * Test of setNotenListe method, of class Endnote.
     */
    @Test
    public void testSetNotenListe() {
        System.out.println("setNotenListe");
        List<Noten> notenListe = new ArrayList<>();
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        instance.setNotenListe(notenListe);
//        fail("Notenliste nicht erfolgreich gesetzt");
    }

    /**
     * Test of toString method, of class Endnote.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        assertNotNull(instance.toString());
//        fail("ToString nicht erfolgreich");
    }

    /**
     * Test of getNoteMultiGewichtung method, of class Endnote.
     */
    @Test
    public void testGetNoteMultiGewichtung() {
        System.out.println("getNoteMultiGewichtung");
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        assertNotNull(instance.getSummeNoten());
//        fail("Summe der MultiNotenGewichtungen nicht erfolgreich gehholt");
    }

    /**
     * Test of setNoteMultiGewichtung method, of class Endnote.
     */
    @Test
    public void testSetNoteMultiGewichtung() {
        System.out.println("setNoteMultiGewichtung");
        double noteMultiGewichtung = 0.0;
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        instance.setSummeNoten(noteMultiGewichtung);
//        fail("Summe der MultiNotenGewichtungen nicht erfolgreich gesetzt");
    }

    /**
     * Test of getSummeGewichtung method, of class Endnote.
     */
    @Test
    public void testGetSummeGewichtung() {
        System.out.println("getSummeGewichtung");
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        assertNotNull(instance.getSummeGewichtung());
//        fail("Summe der Gewichtungen nicht erfolgreich geholt");
    }

    /**
     * Test of setSummeGewichtung method, of class Endnote.
     */
    @Test
    public void testSetSummeGewichtung() {
        System.out.println("setSummeGewichtung");
        long summeGewichtung = 0L;
        Endnote instance = new Endnote(0, 0, new Zwischenpruefungsnote(
                0, 0, new ArrayList<Noten>(), 0,0,true, true)
                , new ArrayList<Noten>(),0,0, true, true);
        instance.setSummeGewichtung(summeGewichtung);
//        fail("Summe der Gewichtungen nicht erfolgreich gesetzt");
    }
    
}
