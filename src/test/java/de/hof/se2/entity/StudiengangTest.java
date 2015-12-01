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
public class StudiengangTest {
    
    public StudiengangTest() {
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
     * Test of getIdStudiengang method, of class Studiengang.
     */
    @Test
    public void testGetIdStudiengang() {
        System.out.println("getIdStudiengang");
        Studiengang instance = new Studiengang();
        Integer expResult = null;
        Integer result = instance.getIdStudiengang();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdStudiengang method, of class Studiengang.
     */
    @Test
    public void testSetIdStudiengang() {
        System.out.println("setIdStudiengang");
        Integer idStudiengang = null;
        Studiengang instance = new Studiengang();
        instance.setIdStudiengang(idStudiengang);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudiengangsleiter method, of class Studiengang.
     */
    @Test
    public void testGetStudiengangsleiter() {
        System.out.println("getStudiengangsleiter");
        Studiengang instance = new Studiengang();
        int expResult = 0;
        int result = instance.getStudiengangsleiter();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudiengangsleiter method, of class Studiengang.
     */
    @Test
    public void testSetStudiengangsleiter() {
        System.out.println("setStudiengangsleiter");
        int studiengangsleiter = 0;
        Studiengang instance = new Studiengang();
        instance.setStudiengangsleiter(studiengangsleiter);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBezeichnung method, of class Studiengang.
     */
    @Test
    public void testGetBezeichnung() {
        System.out.println("getBezeichnung");
        Studiengang instance = new Studiengang();
        String expResult = "";
        String result = instance.getBezeichnung();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBezeichnung method, of class Studiengang.
     */
    @Test
    public void testSetBezeichnung() {
        System.out.println("setBezeichnung");
        String bezeichnung = "";
        Studiengang instance = new Studiengang();
        instance.setBezeichnung(bezeichnung);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnzSemester method, of class Studiengang.
     */
    @Test
    public void testGetAnzSemester() {
        System.out.println("getAnzSemester");
        Studiengang instance = new Studiengang();
        int expResult = 0;
        int result = instance.getAnzSemester();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnzSemester method, of class Studiengang.
     */
    @Test
    public void testSetAnzSemester() {
        System.out.println("setAnzSemester");
        int anzSemester = 0;
        Studiengang instance = new Studiengang();
        instance.setAnzSemester(anzSemester);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrundstudiumBis method, of class Studiengang.
     */
    @Test
    public void testGetGrundstudiumBis() {
        System.out.println("getGrundstudiumBis");
        Studiengang instance = new Studiengang();
        int expResult = 0;
        int result = instance.getGrundstudiumBis();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrundstudiumBis method, of class Studiengang.
     */
    @Test
    public void testSetGrundstudiumBis() {
        System.out.println("setGrundstudiumBis");
        int grundstudiumBis = 0;
        Studiengang instance = new Studiengang();
        instance.setGrundstudiumBis(grundstudiumBis);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonenList method, of class Studiengang.
     */
    @Test
    public void testGetPersonenList() {
        System.out.println("getPersonenList");
        Studiengang instance = new Studiengang();
        List<Personen> expResult = null;
        List<Personen> result = instance.getPersonenList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonenList method, of class Studiengang.
     */
    @Test
    public void testSetPersonenList() {
        System.out.println("setPersonenList");
        List<Personen> personenList = null;
        Studiengang instance = new Studiengang();
        instance.setPersonenList(personenList);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudienfaecherList method, of class Studiengang.
     */
    @Test
    public void testGetStudienfaecherList() {
        System.out.println("getStudienfaecherList");
        Studiengang instance = new Studiengang();
        List<Studienfaecher> expResult = null;
        List<Studienfaecher> result = instance.getStudienfaecherList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudienfaecherList method, of class Studiengang.
     */
    @Test
    public void testSetStudienfaecherList() {
        System.out.println("setStudienfaecherList");
        List<Studienfaecher> studienfaecherList = null;
        Studiengang instance = new Studiengang();
        instance.setStudienfaecherList(studienfaecherList);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenartList method, of class Studiengang.
     */
    @Test
    public void testGetNotenartList() {
        System.out.println("getNotenartList");
        Studiengang instance = new Studiengang();
        List<Notenart> expResult = null;
        List<Notenart> result = instance.getNotenartList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotenartList method, of class Studiengang.
     */
    @Test
    public void testSetNotenartList() {
        System.out.println("setNotenartList");
        List<Notenart> notenartList = null;
        Studiengang instance = new Studiengang();
        instance.setNotenartList(notenartList);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Studiengang.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Studiengang instance = new Studiengang();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Studiengang.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Studiengang instance = new Studiengang();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Studiengang.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Studiengang instance = new Studiengang();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
