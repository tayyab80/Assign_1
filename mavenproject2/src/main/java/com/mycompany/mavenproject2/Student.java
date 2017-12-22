package com.mycompany.mavenproject2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tayyab
 */
public class Student {
   private Integer answer;
   private String question;
   private Integer id;

   public void setanswer(Integer answer) {
      this.answer = answer;
   }
   public Integer getanswer() {
      return answer;
   }
   public void setquestion(String question) {
      this.question = question;
   }
   public String getquestion() {
      return question;
   }
   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }
}