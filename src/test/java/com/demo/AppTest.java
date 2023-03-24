package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan Sakthivel\\eclipse-workspace1\\PSK\\Source\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://passportindia.gov.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement xBtn = driver.findElement(By.xpath("//a[@class='twoyears-close-btn']"));
	xBtn.click();
	
	
		
	}
		
	}




