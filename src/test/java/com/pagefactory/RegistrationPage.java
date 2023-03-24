package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=("//a[@class='twoyears-close-btn']"))
	private static WebElement closeBtn;		

	public static WebElement closeBtn() {
		return closeBtn;
	}

	@FindBy(xpath=("//div[contains(text(),'New User')]"))
	private static WebElement clickNewUserRegistration;

	public static WebElement clickNewUserRegistration() {
		return clickNewUserRegistration;
	}

	@FindBy(id="cpvLocationPO")
	private static WebElement radioBtnRegisterToApply;

	public static WebElement radioBtnRegisterToApply() {
		return radioBtnRegisterToApply;
	}

	@FindBy(id="dcdrLocation")
	private static WebElement drpDwnPassportOffice;

	public static WebElement drpDwnPassportOffice() {
		return drpDwnPassportOffice;
	}

	@FindBy(id="givenName")
	private static WebElement givenName;

	public static WebElement givenName() {
		return givenName;
	}

	@FindBy(id="surname")
	private static WebElement surname;

	public static WebElement surname() {
		return surname;
	}

	@FindBy(id="dob")
	private static WebElement dob;

	public static WebElement dob() {
		return dob;
	}

	@FindBy(name="email")
	private static WebElement email;

	public static WebElement email() {
		return email;
	}


	@FindBy(id="emailloginSameyes")
	private static WebElement emailloginSameyes;

	public static WebElement radioBtnemailloginSameyes() {
		return emailloginSameyes;
	}

	@FindBy(id="loginId")
	private static WebElement loginId;

	public static WebElement loginId() {
		return loginId;
	}

	@FindBy(id="pwd")
	private static WebElement passWord;

	public static WebElement passWord() {
		return passWord;
	}

	@FindBy(id="confirmPwd")
	private static WebElement confirmPassWord;

	public static WebElement confirmPassWord() {
		return confirmPassWord;
	}

	@FindBy(id="hintQues")
	private static WebElement hintQuestion;

	public static WebElement hintQuestion() {
		return hintQuestion;
	}

	@FindBy(id="hintAns")
	private static WebElement hintAnswer;

	public static WebElement hintAnswer() {
		return hintAnswer;
	}

	@FindBy(name="register")
	private static WebElement registerBtn;

	public static WebElement register() {
		return registerBtn;
	}



}






