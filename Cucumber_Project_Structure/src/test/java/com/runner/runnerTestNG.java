package com.runner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
	    plugin = {
	        "pretty","json:target/cucumber-reports/OrangeHrmLogin.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    },
	    features = "src/test/resources/features/LoginPage.feature",
	    glue = "com.definitions",
	    monochrome = true,
	    dryRun = false
	)
	public class runnerTestNG extends AbstractTestNGCucumberTests {
	}
