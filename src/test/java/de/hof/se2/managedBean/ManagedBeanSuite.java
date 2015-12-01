/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

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
@Suite.SuiteClasses({de.hof.se2.managedBean.CredentialsTest.class, de.hof.se2.managedBean.OutForProfessorsTest.class, de.hof.se2.managedBean.authBeanTest.class, de.hof.se2.managedBean.OutForStudentsTest.class, de.hof.se2.managedBean.LoggedInTest.class, de.hof.se2.managedBean.UserTest.class})
public class ManagedBeanSuite {

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
