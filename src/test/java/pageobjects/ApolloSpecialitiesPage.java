package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Summary:
//Author: "Sanket Pande"
//Author's Email: "sanket.pande@capgemini.com"
//Creation Date: 11/03/2022



//Page Objects For Apollo SpecialitiesPage

public class ApolloSpecialitiesPage {
	WebDriver driver;
	public ApolloSpecialitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='simple-tab-1']")
	public WebElement MeetInPersonButton;
	
	public void ClickonMeetInPersonButton() {
		MeetInPersonButton.click();
	}
	
	@FindBy(xpath="//button[@id='simple-tab-0']")
	public WebElement TextVideoCallButton;
	
	public void ClickonTextVideoCallButton() {
		TextVideoCallButton.click();
	}
	
	
	
	@FindBy(xpath="//a[@href='/specialties/covid-consultation']")
	public WebElement CovidConsultation;
	
	public void ClickonCovidConsultation() {
		CovidConsultation.click();
	}
	
	@FindBy(className="MuiButton-label")
	public WebElement DownloadAppButton;
	
	public void ClickonDownloadTheAppbutton() {
		DownloadAppButton.click();
	}
}
