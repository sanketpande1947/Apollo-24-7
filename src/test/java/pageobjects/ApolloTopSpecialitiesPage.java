package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Summary:
//Author: "Sanket Pande"
//Author's Email: "sanket.pande@capgemini.com"
//Creation Date: 11/03/2022



//Page Objects For Apollo TopSpecialitiesPage

public class ApolloTopSpecialitiesPage {
	WebDriver driver;
	public ApolloTopSpecialitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[normalize-space()='Dr. Kalpana Nagpal']")
	public WebElement FindDoctor;
	
	public void ClickonDoctorProfile() {
		FindDoctor.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Book Video Consult']")
	public WebElement BookVideoConsultButton;
	
	public void ClickonBoovideoConsultButton() {
		BookVideoConsultButton.click();
		
	}
	
	@FindBy(xpath="//div[@xpath=\"1\"]")
	public WebElement Profile;
	
	public void ClickonProfile() {
		Profile.click();
	}
	
	@FindBy(xpath="//h3[normalize-space()='Covid Consultation']")
	public WebElement CovidConsultationSection;
	
	public void ClickonCovidConsultationSection() {
		CovidConsultationSection.click();
	}
	
	@FindBy(xpath="//h3[normalize-space()='Dermatology']")
	public WebElement DermatologySection;
	
	
	public void ClickonDermatologySection() {
		DermatologySection.click();
	}
	
	@FindBy(xpath="//h3[normalize-space()='General Physician/ Internal Medicine']")
	public WebElement Generalphysiciansection;
	
	public void ClickonGeneralPhysicianSection() {
		Generalphysiciansection.click();
	}
	
	@FindBy(xpath="//h3[normalize-space()='Paediatrics']")
	public WebElement PaediatricsSection;
	
	public void ClickonPaediatricsSection() {
		PaediatricsSection.click();
	}
	
	
	@FindBy(xpath="//div[normalize-space()='Allergist and Clinical Immunologist']")
	public WebElement AllergistSection;
	
	public void ClickonAllergistSection() {
		AllergistSection.click();
	}
	
	@FindBy(xpath="//div[normalize-space()='Cardiology']")
	public WebElement CardiologySection;
	
	public void ClickonCardiologySection() {
		CardiologySection.click();
	}
	
	@FindBy(xpath="//div[normalize-space()='Bariatrics']")
	public WebElement BariatricsSection;
	
	
	public void ClickonBariatricsSection() {
		BariatricsSection.click();
	}
	
	@FindBy(xpath="//div[normalize-space()='Counseling']")
	public WebElement CounsellingSection;
	
	public void ClickonCounsellingSection() {
		CounsellingSection.click();
	}
	
	

}
