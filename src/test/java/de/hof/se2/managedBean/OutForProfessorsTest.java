/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import de.hof.se2.entity.Noten;
import de.hof.se2.entity.Personen;
import de.hof.se2.entity.Studienfaecher;
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
public class OutForProfessorsTest {
    
    public OutForProfessorsTest() {
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
     * Test of getProfessor method, of class OutForProfessors.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        int Dozent_id = 0;
        OutForProfessors instance = new OutForProfessors();
        Personen expResult = null;
        Personen result = instance.getProfessor(Dozent_id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of notenListByProfessor method, of class OutForProfessors.
     */
    @Test
    public void testNotenListByProfessor() {
        System.out.println("notenListByProfessor");
        int dozentID = 0;
        OutForProfessors instance = new OutForProfessors();
        List<Noten> expResult = null;
        List<Noten> result = instance.notenListByProfessor(dozentID);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of StudienfaecherListByProfessor method, of class OutForProfessors.
     */
    @Test
    public void testStudienfaecherListByProfessor() {
        System.out.println("StudienfaecherListByProfessor");
        int dozentID = 0;
        OutForProfessors instance = new OutForProfessors();
        List<Studienfaecher> expResult = null;
        List<Studienfaecher> result = instance.StudienfaecherListByProfessor(dozentID);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of notenListByProfessorStudienfach method, of class OutForProfessors.
     */
    @Test
    public void testNotenListByProfessorStudienfach() {
        System.out.println("notenListByProfessorStudienfach");
        int dozentID = 0;
        int studienfachID = 0;
        OutForProfessors instance = new OutForProfessors();
        List<Noten> expResult = null;
        List<Noten> result = instance.notenListByProfessorStudienfach(dozentID, studienfachID);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class OutForProfessors.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int personId = 0;
        OutForProfessors instance = new OutForProfessors();
        Personen expResult = null;
        Personen result = instance.getPerson(personId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistik method, of class OutForProfessors.
     */
    @Test
    public void testGetStatistik() {
        System.out.println("getStatistik");
        int idStudienfach = 0;
        OutForProfessors instance = new OutForProfessors();
        List<Statistik> expResult = null;
        List<Statistik> result = instance.getStatistik(idStudienfach);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
