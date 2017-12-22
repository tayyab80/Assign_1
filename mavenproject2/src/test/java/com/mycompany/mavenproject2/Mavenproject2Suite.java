/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Tayyab
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.mavenproject2.StudentJDBCTemplateTest.class, com.mycompany.mavenproject2.StudentTest.class, com.mycompany.mavenproject2.MainAppTest.class, com.mycompany.mavenproject2.StudentMapperTest.class, com.mycompany.mavenproject2.StudentDAOTest.class})
public class Mavenproject2Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
