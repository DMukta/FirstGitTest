package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {	
	
	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
		/*
		 * System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        actualTitle = driver.getTitle();

	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        driver.close();
	       
	    }
	
}
