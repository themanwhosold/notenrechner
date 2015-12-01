/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.eigeneNoten.Endnote;
import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
import de.hof.se2.test.Statistik;
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
public class OutForStudentsTest {
    
    public OutForStudentsTest() {
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
     * Test of getAllNotenForStudent method, of class OutForStudents.
     */
    @Test
    public void testGetAllNotenForStudent() {
        System.out.println("getAllNotenForStudent");
        int matrikelNr = 0;
        OutForStudents instance = new OutForStudents();
        List<Noten> expResult = null;
        List<Noten> result = instance.getAllNotenForStudent(matrikelNr);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class OutForStudents.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        int matrikelNr = 0;
        OutForStudents instance = new OutForStudents();
        Personen expResult = null;
        Personen result = instance.getStudent(matrikelNr);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudent method, of class OutForStudents.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        int matrikelNr = 0;
        OutForStudents instance = new OutForStudents();
        instance.setStudent(matrikelNr);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArithmetischesMittel method, of class OutForStudents.
     */
    @Test
    public void testGetArithmetischesMittel() {
        System.out.println("getArithmetischesMittel");
        int idStudienfach = 0;
        OutForStudents instance = new OutForStudents();
        double expResult = 0.0;
        double result = instance.getArithmetischesMittel(idStudienfach);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVarianz method, of class OutForStudents.
     */
    @Test
    public void testGetVarianz() {
        System.out.println("getVarianz");
        int idStudienfach = 0;
        OutForStudents instance = new OutForStudents();
        double expResult = 0.0;
        double result = instance.getVarianz(idStudienfach);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStandardabweichung method, of class OutForStudents.
     */
    @Test
    public void testGetStandardabweichung() {
        System.out.println("getStandardabweichung");
        int idStudienfach = 0;
        OutForStudents instance = new OutForStudents();
        double expResult = 0.0;
        double result = instance.getStandardabweichung(idStudienfach);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedian method, of class OutForStudents.
     */
    @Test
    public void testGetMedian() {
        System.out.println("getMedian");
        int idStudienfach = 0;
        OutForStudents instance = new OutForStudents();
        int expResult = 0;
        int result = instance.getMedian(idStudienfach);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistik method, of class OutForStudents.
     */
    @Test
    public void testGetStatistik_int() {
        System.out.println("getStatistik");
        int idStudienfach = 0;
        OutForStudents instance = new OutForStudents();
        List<Statistik> expResult = null;
        List<Statistik> result = instance.getStatistik(idStudienfach);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHallo method, of class OutForStudents.
     */
    @Test
    public void testGetHallo() {
        System.out.println("getHallo");
        OutForStudents instance = new OutForStudents();
        String expResult = "";
        String result = instance.getHallo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndnote method, of class OutForStudents.
     */
    @Test
    public void testGetEndnote() {
        System.out.println("getEndnote");
        int personId = 0;
        OutForStudents instance = new OutForStudents();
        Endnote expResult = null;
        Endnote result = instance.getEndnote(personId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWunschEndnote method, of class OutForStudents.
     */
    @Test
    public void testGetWunschEndnote() {
        System.out.println("getWunschEndnote");
        int personId = 0;
        OutForStudents instance = new OutForStudents();
        double expResult = 0.0;
        double result = instance.getWunschEndnote(personId);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class OutForStudents.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int personId = 0;
        OutForStudents instance = new OutForStudents();
        Personen expResult = null;
        Personen result = instance.getPerson(personId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistik method, of class OutForStudents.
     */
    @Test
    public void testGetStatistik_List() {
        System.out.println("getStatistik");
        List<Noten> notenListe = null;
        OutForStudents instance = new OutForStudents();
        Statistik expResult = null;
        Statistik result = instance.getStatistik(notenListe);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZwischenpruefungsnote method, of class OutForStudents.
     */
    @Test
    public void testGetZwischenpruefungsnote() {
        System.out.println("getZwischenpruefungsnote");
        int personID = 0;
        OutForStudents instance = new OutForStudents();
        Zwischenpruefungsnote expResult = null;
        Zwischenpruefungsnote result = instance.getZwischenpruefungsnote(personID);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
