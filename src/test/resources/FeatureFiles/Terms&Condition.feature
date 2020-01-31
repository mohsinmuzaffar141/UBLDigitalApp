Feature: Terms & Condition Page In UBL App 

#TC_T&C_02_06 & TC_T&C_02_07	
#@termsAndConditions   
Scenario Outline: verify that terms & conditions page should be accessible  

	Given User Launch ubl app
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName>"
	Then  verify that terms & conditions page should be accessible
	Then  verify that all the button on terms & conditions page are functional
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName1>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully
   
	
	Examples:  
		|   userName    |   password  | code|  accountName  |       btnName      | btnName1  |
		|  Saahir14527	|	11111111  |  1  |     Mohsin    | Terms & Conditions |  logout   |
