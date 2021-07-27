package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class DriverManager {


	public static void getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BaseConfig obj = new BaseConfig();
		driver.navigate().to(obj.getData("QA_URL"));
		driver.manage().window().maximize();
		
	}
	
	
	public static void main(String[] args) {
		 DriverManager.getDriver();
	}
}
