package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Summary:
//Author: "Sanket Pande"
//Author's Email: "sanket.pande@capgemini.com"
//Creation Date: 11/03/2022



//Page Objects For Apollo HomePage

public class ApolloHomePage {
	WebDriver driver;
	public ApolloHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="loginPopup")
	public WebElement LoginButton;
	
	public void ClickonProfileButton() {
		LoginButton.click();
	}
	
	@FindBy(name="mobileNumber")
	public WebElement mobilenumber;
	
	public void EnterMobileNumber(String Mobilenum) {
		mobilenumber.sendKeys(Mobilenum);
	}
	
	@FindBy(xpath="//button[@title='Login']")
	public WebElement Loginbutton;
	
	public void ClickonLoginButton() {
		Loginbutton.click();
	}
	
	@FindBy(css="a[title='Appointments']")
	public WebElement AppointmentsButton;
	
	public void ClickonAppointmentsButton() {
		AppointmentsButton.click();
	}
	
}
