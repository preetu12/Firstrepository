package POM_Re;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_001_reg_Test {

	public void Tc_001_reg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement reg;

	@FindBy(id = "gender-male")
	private WebElement gender;

	@FindBy(id = "FirstName")
	private WebElement fn;

	@FindBy(id = "LastName")
	private WebElement ln;

	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getReg() {
		return reg;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getReg_click() {
		return reg_click;
	}

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement reg_click;
}
