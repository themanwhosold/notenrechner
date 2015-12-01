/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.entity;

import java.util.Date;
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
public class PersonenTest {
    
    public PersonenTest() {
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
     * Test of getIdPersonen method, of class Personen.
     */
    @Test
    public void testGetIdPersonen() {
        System.out.println("getIdPersonen");
        Personen instance = new Personen();
        Integer expResult = null;
        Integer result = instance.getIdPersonen();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPersonen method, of class Personen.
     */
    @Test
    public void testSetIdPersonen() {
        System.out.println("setIdPersonen");
        Integer idPersonen = null;
        Personen instance = new Personen();
        instance.setIdPersonen(idPersonen);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNachname method, of class Personen.
     */
    @Test
    public void testGetNachname() {
        System.out.println("getNachname");
        Personen instance = new Personen();
        String expResult = "";
        String result = instance.getNachname();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNachname method, of class Personen.
     */
    @Test
    public void testSetNachname() {
        System.out.println("setNachname");
        String nachname = "";
        Personen instance = new Personen();
        instance.setNachname(nachname);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVorname method, of class Personen.
     */
    @Test
    public void testGetVorname() {
        System.out.println("getVorname");
        Personen instance = new Personen();
        String expResult = "";
        String result = instance.getVorname();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVorname method, of class Personen.
     */
    @Test
    public void testSetVorname() {
        System.out.println("setVorname");
        String vorname = "";
        Personen instance = new Personen();
        instance.setVorname(vorname);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBioGeschlecht method, of class Personen.
     */
    @Test
    public void testGetBioGeschlecht() {
        System.out.println("getBioGeschlecht");
        Personen instance = new Personen();
        boolean expResult = false;
        boolean result = instance.getBioGeschlecht();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBioGeschlecht method, of class Personen.
     */
    @Test
    public void testSetBioGeschlecht() {
        System.out.println("setBioGeschlecht");
        boolean bioGeschlecht = false;
        Personen instance = new Personen();
        instance.setBioGeschlecht(bioGeschlecht);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGeburtsdatum method, of class Personen.
     */
    @Test
    public void testGetGeburtsdatum() {
        System.out.println("getGeburtsdatum");
        Personen instance = new Personen();
        Date expResult = null;
        Date result = instance.getGeburtsdatum();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGeburtsdatum method, of class Personen.
     */
    @Test
    public void testSetGeburtsdatum() {
        System.out.println("setGeburtsdatum");
        Date geburtsdatum = null;
        Personen instance = new Personen();
        instance.setGeburtsdatum(geburtsdatum);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswort method, of class Personen.
     */
    @Test
    public void testGetPasswort() {
        System.out.println("getPasswort");
        Personen instance = new Personen();
        String expResult = "";
        String result = instance.getPasswort();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswort method, of class Personen.
     */
    @Test
    public void testSetPasswort() {
        System.out.println("setPasswort");
        String passwort = "";
        Personen instance = new Personen();
        instance.setPasswort(passwort);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolle method, of class Personen.
     */
    @Test
    public void testGetRolle() {
        System.out.println("getRolle");
        Personen instance = new Personen();
        Short expResult = null;
        Short result = instance.getRolle();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRolle method, of class Personen.
     */
    @Test
    public void testSetRolle() {
        System.out.println("setRolle");
        Short rolle = null;
        Personen instance = new Personen();
        instance.setRolle(rolle);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudiengangId method, of class Personen.
     */
    @Test
    public void testGetStudiengangId() {
        System.out.println("getStudiengangId");
        Personen instance = new Personen();
        Studiengang expResult = null;
        Studiengang result = instance.getStudiengangId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudiengangId method, of class Personen.
     */
    @Test
    public void testSetStudiengangId() {
        System.out.println("setStudiengangId");
        Studiengang studiengangId = null;
        Personen instance = new Personen();
        instance.setStudiengangId(studiengangId);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudienfaecherList method, of class Personen.
     */
    @Test
    public void testGetStudienfaecherList() {
        System.out.println("getStudienfaecherList");
        Personen instance = new Personen();
        List<Studienfaecher> expResult = null;
        List<Studienfaecher> result = instance.getStudienfaecherList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudienfaecherList method, of class Personen.
     */
    @Test
    public void testSetStudienfaecherList() {
        System.out.println("setStudienfaecherList");
        List<Studienfaecher> studienfaecherList = null;
        Personen instance = new Personen();
        instance.setStudienfaecherList(studienfaecherList);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenList method, of class Personen.
     */
    @Test
    public void testGetNotenList() {
        System.out.println("getNotenList");
        Personen instance = new Personen();
        List<Noten> expResult = null;
        List<Noten> result = instance.getNotenList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotenList method, of class Personen.
     */
    @Test
    public void testSetNotenList() {
        System.out.println("setNotenList");
        List<Noten> notenList = null;
        Personen instance = new Personen();
        instance.setNotenList(notenList);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Personen.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Personen instance = new Personen();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Personen.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Personen instance = new Personen();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Personen.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Personen instance = new Personen();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
