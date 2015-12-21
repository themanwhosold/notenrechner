///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hof.se2.sessionBean;
//
//import de.hof.se2.eigeneNoten.Endnote;
//import de.hof.se2.eigeneNoten.Zwischenpruefungsnote;
//import javax.ejb.embeddable.EJBContainer;
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
//public class BerechnungNotenTest {
//    
//    public BerechnungNotenTest() {
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
//     * Test of getArithmethischesMittel method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetArithmethischesMittel() throws Exception {
//        System.out.println("getArithmethischesMittel");
//        int idStudienfach = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        double expResult = 0.0;
//        double result = instance.getArithmethischesMittel(idStudienfach);
//        assertEquals(expResult, result, 0.0);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStandardabweichung method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetStandardabweichung() throws Exception {
//        System.out.println("getStandardabweichung");
//        int idStudienfach = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        double expResult = 0.0;
//        double result = instance.getStandardabweichung(idStudienfach);
//        assertEquals(expResult, result, 0.0);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMedian method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetMedian() throws Exception {
//        System.out.println("getMedian");
//        int idStudienfach = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        int expResult = 0;
//        int result = instance.getMedian(idStudienfach);
//        assertEquals(expResult, result);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getVarianz method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetVarianz() throws Exception {
//        System.out.println("getVarianz");
//        int idStudienfach = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        double expResult = 0.0;
//        double result = instance.getVarianz(idStudienfach);
//        assertEquals(expResult, result, 0.0);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEndnote method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetEndnote() throws Exception {
//        System.out.println("getEndnote");
//        int matrikelNr = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        Endnote expResult = null;
//        Endnote result = instance.getEndnote(matrikelNr);
//        assertEquals(expResult, result);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWunschEndnote method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetWunschEndnote() throws Exception {
//        System.out.println("getWunschEndnote");
//        int matrikelNr = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        double expResult = 0.0;
//        double result = instance.getWunschEndnote(matrikelNr);
//        assertEquals(expResult, result, 0.0);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNoteGrundstudium method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetNoteGrundstudium() throws Exception {
//        System.out.println("getNoteGrundstudium");
//        int matrikelNr = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        Zwischenpruefungsnote expResult = null;
//        Zwischenpruefungsnote result = instance.getNoteGrundstudium(matrikelNr);
//        assertEquals(expResult, result);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHello method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetHello() throws Exception {
//        System.out.println("getHello");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        String expResult = "";
//        String result = instance.getHello();
//        assertEquals(expResult, result);
//        container.close();
//        fail("The test case is a prototype.");
//    }
//    
//}
