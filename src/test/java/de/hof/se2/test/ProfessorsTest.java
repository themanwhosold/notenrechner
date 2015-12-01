/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.test;

import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
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
public class ProfessorsTest {
    
    public ProfessorsTest() {
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
     * Test of getPerson method, of class Professors.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        Professors instance = null;
        Personen expResult = null;
        Personen result = instance.getPerson();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerson method, of class Professors.
     */
    @Test
    public void testSetPerson() {
        System.out.println("setPerson");
        Personen person = null;
        Professors instance = null;
        instance.setPerson(person);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenlistByDozentId method, of class Professors.
     */
    @Test
    public void testGetNotenlistByDozentId() {
        System.out.println("getNotenlistByDozentId");
        Personen person = null;
        Professors instance = null;
        List<Noten> expResult = null;
        List<Noten> result = instance.getNotenlistByDozentId(person);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotenListByProfessor method, of class Professors.
     */
    @Test
    public void testGetNotenListByProfessor() {
        System.out.println("getNotenListByProfessor");
        Professors instance = null;
        List<Noten> expResult = null;
        List<Noten> result = instance.getNotenListByProfessor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
