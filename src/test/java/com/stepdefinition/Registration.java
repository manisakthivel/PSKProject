package com.stepdefinition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.BaseClass.BaseClass;
import com.pagefactory.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration extends BaseClass {

	@Given("Launch PSK Application")
	public void launchPSKApplication() {
	    
		driver.get("https://passportindia.gov.in/");
		driver.manage().window().maximize();
		delay();
		
		
	}
	@Given("Close the popup")
	public void closeThePopup() {
		RegistrationPage rp = new RegistrationPage();
		rp.closeBtn().click();	
		
	   
	}
	@Given("Click New User registration")
	public void clickNewUserRegistration() {
		RegistrationPage rp = new RegistrationPage();
		rp.clickNewUserRegistration().click();
	   
	}
	@When("Fill the mandatory fields to register")
	public void fillTheMandatoryFieldsToRegister() {
	    
		RegistrationPage rp = new RegistrationPage();
		rp.radioBtnRegisterToApply().click();
		rp.drpDwnPassportOffice().click();
		selectMethod(rp.drpDwnPassportOffice(), "26");
		sendKeysMethod(rp.givenName(), readExcelData(1, 0));
		sendKeysMethod(rp.surname(), readExcelData(1, 1));
		sendKeysMethod(rp.dob(), readExcelData(1, 2));
		sendKeysMethod(rp.email(), readExcelData(1, 3));
		rp.radioBtnemailloginSameyes().click();
//		sendKeysMethod(rp.loginId(), readExcelData(1, 4));
		sendKeysMethod(rp.passWord(), readExcelData(1, 5));
		sendKeysMethod(rp.confirmPassWord(), readExcelData(1, 6));
		selectMethod(rp.hintQuestion(), "Birth City");
		sendKeysMethod(rp.hintAnswer(), readExcelData(1, 7));
		delay();
			   
	}
	@When("Click the Register button")
	public void clickTheRegisterButton() {
		
		RegistrationPage rp = new RegistrationPage();
		rp.register().click();
		
	    
	   
	}
	@Then("User registered succesfully")
	public void userRegisteredSuccesfully() {
	    //driver.close();
	   
	}

}
