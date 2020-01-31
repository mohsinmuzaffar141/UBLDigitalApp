Feature: E-History Page In UBL App 

#TC_E-History_01_01 and TC_E-History_01_0 and TC_E-History_01_07 and TC_E-History_01_08 and TC_E-History_01_12
@eHistoryPage   
Scenario Outline: verify that E-History page should be accessible  

	Given User Launch ubl app
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName>"
	Then  User verify the title of the page
#	Then  User click on button "<startDate>"
#	Then  User selects the start date month "<startFirstMonth>" and "<startSecondMonth>"
#	Then  User selects the end date month "<startFirstMonth>" and "<endSecondMonth>"
#	Then  User set day "<indexDay>" and year "<day>"
#	Then  User set day "<indexYear>" and year "<year>"
#	Then  User click on button "Done"
	Then  User scroll the list of transfer Fund "<onlineShoppingPay>"
	Then  User click on button "<onlineShoppingPay>"
	Then  Verify transaction id on E-Transaction History Page
	Then  click on submit button
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName1>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully
   
	
	Examples:  
		|  userName   | password |  accountName  |        btnName        | btnName1 | startDate | startFirstMonth | startSecondMonth | endSecondMonth |indexDay| indexYear| day | year |onlineShoppingPay| 
		| Saahir14527 | 11111111 |     Mohsin    | E-Transaction History |  logout  |  STARTS   |      JAN        |        MAY       |      JUL       |    2   |     6    |  11 | 2015 |    Giftsdel     | 
		
		
		
#TC_E-History_01_13	
@directDepositBankName   
Scenario Outline: verify that bank name in direct deposit should be present (TC_E-History_01_13)

	Given User Launch ubl app
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName>"
	Then  User verify the title of the page
	Then  User scroll the list of transfer Fund "<directDeposit>"
	Then  User click on button "<directDeposit>"
	Then  Verify that bank name should be present 
	Then  click on submit button
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName1>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully
   
	
	Examples:  
		|  userName   | password |  accountName  |        btnName        | btnName1 | directDeposit |
		| Saahir14527 | 11111111 |     Mohsin    | E-Transaction History |  logout  | Direct Deposit|
		
		
#TC_E-History_01_14		
@accountNumberQRP2P   
Scenario Outline: verify that account number in QR P2P should be present (TC_E-History_01_14)

	Given User Launch ubl app
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName>"
	Then  User scroll the list of transfer Fund "<QRTransfer>"
	Then  User click on button "<QRTransfer>"
	Then  Verify that account name should be present 
	Then  click on submit button
	Then  User click on button "<Account>"
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName1>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully
   
	
	Examples:  
		|  userName   | password |  accountName  |        btnName        | btnName1 |      QRTransfer     | Account  |
		| Saahir14527 | 11111111 |     Mohsin    | E-Transaction History |  logout  |QR P2P Funds Transfer| Accounts |
		
		
		
		
		
		
		
		
		
		
		