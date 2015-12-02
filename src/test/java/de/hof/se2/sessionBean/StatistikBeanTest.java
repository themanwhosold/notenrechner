///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hof.se2.sessionBean;
//
//import de.hof.se2.entity.Noten;
//import de.hof.se2.test.Statistik;
//import java.util.List;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Schmidbauer
// */
//public class StatistikBeanTest {
//    
//    public StatistikBeanTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//
//    /**
//     * Test of getAnzahlNotenArten method, of class StatistikBean.
//     */
//    @Test
//    public void testGetAnzahlNotenArten() throws Exception {
//        System.out.println("getAnzahlNotenArten");
//        int idStudienfach;
//        StatistikBean instance = new StatistikBean();
//        int expResult;
//        int result;
//        
//        /*
//        First Testcase Should not be Zero
//        */
//        idStudienfach=2001;
//        expResult=2;
//        result = instance.getAnzahlNotenArten(idStudienfach);
//        assertEquals(expResult, result);
//        fail("First test failed");
//        /*
//        Second Testcase Should not be Zero
//        */
//        idStudienfach=2011;
//        expResult=1;
//        result = instance.getAnzahlNotenArten(idStudienfach);
//        assertEquals(expResult, result);
//        fail("Second test failed");
//        /*
//        Third Testcase Should be Zero, because the id does not exist
//        */
//        idStudienfach=42;
//        expResult=0;
//        result = instance.getAnzahlNotenArten(idStudienfach);
//        assertEquals(expResult, result);
//        fail("Third test failed");
//        
//    }
//
//    /**
//     * Test of getStatistik method, of class StatistikBean.
//     */
//    @Test
//    public void testGetStatistik_ReturnIstListe() throws Exception {
//        System.out.println("getStatistik als Liste");
//        int idStudienfach = 1001;
//        StatistikBean instance = new StatistikBean();
//        List<Statistik> result = instance.getStatistik(idStudienfach);
//        assertNotNull(result);
//        fail("Test Failed, result should be not null");
//        idStudienfach=42;
//        result = instance.getStatistik(idStudienfach);
//        assertNull(result);
//        fail("Test Failed, result should be null");
//    }
//
//    /**
//     * Test of getStatistik method, of class StatistikBean.
//     */
//    @Test
//    public void testGetStatistik_ReturnIstStatistik() throws Exception {
//        System.out.println("getStatistik als Statistik (deprecated)");
//        List<Noten> notenListe = null;
//        notenListe.add(new Noten(1, 3333));
//        notenListe.add(new Noten(2, 2220));
//        notenListe.add(new Noten(3, 1110));
//        StatistikBean instance = new StatistikBean();
//        Statistik expResult = null;
//        Statistik result = instance.getStatistik(notenListe);
//        assertNotNull(result);
//        fail("The test should be not null");
//        notenListe.clear();
//        result= instance.getStatistik(notenListe);
//        assertNull(result);
//    }
//    
//}
