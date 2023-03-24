package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class LocatePSKPage extends BaseClass{

	public LocatePSKPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Locate Passport')]")
	private static WebElement loactePSK;
	
	public static WebElement locatePSk() {
		return loactePSK;
	}
	
	
	@FindBy(name="pboPinCodeOpt")
	private static WebElement selectOptionRadioBtn;
	
	public static WebElement selectOptionRadioBtn() {
		return selectOptionRadioBtn;
	}
	
	@FindBy(id="pboNameId")
	private static WebElement passportOfficeDropDown;
	
	public static WebElement passportOfficeDropDown() {
		return passportOfficeDropDown;
	}
	
	
	@FindBy(id="locatePSK")
	private static WebElement locatePSKBtn;
	
	public static WebElement locatePSKBtn() {
		return locatePSKBtn;
	}
	
	@FindBy(xpath="//table[@id='pfctable']/thead/tr/th")
	public static WebElement locatePSKTable;
	
	public static WebElement locatePSKTable() {
		return locatePSKTable;
	}
	
	
}
