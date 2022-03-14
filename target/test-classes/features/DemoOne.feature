Feature: Verify the Functionality of Specialities Page

#Summary:
#Author: "Sanket Pande"
#Author's Email: "sanket.pande@capgemini.com"
#Creation Date: 11/03/2022

Background:
Given User should log in account 

@all @Specialities
Scenario:[TSAP-001] User Should be able to navigate to the Specialities Page
	When User click on appointment buttonone
	And User click on select patients dropDown menuone
	And User select patient from dropDown menuone
	When User click on book an appointment buttonone
	Then User should get specialities pageone

@all @Specialities
Scenario:[TSAP-002] User should verify the functionality of meet in person button
	When User click on appointment buttontwo
	And User click on select patients dropDown menutwo
	And User select patient from dropDown menutwo
	When User click on book an appointment buttontwo
	And User should click on meet in person buttontwo
	Then User should see the steps of meet in person buttontwo
	
@all @Specialities	
Scenario:[TSAP-003]	 User should verify the functionality of Text Video Call button
	When User click on appointment buttonthree
	And User click on select patients dropDown menuthree
	And User select patient from dropDown menuthree
	When User click on book an appointment buttonthree
	And User click on Text Video Call buttonthree
	Then User should see the steps of Text Video Call buttonthree
	
@all @Specialities
Scenario:[TSAP-004]	 User should verify the functionality of Top specialities Covid
	When User click on appointment buttonfour
	And User click on select patients dropDown menufour
	And User select patient from dropDown menufour
	When User click on book an appointment buttonfour
	And User click on covid consultation sectionfour
	Then User should get the list of all covid consultantsfour
	
@all @Specialities
Scenario:[TSAP-005]	 User should verify the functionality of Top specialities Dermatology
	When User click on appointment buttonfive
	And User click on select patients dropDown menufive
	And User select patient from dropDown menufive
	When User click on book an appointment buttonfive
	And User click on Dermatology sectionfive
	Then User should get the list of all Dermatology consultantsfive
	
@all @Specialities
Scenario:[TSAP-006]	 User should verify the functionality of Top specialities General Physician
	When User click on appointment buttonsix
	And User click on select patients dropDown menusix
	And User select patient from dropDown menusix
	When User click on book an appointment buttonsix
	And User click on General Physician sectionsix
	Then User should get the list of all General Physician consultantssix

@all @Specialities
Scenario:[TSAP-007]	 User should verify the functionality of Top specialities Paediatrics
	When User click on appointment buttonseven
	And User click on select patients dropDown menuseven
	And User select patient from dropDown menuseven
	When User click on book an appointment buttonseven
	And User click on Paediatrics sectionseven
	Then User should get the list of all Paediatrics consultantsseven

@all @Specialities
Scenario:[TSAP-008]	 User should verify the functionality of Other specialities Allergist
	When User click on appointment buttoneight
	And User click on select patients dropDown menueight
	And User select patient from dropDown menueight
	When User click on book an appointment buttoneight
	And User click on Allergist sectioneight
	Then User should get the list of all Allergist consultantseight

@all @Specialities
Scenario:[TSAP-009]	 User should verify the functionality of Other specialities Cardiology
	When User click on appointment buttonnine
	And User click on select patients dropDown menunine
	And User select patient from dropDown menunine
	When User click on book an appointment buttonnine
	And User click on Cardiology sectionnine
	Then User should get the list of all Cardiology consultantsnine

@all @Specialities
Scenario:[TSAP-010]	 User should verify the functionality of Other specialities Bariatrics
	When User click on appointment buttonten
	And User click on select patients dropDown menuten
	And User select patient from dropDown menuten
	When User click on book an appointment buttonten
	And User click on Bariatrics sectionten
	Then User should get the list of all Bariatrics consultantsten
	
@all @Specialities
Scenario:[TSAP-011]	 User should verify the functionality of Other specialities Counselling
	When User click on appointment buttoneleven
	And User click on select patients dropDown menueleven
	And User select patient from dropDown menueleven
	When User click on book an appointment buttoneleven
	And User click on Counselling sectioneleven
	Then User should get the list of all Counselling consultantseleven



