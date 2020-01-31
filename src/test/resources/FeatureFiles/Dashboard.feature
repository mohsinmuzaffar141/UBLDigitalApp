Feature: Test Cases of Dashboard Module
#TC_Dashboard_01_03 and and TC_Dashboard_01_05 TC_Dashboard_02_16 and TC_Dashboard_02_18
@Dashboard   
Scenario Outline: verify that dashboard button should be functional  

	Given User Launch ubl app
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  Verify that buttons on dashboard should be functional
	Then  Click on show balance button "<showBalance>"
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully
	 
	
	Examples: 
		|   userName    |   password  | code |  accountName  | btnName  | showBalance |
		|   kingkami127	|	  pass    |  1   |    mohsin     |  Logout  |   balance   |
		
		
##TC_Dashboard_01_02 and TC_Dashboard_04_24 and TC_Dashboard_04_29
#@DashboardSideBar   
#Scenario Outline: verify that dashboard side bar should be functional  
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<btnName>"
##	Then  User click on button "<btnName>"
#	Then  Verify that setting screen should be visible "<btnName>"
#	Then  Verify all the list of accounts
#	Then  User click on button "<btnName>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<btnName1>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	 
#	
#	Examples: 
#		|   userName    |   password  | code |  accountName  | btnName1  | showBalance |  btnName |      Account     |
#		|   aziz.siddiqui27	|	  pass    |  1   |    mohsin     |  Logout   |   balance   | Accounts |  Listof Accounts | 
		
		
		