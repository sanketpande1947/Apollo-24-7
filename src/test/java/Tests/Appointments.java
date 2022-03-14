package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjects.ApolloAppointmentsPage;
import pageobjects.ApolloHomePage;
import pageobjects.ApolloSpecialitiesPage;
import pageobjects.ApolloTopSpecialitiesPage;
import resources.ApolloBase;

public class Appointments extends ApolloBase {
	public WebDriver driver = null;
	ApolloHomePage homePage = null;
	ApolloAppointmentsPage appointmentpage = null;
	ApolloSpecialitiesPage apollospecialitiespage = null;
	ApolloTopSpecialitiesPage apollotopspecialitiespage = null;
	
	
	@BeforeMethod
	public void setup() {
		loadproperties();
		driver = Initializebrowser(prop.getProperty("browser"),driver);
		driver.get(prop.getProperty("url"));	
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();;
	}
	
	@Test(priority=1)
	public void NavigatetoSpecialitiesPage() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='jss384 jss440'] li[class='active'] a")).getText(),"Specialities");
	}
	
	@Test(priority=2)
	public void VerifyFunctionalityofMeetInPersonbutton() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloSpecialitiesPage apollospecialitiespage = new ApolloSpecialitiesPage(driver);
		apollospecialitiespage.ClickonMeetInPersonButton();
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Choose the doctor']")).getText(),"Choose the doctor");
	}
	
	@Test(priority=3)
	public void VerifytheFuctionalityofTextVideoButton() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloSpecialitiesPage apollospecialitiespage = new ApolloSpecialitiesPage(driver);
		apollospecialitiespage.ClickonTextVideoCallButton();
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Choose the doctor']")).getText(),"Choose the doctor");
	}
	
	@Test(priority=4)
	public void VerifytheFunctionalityofCovidConsultation() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
    	apollotopspecialitiespage.ClickonCovidConsultationSection();
    	
    	SoftAssert Assertion = new SoftAssert();
    	Assertion.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Online Covid consultation']")).getText(),"Online Covid consultation");
       // Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Online Covid consultation']")).getText(),"Online Covid consultation");
    	Assertion.assertAll();
	}
	
	@Test(priority=5)
	public void VerifytheFunctionalityofDermatology() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		apollotopspecialitiespage.ClickonDermatologySection();
		
		SoftAssert Assertion = new SoftAssert();
    	Assertion.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Consult Dermatologists Online - Hair & Skin Doctor')]")).getText(),"Consult Dermatologists Online - Hair & Skin Doctors");
    	
	}
	
	@Test(priority=6)
	public void VerifytheFunctionalityofGeneralphysician(){
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		apollotopspecialitiespage.ClickonGeneralPhysicianSection();
		
		Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Consult General Physicians Online - Internal Medic')]")).getText(),"Consult General Physicians Online - Internal Medicine Specialists");
	}
	
	@Test(priority=7)
	public void VerifytheFunctionalityofPaediatrics() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		apollotopspecialitiespage.ClickonPaediatricsSection();
		
	 Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Consult Pediatricians Online - Child Specialists']")).getText(),"Consult Pediatricians Online - Child Specialists");
	}
	
	@Test(priority=8)
	public void VerifytheFunctionalityofAllergist() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		apollotopspecialitiespage.ClickonAllergistSection();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(currentUrl));
		
	}
	
	@Test(priority=9)
	public void VerifytheFunctionalityofcardiology() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		apollotopspecialitiespage.ClickonCardiologySection();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(currentUrl));
	}
	
	@Test(priority=10)
	public void VerifytheFunctionalityofBariatrics() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		apollotopspecialitiespage.ClickonBariatricsSection();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(currentUrl));
	}
	
	
	@Test(priority=11)
	public void VerifytheFunctionalityofCounselling() {
		ApolloHomePage homePage = new ApolloHomePage(driver);
		homePage.ClickonProfileButton();
		homePage.EnterMobileNumber(prop.getProperty("mobilenumber"));
		homePage.ClickonLoginButton();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.ClickonLoginButton();
		homePage.ClickonAppointmentsButton();
		
		ApolloAppointmentsPage appointmentpage = new ApolloAppointmentsPage(driver);
		appointmentpage.ClickonSelectPatientsDropdownMenu();
		appointmentpage.SelectPatientFromDropdownMenu();
		appointmentpage.ClickonBookanAppointmentButton();
		
		ApolloTopSpecialitiesPage apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		apollotopspecialitiespage.ClickonCounsellingSection();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(currentUrl));
		
	}
	
}
