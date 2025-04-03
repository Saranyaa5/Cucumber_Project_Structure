package com.definitions;

import com.utilities.HelperClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
   @Before
   public static void setUp() {
	   HelperClass.setUpDriver();
   }
   
   @After
   public static void tearDown(Scenario scenario) {
	  HelperClass.tearDown();   
   }
   
}