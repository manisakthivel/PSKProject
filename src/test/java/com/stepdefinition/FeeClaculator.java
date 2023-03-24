package com.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.BaseClass;
import com.pagefactory.FeeCalculatorPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FeeClaculator extends BaseClass{

	
	@Given("Launch PSK Application2")
	public void launchPSKApplication2() {
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		delay();
			
	   
	}
	@When("User clicks Fee Calculator tab")
	public void userClicksFeeCalculatorTab() {
		FeeCalculatorPage fee = new FeeCalculatorPage();
		click(fee.feeCalculatorTab());
	   
	}
	@When("User select Passport from Select Application type")
	public void userSelectPassportFromSelectApplicationType() {
		FeeCalculatorPage fee = new FeeCalculatorPage();
		selectMethod(fee.selectApplTypeDrpdown(), "Passport");
	   
	}
	@When("User select Fresh from Types of services")
	public void userSelectFreshFromTypesOfServices() {
		FeeCalculatorPage fee = new FeeCalculatorPage();
		selectMethod(fee.typeOfServiceDrpdown(), "6");
	}
	@When("User select Applicant age as Less than {int} years")
	public void userSelectApplicantAgeAsLessThanYears(Integer int1) {
		FeeCalculatorPage fee = new FeeCalculatorPage();
		selectMethod(fee.applicantAgeDrpdown(), "5060");
	}
	@When("User clicks Normal from Required scheme")
	public void userClicksNormalFromRequiredScheme() {
		FeeCalculatorPage fee = new FeeCalculatorPage();
	   selectMethod(fee.reqSchemeDrpdown(), "342");
	}
	@When("User clicks Calculate Fee button")
	public void userClicksCalculateFeeButton() {
		FeeCalculatorPage fee = new FeeCalculatorPage();
		click(fee.calculateFeeBtn());
	}
	@Then("Validate Fee amount as {int}")
	public void validateFeeAmountAs(Integer int1) {
		FeeCalculatorPage fee = new FeeCalculatorPage();
		String totalAmt = fee.amt().getText();
		Assert.assertEquals(totalAmt, "1000.00");
	}

}
