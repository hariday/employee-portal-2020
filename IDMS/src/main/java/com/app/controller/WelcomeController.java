package com.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class WelcomeController {

   @RequestMapping("/welcome")
   public String index() {
	   System.out.println("In welcome:::");
      return "index";
   }
   @RequestMapping("/test")
   public void test() {
      System.out.println("Test Controller::::");
   }
   
   
} 
