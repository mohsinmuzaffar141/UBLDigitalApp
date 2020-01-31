Feature: Setting page of UBL App

#TC_Settings_02_08 and TC_Settings_04_19 and TC_Settings_04_22 and TC_Settings_04_23
#@settingTransaction
#Scenario Outline: verify that Set Daily Transactions Limit is accessible.
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<settingBtn>"
#	Then  User click on button "<settingSubBtn>"
#	Then  Verify that setting screen should be visible "<verifySettingSubBtn>"
#	Then  Verify that user should able to enter amount 
#	Then  Verify that user should able to enter debit card number
#	Then  Verify that user should able to enter atm pin
#	Then  Verify that password field is hidden
#	Then  click on submit button
#	Then  User click on Ok button
#	Then  Click on back button
#	Then  User click on button "<Account>"
#	Then  User click on button "<Account>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<logoutBtn>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	 
#	
#	Examples: 
#		|   userName  | password | accountName | logoutBtn | settingBtn |         settingSubBtn          | verifySettingSubBtn | Account  |
#		| kingkami127 |  pass    |   mohsin    |   Logout  |  Settings  | Change Daily Transaction Limit | Current Daily Limit:| Accounts |


#TC_Settings_06_36
#@settingChangeQR
#Scenario Outline: verify that Change Daily QR Transactions Limit is accessible.
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<settingBtn>"
#	Then  User click on button "<settingSubBtn>"
#	Then  Verify that user should able to enter amount 
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<logoutBtn>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	 	
#	Examples: 
#		| userName | password |  accountName  | logoutBtn |  settingBtn  |           settingSubBtn           |
#		| username |  pass    |    mohsin     |   Logout  |   Settings   | Change Daily QR Transaction Limit |

#TC_Settings_08_46 and TC_Settings_08_48 and TC_Settings_08_51 and TC_Settings_08_55
@settingQRPin
Scenario Outline: verify that QR pin is accessible.

	Given User Launch ubl app
#	Then  User click on dialouge box yes button
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User moves to scroll down "<logoutBtn>"
	Then  User click on button "<settingBtn>"
	Then  User click on button "<settingSubBtn>"
	Then  Verify that setting screen should be visible "<verifySettingSubBtn>" 
	Then  Click on next button
	Then  User click on Ok button
	Then  User send the six digit pin
	Then  Click on next button
	Then  User verify Feedback field message "<message>"
	Then  User click on Ok button
	Then  Verify that setting screen should be visible "<verifySettingSubBtn>" 
	Then  Verify that password field is hidden in QR pin
	Then  User click on hamburger button
	Then  User moves to scroll down "<logoutBtn>"
	Then  User click on button "<logoutBtn>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully
	 
	Examples: 
		|  userName |   password  |  accountName  | logoutBtn |  settingBtn  | settingSubBtn | verifySettingSubBtn  |                   message                 |
		|  username	|	  pass    |    mohsin     |   Logout  |   Settings   | Create QR PIN |     Enter QR PIN     |Your provided 6 Digits QR Pin do not match |


#TC_Settings_16_104 and TC_Settings_16_105
#@settingDefaultQRAccount
#Scenario Outline: verify the functionality on Set Default QR Account Screen.
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<settingBtn>"
#	Then  User click on button "<settingSubBtn>"
#	Then  Click on account list 
#	Then  User should be able to Set Default QR Account successfully "<alertText>"
#	Then  User click on Ok button
#	Then  Click on back button
#	Then  User click on button "<account>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<logoutBtn>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	 
#	
#	Examples: 
#		| userName | password | accountName | logoutBtn |  settingBtn  |      settingSubBtn     |                  alertText                     | account  |
#		| username |   pass   |   mohsin    |   Logout  |   Settings   | Set Default QR Account |Instant QR payment account changed successfully.| Accounts |
#		
		
		
		
		