package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.utilities.HelperClass;

public class LoginPageActions {
    LoginPageLocators loginPageLocators=null;
    String strUserName,strPassword;
    
//    public LoginPageActions() {
//    	
//    	this.loginPageLocators=new LoginPageLocators();
//    	
//    	PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
//    }
    public LoginPageActions() {
        loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }

    
    //set username in the textbox
    public void setUserName(String strUserName) {
    	loginPageLocators.userName.sendKeys(strUserName);
    }
    
    //set password in the textbox
    public void setPassword(String strPassword) {
    	loginPageLocators.password.sendKeys(strPassword);
    }
    
    //click Login button
    public void clickLogin() {
    	loginPageLocators.login.click();
    }
    public void login() {
    	File file=new File("C:\\Users\\saran\\eclipse-workspace\\Cucumber_Project_Structure\\src\\test\\resources\\testdata.properties");
    
    	FileInputStream fileInput=null;
    	try {
    		fileInput=new FileInputStream(file);
    	}
    	catch(FileNotFoundException e){
    		e.printStackTrace();
    	}
    	
    	Properties prop=new Properties();
    	
    	try {
    		prop.load(fileInput);
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    	strUserName=prop.getProperty("username");
    	strPassword=prop.getProperty("password");
    	//Fill username
    	this.setUserName(strUserName);
    	
    	//Fill password
    	this.setPassword(strPassword);
    	
    	//click Login button
    	this.clickLogin();
    	
    }
}