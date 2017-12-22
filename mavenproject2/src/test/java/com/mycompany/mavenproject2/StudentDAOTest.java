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
public class StudentDAOTest {
    
    public StudentDAOTest() {
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
     * Test of setDataSource method, of class StudentDAO.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource ds = null;
        StudentDAO instance = new StudentDAOImpl();
        instance.setDataSource(ds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudentDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String question = "";
        Integer answer = null;
        StudentDAO instance = new StudentDAOImpl();
        instance.create(question, answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class StudentDAO.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Integer id = null;
        StudentDAO instance = new StudentDAOImpl();
        Student expResult = null;
        Student result = instance.getStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listStudents method, of class StudentDAO.
     */
    @Test
    public void testListStudents() {
        System.out.println("listStudents");
        StudentDAO instance = new StudentDAOImpl();
        List<Student> expResult = null;
        List<Student> result = instance.listStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudentDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        StudentDAO instance = new StudentDAOImpl();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudentDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Integer id = null;
        Integer answer = null;
        StudentDAO instance = new StudentDAOImpl();
        instance.update(id, answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StudentDAOImpl implements StudentDAO {

        public void setDataSource(DataSource ds) {
        }

        public void create(String question, Integer answer) {
        }

        public Student getStudent(Integer id) {
            return null;
        }

        public List<Student> listStudents() {
            return null;
        }

        public void delete(Integer id) {
        }

        public void update(Integer id, Integer answer) {
        }
    }
    
}
