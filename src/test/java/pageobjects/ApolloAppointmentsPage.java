package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.ApolloBase;


//Summary:
//Author: "Sanket Pande"
//Author's Email: "sanket.pande@capgemini.com"
//Creation Date: 11/03/2022



//Page Objects For Apollo AppointmentsPage

public class ApolloAppointmentsPage{
	WebDriver driver;
	public ApolloAppointmentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']")
	public WebElement SelectPatientDropdownMenu;
	
	public void ClickonSelectPatientsDropdownMenu() {
		SelectPatientDropdownMenu.click();
	}
	
	@FindBy(xpath="//li[normalize-space()='sanket deshmukh']")
	public WebElement SelectPatient;
	
	public void SelectPatientFromDropdownMenu() {
		SelectPatient.click();;
	}
	
	@FindBy(xpath="//span[normalize-space()='Book an Appointment']")
	public WebElement BookanAppointmentButton;
	
	public void ClickonBookanAppointmentButton() {
		BookanAppointmentButton.click();
	}

	
	
	
}