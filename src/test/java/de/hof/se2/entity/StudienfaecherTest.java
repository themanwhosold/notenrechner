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
public class StudienfaecherTest {
    
    public StudienfaecherTest() {
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
     * Test of getIdStudienfach method, of class Studienfaecher.
     */
    @Test
    public void testGetIdStudienfach() {
        System.out.println("getIdStudienfach");
        Studienfaecher instance = new Studienfaecher();
        Integer expResult = null;
        Integer result = instance.getIdStudienfach();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdStudienfach method, of class Studienfaecher.
     */
    @Test
    public void testSetIdStudienfach() {
        System.out.println("setIdStudienfach");
        Integer idStudienfach = null;
        Studienfaecher instance = new Studienfaecher();
        instance.setIdStudienfach(idStudienfach);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBezeichnung method, of class Studienfaecher.
     */
    @Test
    public void testGetBezeichnung() {
        System.out.println("getBezeichnung");
        Studienfaecher instance = new Studienfaecher();
        String expResult = "";
        String result = instance.getBezeichnung();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBezeichnung method, of class Studienfaecher.
     */
    @Test
    public void testSetBezeichnung() {
        System.out.println("setBezeichnung");
        String bezeichnung = "";
        Studienfaecher instance = new Studienfaecher();
        instance.setBezeichnung(bezeichnung);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemester method, of class Studienfaecher.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        Studienfaecher instance = new Studienfaecher();
        int expResult = 0;
        int result = instance.getSemester();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSemester method, of class Studienfaecher.
     */
    @Test
    public void testSetSemester() {
        System.out.println("setSemester");
        int semester = 0;
        Studienfaecher instance = new Studienfaecher();
        instance.setSemester(semester);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDozentId method, of class Studienfaecher.
     */
    @Test
    public void testGetDozentId() {
        System.out.println("getDozentId");
        Studienfaecher instance = new Studienfaecher();
        Personen expResult = null;
        Personen result = instance.getDozentId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDozentId method, of class Studienfaecher.
     */
    @Test
    public void testSetDozentId() {
        System.out.println("setDozentId");
        Personen dozentId = null;
        Studienfaecher instance = new Studienfaecher();
        instance.setDozentId(dozentId);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudiengangId method, of class Studienfaecher.
     */
    @Test
    public void testGetStudiengangId() {
        System.out.println("getStudiengangId");
        Studienfaecher instance = new Studienfaecher();
        Studiengang expResult = null;
        Studiengang result = instance.getStudiengangId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudiengangId method, of class Studienfaecher.
     */
    @Test
    public void testSetStudiengangId() {
        System.out.println("setStudiengangId");
        Studiengang studiengangId = null;
        Studienfaecher instance = new Studienfaecher();
        instance.setStudiengangId(studiengangId);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenList method, of class Studienfaecher.
     */
    @Test
    public void testGetNotenList() {
        System.out.println("getNotenList");
        Studienfaecher instance = new Studienfaecher();
        List<Noten> expResult = null;
        List<Noten> result = instance.getNotenList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotenList method, of class Studienfaecher.
     */
    @Test
    public void testSetNotenList() {
        System.out.println("setNotenList");
        List<Noten> notenList = null;
        Studienfaecher instance = new Studienfaecher();
        instance.setNotenList(notenList);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Studienfaecher.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Studienfaecher instance = new Studienfaecher();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Studienfaecher.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Studienfaecher instance = new Studienfaecher();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Studienfaecher.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Studienfaecher instance = new Studienfaecher();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
