/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Tayyab
 */
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mycompany.mavenproject2.StudentJDBCTemplate;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      StudentJDBCTemplate studentJDBCTemplate = 
         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      studentJDBCTemplate.create("11*2", 22);
      studentJDBCTemplate.create("14*2", 28);
      studentJDBCTemplate.create("10-5", 5);
      

      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentJDBCTemplate.listStudents();
      
      for (Student record : students) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", question : " + record.getquestion() );
         System.out.println(", Answer : " + record.getanswer());
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      studentJDBCTemplate.update(2, 20);

      System.out.println("----Listing Record with ID = 2 -----" );
      Student student = studentJDBCTemplate.getStudent(2);
      System.out.print("ID : " + student.getId() );
      System.out.print(", Name : " + student.getquestion() );
      System.out.println(", Age : " + student.getanswer());
   }
}