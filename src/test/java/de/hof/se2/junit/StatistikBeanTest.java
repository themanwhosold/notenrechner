/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.junit;

import de.hof.se2.entity.Noten;
import de.hof.se2.sessionBean.StatistikBean;
import de.hof.se2.test.Statistik;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author max
 */
public class StatistikBeanTest {
    
    public StatistikBeanTest() {
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
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStatistik method, of class StatistikBean.
     */
    @Test
    public void testGetStatistik_int() throws Exception {
        System.out.println("getStatistik");
        int idStudienfach = 0;
        StatistikBean instance = new StatistikBean();
        Statistik expResult = null;
        Statistik result = instance.getStatistik(idStudienfach);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistik method, of class StatistikBean.
     */
    @Test
    public void testGetStatistik_List() throws Exception {
        System.out.println("getStatistik");
        List<Noten> notenListe = new ArrayList<>();
        notenListe.add(new Noten(12, 0));
        StatistikBean instance = new StatistikBean();
        Statistik expResult = null;
        Statistik result = instance.getStatistik(notenListe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
