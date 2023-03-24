package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.BaseClass.BaseClass;
import com.pagefactory.LocatePSKPage;
import com.pagefactory.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocatePSK extends BaseClass{

	@Given("Launch PSK Application1")
	public void launchPSKApplication1() {

		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		delay();
	}

	@When("User cliks Locate Passport Seva Kendra")
	public void userCliksLocatePassportSevaKendra() {
		LocatePSKPage pskPage = new LocatePSKPage();
		pskPage.locatePSk().click();
	}
	@When("User click Passport office in Select an option")
	public void userClickPassportOfficeInSelectAnOption() {
		LocatePSKPage pskPage = new LocatePSKPage();
		pskPage.selectOptionRadioBtn().click();

	}
	@When("User select Chennai from Passport office dropdown")
	public void userSelectChennaiFromPassportOfficeDropdown() {
		LocatePSKPage pskPage = new LocatePSKPage();
		selectMethod(pskPage.passportOfficeDropDown(), "26");
	}
	@When("Click Locate PSK button")
	public void clickLocatePSKButton() {
		LocatePSKPage pskPage = new LocatePSKPage();
		pskPage.locatePSKBtn().click();
	}
	@Then("User should see the PSK location table in Chennai")
	public void userShouldSeeThePSKLocationTableInChennai() {
		LocatePSKPage pskPage = new LocatePSKPage();
		List<WebElement> pskLocationTable = driver.findElements(By.xpath("//table[@id='pfctable']/thead/tr/th"));
		for(int i=0;i<pskLocationTable.size();i++) {
			String text = pskLocationTable.get(i).getText();
			System.out.println(text);
		}
	}


}
