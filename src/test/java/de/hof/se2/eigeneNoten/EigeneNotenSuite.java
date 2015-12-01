/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.eigeneNoten;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Schmidbauer
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({de.hof.se2.eigeneNoten.ZwischenpruefungsnoteTest.class, de.hof.se2.eigeneNoten.BerechneteNotenTest.class, de.hof.se2.eigeneNoten.EndnoteTest.class})
public class EigeneNotenSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }
    
}
