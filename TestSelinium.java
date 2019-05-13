package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelinium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.name("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
}

}
