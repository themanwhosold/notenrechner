/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.entity.Noten;
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
public class StatistikBeanLocalTest {
    
    public StatistikBeanLocalTest() {
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
     * Test of getStatistik method, of class StatistikBeanLocal.
     */
    @Test
    public void testGetStatistik_int() {
        System.out.println("getStatistik");
        int idStudienfach = 0;
        StatistikBeanLocal instance = new StatistikBeanLocalImpl();
        List<Statistik> expResult = null;
        List<Statistik> result = instance.getStatistik(idStudienfach);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistik method, of class StatistikBeanLocal.
     */
    @Test
    public void testGetStatistik_List() {
        System.out.println("getStatistik");
        List<Noten> notenListe = null;
        StatistikBeanLocal instance = new StatistikBeanLocalImpl();
        Statistik expResult = null;
        Statistik result = instance.getStatistik(notenListe);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnzahlNotenArten method, of class StatistikBeanLocal.
     */
    @Test
    public void testGetAnzahlNotenArten() {
        System.out.println("getAnzahlNotenArten");
        int idStudienfach = 0;
        StatistikBeanLocal instance = new StatistikBeanLocalImpl();
        int expResult = 0;
        int result = instance.getAnzahlNotenArten(idStudienfach);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class StatistikBeanLocalImpl implements StatistikBeanLocal {

        public List<Statistik> getStatistik(int idStudienfach) {
            return null;
        }

        public Statistik getStatistik(List<Noten> notenListe) {
            return null;
        }

        public int getAnzahlNotenArten(int idStudienfach) {
            return 0;
        }
    }
    
}
