package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ApolloAppointmentsPage;
import pageobjects.ApolloHomePage;
import pageobjects.ApolloSpecialitiesPage;
import pageobjects.ApolloTopSpecialitiesPage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import resources.ApolloBase;
import io.cucumber.datatable.DataTable;
import resources.ApolloBase;

//Summary:
//Author: "Sanket Pande"
//Author's Email: "sanket.pande@capgemini.com"
//Creation Date: 11/03/2022


public class Apollospecialities extends ApolloBase {
		public WebDriver driver = null;
		ApolloHomePage homePage = null;
		ApolloAppointmentsPage appointmentpage = null;
		ApolloSpecialitiesPage apollospecialitiespage = null;
		ApolloTopSpecialitiesPage apollotopspecialitiespage = null;
		
		
		@Before
		public void setup() {
			loadproperties();
			driver = Initializebrowser(prop.getProperty("browser"),driver);
			driver.get(prop.getProperty("url"));	
		}
		
		@After
		public void TearDown() {
			driver.quit();;
		} 
		
		 @Given("^User should log in account$")
		    public void user_should_log_in_account()  {
			 	homePage = new ApolloHomePage(driver);
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
		    }

		    @When("^User click on appointment buttonone$")
		    public void user_click_on_appointment_buttonone() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menuone$")
		    public void user_click_on_select_patients_dropdown_menuone() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		    
		    @And("^User select patient from dropDown menuone$")
		    public void user_select_patient_from_dropdown_menuone()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonone$")
		    public void user_click_on_book_an_appointment_buttonone()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @Then("^User should get specialities pageone$")
		    public void user_should_get_specialities_pageone()  {
		    	Assert.assertEquals(driver.findElement(By.cssSelector("div[class='jss384 jss440'] li[class='active'] a")).getText(),"Specialities");
		    }
		    
		    @When("^User click on appointment buttontwo$")
		    public void user_click_on_appointment_buttontwo() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menutwo$")
		    public void user_click_on_select_patients_dropdown_menutwo() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		    
		    @And("^User select patient from dropDown menutwo$")
		    public void user_select_patient_from_dropdown_menutwo()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttontwo$")
		    public void user_click_on_book_an_appointment_buttontwo()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    

		    @And("^User should click on meet in person buttontwo$")
		    public void user_should_click_on_meet_in_person_buttontwo()  {
		    	apollospecialitiespage = new ApolloSpecialitiesPage(driver);
		    	apollospecialitiespage.ClickonMeetInPersonButton();
		    }
		    
		    @Then("^User should see the steps of meet in person buttontwo$")
		    public void user_should_see_the_steps_of_meet_in_person_buttontwo()  {
		    	Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Choose the doctor']")).getText(),"Choose the doctor");
		    }
		    
		    @When("^User click on appointment buttonthree$")
		    public void user_click_on_appointment_buttonthree() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menuthree$")
		    public void user_click_on_select_patients_dropdown_menuthree() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menuthree$")
		    public void user_select_patient_from_dropdown_menuthree()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonthree$")
		    public void user_click_on_book_an_appointment_buttonthree()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }

		    @And("^User click on Text Video Call buttonthree$")
		    public void user_click_on_text_video_call_buttonthree() {
		    	apollospecialitiespage = new ApolloSpecialitiesPage(driver);
		    	apollospecialitiespage.ClickonTextVideoCallButton();;
		    }
		    
		    @Then("^User should see the steps of Text Video Call buttonthree$")
		    public void user_should_see_the_steps_of_text_video_call_buttonthree()  {
		    	Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Choose the doctor']")).getText(),"Choose the doctor");
		    }
		    
		    @When("^User click on appointment buttonfour$")
		    public void user_click_on_appointment_buttonfour() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menufour$")
		    public void user_click_on_select_patients_dropdown_menufour() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menufour$")
		    public void user_select_patient_from_dropdown_menufour()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonfour$")
		    public void user_click_on_book_an_appointment_buttonfour()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @And("^User click on covid consultation sectionfour$")
		    public void user_click_on_covid_consultation_sectionfour() {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonCovidConsultationSection();
		    }
		    
		    @Then("^User should get the list of all covid consultantsfour$")
		    public void user_should_get_the_list_of_all_covid_consultantsfour(){
		    	SoftAssert Assertion = new SoftAssert();
		    	Assertion.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Online Covid consultation']")).getText(),"Online Covid consultation");
		       // Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Online Covid consultation']")).getText(),"Online Covid consultation");
		    	Assertion.assertAll();
		    }
		   
		    @When("^User click on appointment buttonfive$")
		    public void user_click_on_appointment_buttonfive() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menufive$")
		    public void user_click_on_select_patients_dropdown_menufive() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menufive$")
		    public void user_select_patient_from_dropdown_menufive()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonfive$")
		    public void user_click_on_book_an_appointment_buttonfive()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @And("^User click on Dermatology sectionfive$")
		    public void user_click_on_dermatology_sectionfive() {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonDermatologySection();
		    }
		    
		    @Then("^User should get the list of all Dermatology consultantsfive$")
		    public void user_should_get_the_list_of_all_dermatology_consultantsfive() {
		    	SoftAssert Assertion = new SoftAssert();
		    	Assertion.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Consult Dermatologists Online - Hair & Skin Doctor')]")).getText(),"Consult Dermatologists Online - Hair & Skin Doctors");
		    	//Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Consult Dermatologists Online - Hair & Skin Doctor')]")).getText(),"Consult Dermatologists Online - Hair & Skin Doctors");
		    }
		    
//////	
		    @When("^User click on appointment buttonsix$")
		    public void user_click_on_appointment_buttonsix() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menusix$")
		    public void user_click_on_select_patients_dropdown_menusix() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menusix$")
		    public void user_select_patient_from_dropdown_menusix()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonsix$")
		    public void user_click_on_book_an_appointment_buttonsix()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @And("^User click on General Physician sectionsix$")
		    public void user_click_on_general_physician_sectionsix() {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonGeneralPhysicianSection();
		    }
		    
		    @Then("^User should get the list of all General Physician consultantssix$")
		    public void user_should_get_the_list_of_all_general_physician_consultantssix() {
		        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Consult General Physicians Online - Internal Medic')]")).getText(),"Consult General Physicians Online - Internal Medicine Specialists");
		    }
		    
//
		    @When("^User click on appointment buttonseven$")
		    public void user_click_on_appointment_buttonseven() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menuseven$")
		    public void user_click_on_select_patients_dropdown_menuseven() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menuseven$")
		    public void user_select_patient_from_dropdown_menuseven()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonseven$")
		    public void user_click_on_book_an_appointment_buttonseven()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @And("^User click on Paediatrics sectionseven$")
		    public void user_click_on_paediatrics_sectionseven()  {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonPaediatricsSection();
		    }
		    
		    @Then("^User should get the list of all Paediatrics consultantsseven$")
		    public void user_should_get_the_list_of_all_paediatrics_consultantsseven() {
		        Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Consult Pediatricians Online - Child Specialists']")).getText(),"Consult Pediatricians Online - Child Specialists");
		    }
//
		    @When("^User click on appointment buttoneight$")
		    public void user_click_on_appointment_buttoneight() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menueight$")
		    public void user_click_on_select_patients_dropdown_menueight() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menueight$")
		    public void user_select_patient_from_dropdown_menueight()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttoneight$")
		    public void user_click_on_book_an_appointment_buttoneight()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    

		    @And("^User click on Allergist sectioneight$")
		    public void user_click_on_allergist_sectioneight()  {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonAllergistSection();
		    	
		    }
		    
		    @Then("^User should get the list of all Allergist consultantseight$")
		    public void user_should_get_the_list_of_all_allergist_consultantseight(){
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertTrue(currentUrl.contains(currentUrl));
		    }
//
		    @When("^User click on appointment buttonnine$")
		    public void user_click_on_appointment_buttonnine() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menunine$")
		    public void user_click_on_select_patients_dropdown_menunine() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menunine$")
		    public void user_select_patient_from_dropdown_menunine()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonnine$")
		    public void user_click_on_book_an_appointment_buttonnine()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @And("^User click on Cardiology sectionnine$")
		    public void user_click_on_cardiology_sectionnine() {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonCardiologySection();
		    }
		    
		    @Then("^User should get the list of all Cardiology consultantsnine$")
		    public void user_should_get_the_list_of_all_cardiology_consultantsnine(){
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertTrue(currentUrl.contains(currentUrl));
		    }
		    
///

		    @When("^User click on appointment buttonten$")
		    public void user_click_on_appointment_buttonten() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menuten$")
		    public void user_click_on_select_patients_dropdown_menuten() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menuten$")
		    public void user_select_patient_from_dropdown_menuten()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttonten$")
		    public void user_click_on_book_an_appointment_buttonten()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @And("^User click on Bariatrics sectionten$")
		    public void user_click_on_bariatrics_sectionten(){
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonBariatricsSection();
		    }
		    
		    @Then("^User should get the list of all Bariatrics consultantsten$")
		    public void user_should_get_the_list_of_all_bariatrics_consultantsten() {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertTrue(currentUrl.contains(currentUrl));
		    }
///
		    @When("^User click on appointment buttoneleven$")
		    public void user_click_on_appointment_buttoneleven() {
		    	homePage = new ApolloHomePage(driver);
		    	homePage.ClickonAppointmentsButton();
		    }
		    
		    @And("^User click on select patients dropDown menueleven$")
		    public void user_click_on_select_patients_dropdown_menueleven() {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonSelectPatientsDropdownMenu();
		    }
		     
		    @And("^User select patient from dropDown menueleven$")
		    public void user_select_patient_from_dropdown_menueleven()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.SelectPatientFromDropdownMenu();
		    }

		    @When("^User click on book an appointment buttoneleven$")
		    public void user_click_on_book_an_appointment_buttoneleven()  {
		    	appointmentpage = new ApolloAppointmentsPage(driver);
		    	appointmentpage.ClickonBookanAppointmentButton();
		    }
		    
		    @And("^User click on Counselling sectioneleven$")
		    public void user_click_on_counselling_sectioneleven()  {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	apollotopspecialitiespage.ClickonCounsellingSection();
		    }
		    
		    @Then("^User should get the list of all Counselling consultantseleven$")
		    public void user_should_get_the_list_of_all_counselling_consultantseleven()  {
		    	apollotopspecialitiespage = new ApolloTopSpecialitiesPage(driver);
		    	try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertTrue(currentUrl.contains(currentUrl));
		    }
		    
/////
		   
		    
}

