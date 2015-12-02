///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hof.se2.sessionBean;
//
//import de.hof.se2.eigeneNoten.Endnote;
//import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
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
//public class BerechnungNotenLocalTest {
//    
//    public BerechnungNotenLocalTest() {
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
//     * Test of getArithmethischesMittel method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetArithmethischesMittel() {
//        System.out.println("getArithmethischesMittel");
//        int idStudienfach = 0;
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        double expResult = 0.0;
//        double result = instance.getArithmethischesMittel(idStudienfach);
//        assertEquals(expResult, result, 0.0);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStandardabweichung method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetStandardabweichung() {
//        System.out.println("getStandardabweichung");
//        int idStudienfach = 0;
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        double expResult = 0.0;
//        double result = instance.getStandardabweichung(idStudienfach);
//        assertEquals(expResult, result, 0.0);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMedian method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetMedian() {
//        System.out.println("getMedian");
//        int idStudienfach = 0;
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        int expResult = 0;
//        int result = instance.getMedian(idStudienfach);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getVarianz method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetVarianz() {
//        System.out.println("getVarianz");
//        int idStudienfach = 0;
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        double expResult = 0.0;
//        double result = instance.getVarianz(idStudienfach);
//        assertEquals(expResult, result, 0.0);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEndnote method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetEndnote() {
//        System.out.println("getEndnote");
//        int matrikelNr = 0;
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        Endnote expResult = null;
//        Endnote result = instance.getEndnote(matrikelNr);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWunschEndnote method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetWunschEndnote() {
//        System.out.println("getWunschEndnote");
//        int matrikelNr = 0;
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        double expResult = 0.0;
//        double result = instance.getWunschEndnote(matrikelNr);
//        assertEquals(expResult, result, 0.0);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNoteGrundstudium method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetNoteGrundstudium() {
//        System.out.println("getNoteGrundstudium");
//        int matrikelNr = 0;
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        Zwischenpruefungsnote expResult = null;
//        Zwischenpruefungsnote result = instance.getNoteGrundstudium(matrikelNr);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHello method, of class BerechnungNotenLocal.
//     */
//    @Test
//    public void testGetHello() {
//        System.out.println("getHello");
//        BerechnungNotenLocal instance = new BerechnungNotenLocalImpl();
//        String expResult = "";
//        String result = instance.getHello();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    public class BerechnungNotenLocalImpl implements BerechnungNotenLocal {
//
//        public double getArithmethischesMittel(int idStudienfach) {
//            return 0.0;
//        }
//
//        public double getStandardabweichung(int idStudienfach) {
//            return 0.0;
//        }
//
//        public int getMedian(int idStudienfach) {
//            return 0;
//        }
//
//        public double getVarianz(int idStudienfach) {
//            return 0.0;
//        }
//
//        public Endnote getEndnote(int matrikelNr) {
//            return null;
//        }
//
//        public double getWunschEndnote(int matrikelNr) {
//            return 0.0;
//        }
//
//        public Zwischenpruefungsnote getNoteGrundstudium(int matrikelNr) {
//            return null;
//        }
//
//        public String getHello() {
//            return "";
//        }
//    }
//    
//}
