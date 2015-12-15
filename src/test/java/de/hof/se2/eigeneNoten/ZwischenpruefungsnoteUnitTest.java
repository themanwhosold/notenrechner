/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

import com.sun.javafx.scene.control.skin.VirtualFlow;
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
public class ZwischenpruefungsnoteUnitTest {
    
    public ZwischenpruefungsnoteUnitTest() {
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
    public void testSetZwischenpruefungsnote() {
        System.out.println("setZwischenpruefungsnote");
//        double zwischenpruefungsnote = 0.0;
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        instance.setZwischenpruefungsnote(15);
//        fail("Zwischenprüfungsnote nicht erfolgreich gesetzt");
    }
    
    @Test
    public void testGetZwischenpruefungsnote() {
        System.out.println("getZwischenpruefungsnote");
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        assertNotNull(instance.getZwischenpruefungsnote());
//        fail("Zwischenprüfungsnote nicht erfolgreich geholt");
    }

    /**
     * Test of setZwischenpruefungsnote method, of class Zwischenpruefungsnote.
     */


    /**
     * Test of getLeistungsnachweisnote method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetLeistungsnachweisnote() {
        System.out.println("getLeistungsnachweisnote");
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        assertNotNull(instance.getLeistungsnachweisnote());
//        fail("Leistungsnachweisnote erfolgreich geholt");
    }

    /**
     * Test of setLeistungsnachweisnote method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetLeistungsnachweisnote() {
        System.out.println("setLeistungsnachweisnote");
        double leistungsnachweisnote = 3.0;
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        instance.setLeistungsnachweisnote(leistungsnachweisnote);
//        fail("Leistungsnachweisnote nicht erfolgreich gesetzt");
    }

    /**
     * Test of getNotenListe method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetNotenListe() {
        System.out.println("getNotenListe");
        
        List<Noten> inputNoten = new ArrayList<>();
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        assertNotNull(instance.getNotenListe());
//        fail("Notenliste erfolgreich geholt");
    }

    /**
     * Test of setNotenListe method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetNotenListe() {
        System.out.println("setNotenListe");
        List<Noten> notenListe = new ArrayList();
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        instance.setNotenListe(notenListe);
//        fail("Setzen der Notenlister nicht erfolgreich");
    }

    /**
     * Test of getNoteMultiGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetNoteMultiGewichtung() {
        System.out.println("getNoteMultiGewichtung");
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        assertNotNull(instance.getSummeZPNoteMitGewichtung());
//        fail("Gesamtgewichtung nicht erfolgreich geholt");
    }

    /**
     * Test of toString method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
                List<Noten> notenListe = new ArrayList();
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        assertNotNull(instance.toString());
//        fail("Tostring nicht erfolgreich");
    }

    /**
     * Test of setNoteMultiGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetNoteMultiGewichtung() {
        System.out.println("setNoteMultiGewichtung");
        long noteMultiGewichtung = 0L;
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        instance.setSummeZPNoteMitGewichtung(noteMultiGewichtung);
//        fail("Notengewichtung nicht erfolgreich");
    }

    /**
     * Test of getSummeGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testGetSummeGewichtung() {
        System.out.println("getSummeGewichtung");
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        assertNotNull(instance.getSummeGewichtung());
//        fail("Gwichtungssumme nicht erfolgreich geholt");
    }

    /**
     * Test of setSummeGewichtung method, of class Zwischenpruefungsnote.
     */
    @Test
    public void testSetSummeGewichtung() {
        System.out.println("setSummeGewichtung");
        long summeGewichtung = 0L;
        Zwischenpruefungsnote instance = new Zwischenpruefungsnote(0, 0, new ArrayList<Noten>(), 0, 0, true, true);
        instance.setSummeGewichtung(summeGewichtung);
//        fail("summeGewichtung nicht erfolgreich geholt");
    }
    
}
