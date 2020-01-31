Feature: Test Cases Related to profile Module


#TC_Profile_01_01 and TC_Profile_01_03 and TC_Profile_03_14 and TC_Profile_02_08 and TC_Profile_03_10 and TC_Profile_03_11
#@profilePersonalDetail   
#Scenario Outline: verify that profile screen should be visible  
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User click on button "<btnName>"
#	Then  Verify that profile screen should be visible
#	Then  Click on profile persnal detail page
#	Then  Click on edit button 
#	Then  User should change the profile nick name "<profileName>"
#	Then  Click on done button
#	Then  Click on back button
#	Then  User verify the title of the page
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<btnName1>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	 
#	
#	Examples: 
#		|   userName    |   password  |  accountName  | btnName1 |   btnName    | profileName |  Account |
#		|   username	|	  pass    |    mohsin     |  Logout  | Your Profile | mohsinKhan  | Accounts |




#TC_Profile_05_19 and 
@profileBankAccountDetail   
Scenario Outline: verify that bank detail page should be visible  

	Given User Launch ubl app
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User click on button "<btnName>"
	Then  Verify that profile screen should be visible
	Then  Click on bank detail button
#	Then  Verify bank detail page
#	Then  User click on button "<shareBtn>"
#	Then  User click on IBAN number 
#	Then  User click on button "<shareBtn>"
    Then  User scroll it down payee management "<scroll>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<btnName1>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	 
	
	Examples: 
		|   userName    |   password  |  accountName  | btnName1 |   btnName    | shareBtn |         scroll      |
		|   username	|	  pass    |    mohsin     |  Logout  | Your Profile |   SHARE  | VISIT NEAREST BRANCH|
