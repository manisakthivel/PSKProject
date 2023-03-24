package com.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;


import com.BaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	@Before
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan Sakthivel\\eclipse-workspace1\\PSK\\Source\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@After
	public static void tearDown() {
		driver.close();
	}
}
