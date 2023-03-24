package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class FeeCalculatorPage extends BaseClass{


	public FeeCalculatorPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Fee Calculator')]")
	private static WebElement feeCalculator;

	public static WebElement feeCalculatorTab() {
		return feeCalculator;
	}

	@FindBy(id="applicationCategory")
	private static WebElement selectApplType;

	public static WebElement selectApplTypeDrpdown() {
		return selectApplType;
	}

	@FindBy(id="serviceType")
	private static WebElement typeOfService;

	public static WebElement typeOfServiceDrpdown() {
		return typeOfService;
	}


	@FindBy(id="ageType")
	private static WebElement applicantAge;

	public static WebElement applicantAgeDrpdown() {
		return applicantAge;
	}

	@FindBy(id="schemeType")
	private static WebElement reqScheme;

	public static WebElement reqSchemeDrpdown() {
		return reqScheme;
	}

	@FindBy(id="calculateFee")
	private static WebElement calculateFee;

	public static WebElement calculateFeeBtn() {
		return calculateFee;
	}

	@FindBy(xpath="(//tr[@id='feeAmountRow']/td/strong)[2]")
	private static WebElement amt;

	public static WebElement amt() {
		return amt;
	}		
}
