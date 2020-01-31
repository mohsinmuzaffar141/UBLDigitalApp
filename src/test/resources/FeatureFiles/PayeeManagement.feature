Feature: Payee Management Test Cases of Digital App

#TC_payee_01_01 and TC_payee_04_20
#@payeeManagementPage
#Scenario Outline: Verify that payee management is accessible
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User click on button "<payeeManagementBtn>"
#	Then  Verify that payee management is accessible "<addPayeeManagementBtn>"
#	Then  User click on button "<addPayeeManagementBtn>"
##	Then  Verify that payee management is accessible "<addPayeeText>"
#	Then  User click on button "<Account>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<logoutBtn>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	 
#	
#	Examples: 
#		|   userName    |   password  |  accountName  | logoutBtn |  payeeManagementBtn  | addPayeeManagementBtn |   addPayeeText  |  Account  |
#		|   username	|	  pass    |    mohsin     |   Logout  |   Payee Management   |    ADD NEW PAYEE      | Types Of Payees |  Accounts |


#TC_payee_09_67 and TC_payee_04_22 and TC_payee_11_95 and TC_payee_03_12 and TC_payee_03_13 and TC_payee_09_77
@payeeManagementUBLBranchAccount
Scenario Outline: Verify that bank should be selected through UBL Branch Account

	Given User Launch ubl app
	Then  User enters Email as"<userName>" and Password as "<password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User click on button "<payeeManagementBtn>"
	Then  User click on button "<addPayeeManagementBtn>"
	Then  User click on button "<payeeType>" 
	Then  User click on button "<selectBankText>"
	Then  User search for the bank "<searchBank>"
	Then  User click on checkbox "<selectBank>"
	Then  User enters the bank account detail "<bankAccount>"
	Then  Click on next button
#	Then  Verify that payee management is accessiblee "<alert>"
	Then  User click on Ok button
	Then  User click on Payements button
	Then  User click on hamburger button
	Then  User click on button "<payeeManagementBtn>"
	Then  User scroll it down payee management "<scroll>"
	Then  User click on delete payee button
	Then  verify that all the button logout popup are functional "Yes"
	Then  Verify that payee management is accessible "<alert>"
	Then  User click on Ok button
	Then  User click on button "<addPayeeManagementBtn>"
	Then  User click on button "<payeeType>" 
	Then  User click on button "<selectBankText>"
	Then  Verify that payee management is accessible "<selectBankText>"
	Then  User search for the bank "<searchBank>"
	Then  User click on checkbox "<selectBank>"
	Then  User verify the title of the page
	Then  User enters the bank account detail "<bankAccount>"
	Then  Click on next button
	Then  click on submit button
	Then  User enter OTP as "<code>"
	Then  User verify Feedback field message "<message>"
	Then  User click on Ok button
	Then  User click on Payements button
	Then  User click on Payements button
	Then  User click on hamburger button
	Then  User moves to scroll down 
	Then  User click on button "<logoutBtn>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully	 
	
	Examples: 
	| userName | password | accountName | logoutBtn | payeeManagementBtn |addPayeeManagementBtn| selectBankText |      payeeType     |      selectBank     | searchBank |  Account  |  bankAccount |          message         |     scroll   | 	 alert  |
	| username |   pass   |   mohsin    |   Logout  |  Payee Management  |     ADD NEW PAYEE   |  Select Branch | UBL Branch Account | 0462-Keamari Karachi|    0462    |  Accounts | 046210110708 | Payee added Successfully | Kamran Mirza |  Success |


#TC_payee_13_104 and TC_payee_13_105
#@payeeManagementOtherBranchAccount
#Scenario Outline: Verify that bank should be selected through other bank Account
#
#	Given User Launch ubl app
#	Then  User click on dialouge box yes button 
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User click on button "<payeeManagementBtn>"
#	Then  User click on button "<addPayeeManagementBtn>"
#	Then  User click on button "<payeeType>"
#	Then  User click on button "<selectBankText>"
#	Then  User search for the bank "<searchBank>"
#	Then  User click on checkbox "<selectBank>"
#   Then  User click on button "<Account>"
#   Then  Verify that payee management is accessible "<otherBankAccount>"
#   Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<logoutBtn>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User click on dialouge box yes button 
#	Then  User should logout successfully
#	 
#	
#	Examples: 
#	| userName | password | accountName | logoutBtn | payeeManagementBtn |addPayeeManagementBtn| selectBankText|      payeeType    |    selectBank     | searchBank |Account |      otherBankAccount      |
#	| username |   pass   |   mohsin    |   Logout  |  Payee Management  |     ADD NEW PAYEE   |  Select Bank  | Other Bank Account|Allied Bank Limited|   allied   |Accounts|Add Other Bank Account(IBFT)|



#TC_payee_14_129 and TC_payee_15_139 and TC_payee_15_147 and TC_payee_15_154
#@payeeManagementCNICFunctionality
#Scenario Outline: Verify that user should be able to access CNIC functionality
#
#	Given User Launch ubl app
##	Then  User click on dialouge box yes button 
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User click on button "<payeeManagementBtn>"
#	Then  User click on button "<addPayeeManagementBtn>"
#	Then  User click on button "<payeeType>"
#   Then  User click on button "<Account>"
#   Then  Verify that payee management is accessible "<CNICAccount>"
#   Then  User enters reciever Name "<accountName>"
#   Then  User enters reciever CNIC "<CNIC>"
#   Then  User enters reciever mobile number "<Number>"
#   Then  User enters reciever email "<Email>"
#   Then  Click on next button
#   Then  User click on button "<Account>"
#   Then  Verify that payee management is accessible "<CNICAccount>"
#   Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<logoutBtn>"
#	Then  verify that all the button logout popup are functional "Yes"
##	Then  User click on dialouge box yes button 
#	Then  User should logout successfully
#	 
#	
#	Examples: 
#	| userName | password | accountName | logoutBtn | payeeManagementBtn |addPayeeManagementBtn|           payeeType          | Account  |       CNICAccount      | CNIC | Number | Email |
#	| username |   pass   | accountname |   Logout  |  Payee Management  |     ADD NEW PAYEE   | Transfer Funds to NADRA CNIC | Accounts | Transfer Funds to CNIC | Cnic | number | email |





# NEED SOME IMENDMENTS

#TC_PTH_02_04
#@payeeManagementDateFilter
#Scenario Outline: Verify that date filter works properly
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
##	Then  User click on button "Welcome mohsin"
#	Then  User click on hamburger button
#	Then  User click on button "<payeeManagementBtn>"
##	Then  Verify that payee management is accessible "<addPayeeManagementBtn>"
#	Then  Click on payee from payee list 
#	Then  User click on button "<startDate>"
#	Then  User set the year
##	Then  User selects the start date month "<startFirstMonth>" and "<startSecondMonth>"
##	Then  User selects the end date month "<startFirstMonth>" and "<endSecondMonth>"
#	Then  User click on button "Done"
#	Then  Verify that user should be on payee management screen 
#	Then  Click on payee management button "<>"
#	Then  Click on back button
#    Then  User click on button "<Payment>"
#    Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<logoutBtn>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
	
#	Then  User scroll it down payee management "<scroll>"
	 
	
#	Examples: 
#	| userName | password | accountName | logoutBtn | payeeManagementBtn |addPayeeManagementBtn| Payment  | startDate | startFirstMonth | startSecondMonth | endSecondMonth|
#	| username |   pass   | accountname |   Logout  |  Payee Management  |     ADD NEW PAYEE   | Payments |  STARTS   |      JAN        |        MAY       |      JUL      |
 