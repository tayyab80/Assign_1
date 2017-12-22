/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tayyab
 */
public class StudentJDBCTemplateTest {
    
    public StudentJDBCTemplateTest() {
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
     * Test of setDataSource method, of class StudentJDBCTemplate.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource dataSource = null;
        StudentJDBCTemplate instance = new StudentJDBCTemplate();
        instance.setDataSource(dataSource);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudentJDBCTemplate.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String question = "";
        Integer answer = null;
        StudentJDBCTemplate instance = new StudentJDBCTemplate();
        instance.create(question, answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class StudentJDBCTemplate.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Integer id = null;
        StudentJDBCTemplate instance = new StudentJDBCTemplate();
        Student expResult = null;
        Student result = instance.getStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listStudents method, of class StudentJDBCTemplate.
     */
    @Test
    public void testListStudents() {
        System.out.println("listStudents");
        StudentJDBCTemplate instance = new StudentJDBCTemplate();
        List<Student> expResult = null;
        List<Student> result = instance.listStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudentJDBCTemplate.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        StudentJDBCTemplate instance = new StudentJDBCTemplate();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudentJDBCTemplate.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Integer id = null;
        Integer answer = null;
        StudentJDBCTemplate instance = new StudentJDBCTemplate();
        instance.update(id, answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
