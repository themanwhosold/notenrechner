///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hof.se2.sessionBean;
//
//import de.hof.se2.eigeneNoten.BerechneteNoten;
//import de.hof.se2.eigeneNoten.Endnote;
//import de.hof.se2.entity.Noten;
//import javax.ejb.EJB;
//import javax.ejb.embeddable.EJBContainer;
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
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
//public class BerechnungNotenIT {
//        @EJB
//    BerechnungNoten instance;
//    public BerechnungNotenIT() {
//    }
//            @Deployment
//    public static JavaArchive createDeployment() {
//
//        JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
//        jar.addAsResource("test-persistence.xml", "META-INF/persistence.xml");
//        jar.addPackage("com.demopack.demoproj");
//        jar.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//
//        return jar;
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
//        instance = new BerechnungNoten() {
//};
//    }
////
////    /**
////     * Test of getArithmethischesMittel method, of class BerechnungNoten.
////     */
////    @Test
////    public void testGetArithmethischesMittel() throws Exception {
////        System.out.println("getArithmethischesMittel");
////        int idStudienfach = 0;
//////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
////        double expResult = 0.0;
////        double result = instance.getArithmethischesMittel(idStudienfach);
////        assertEquals(expResult, result, 0.0);
////        container.close();
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of getStandardabweichung method, of class BerechnungNoten.
//     */
////    @Test
////    public void testGetStandardabweichung() throws Exception {
////        System.out.println("getStandardabweichung");
////        int idStudienfach = 0;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
////        double expResult = 0.0;
////        double result = instance.getStandardabweichung(idStudienfach);
////        assertEquals(expResult, result, 0.0);
////        container.close();
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of getMedian method, of class BerechnungNoten.
//     */
////    @Test
////    public void testGetMedian() throws Exception {
////        System.out.println("getMedian");
////        int idStudienfach = 0;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
////        int expResult = 0;
////        int result = instance.getMedian(idStudienfach);
////        assertEquals(expResult, result);
////        container.close();
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of getVarianz method, of class BerechnungNoten.
//     */
////    @Test
////    public void testGetVarianz() throws Exception {
////        System.out.println("getVarianz");
////        int idStudienfach = 0;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
////        double expResult = 0.0;
////        double result = instance.getVarianz(idStudienfach);
////        assertEquals(expResult, result, 0.0);
////        container.close();
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of getEndnote method, of class BerechnungNoten.
//     */
//    @Test
//    public void testGetEndnote() throws Exception {
//        System.out.println("getEndnote");
//        int matrikelNr = 0;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
//        int matrikelNoteUngueltig=20171001;
////        Endnote result = (Endnote)instance.getEndnote(matrikelNoteUngueltig);
////        if(result.)
//        int matrikelnummerNoteGueltig= 20130000;
////        assertEquals(instance.getEndnote(matrikelnummerNoteGueltig).getEndnote(),14.27,0.01);
////        container.close();
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWunschEndnote method, of class BerechnungNoten.
//     */
////    @Test
////    public void testGetWunschEndnote() throws Exception {
////        System.out.println("getWunschEndnote");
////        int matrikelNr = 0;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
////        double expResult = 0.0;
////        double result = instance.getWunschEndnote(matrikelNr);
////        assertEquals(expResult, result, 0.0);
////        container.close();
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of getBerechneteNoten method, of class BerechnungNoten.
//     */
////    @Test
////    public void testGetBerechneteNoten() throws Exception {
////        System.out.println("getBerechneteNoten");
////        int matrikelNr = 0;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
////        BerechneteNoten expResult = null;
////        BerechneteNoten result = instance.getBerechneteNoten(matrikelNr);
////        assertEquals(expResult, result);
////        container.close();
////        fail("The test case is a prototype.");
////    }
//
////    /**
////     * Test of getRelativeGewichtung method, of class BerechnungNoten.
////     */
////    @Test
////    public void testGetRelativeGewichtung() throws Exception {
////        System.out.println("getRelativeGewichtung");
////        Noten note = null;
////        Endnote endnote = null;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        BerechnungNotenLocal instance = (BerechnungNotenLocal)container.getContext().lookup("java:global/classes/BerechnungNoten");
////        double expResult = 0.0;
////        double result = instance.getRelativeGewichtung(note, endnote);
////        assertEquals(expResult, result, 0.0);
////        container.close();
////        fail("The test case is a prototype.");
////    }
////    
//}
