Feature: Login in to UBL App 
	
#TC_login_10_29 and TC_login_10_32
@Login        
Scenario Outline: Sign in to UBL  

	Given User Launch ubl app
#	And   User click on allow button
	Then  Verify that forgot password link is functional
	Then  User enters Email as"<userName>" and Password as "<Password>"
	Then  User clicks on login button
	Then  User enter OTP as "<code>"
	Then  User enter nick name for user "<accountName>"
	Then  User click on hamburger button
	Then  User moves to scroll down
	Then  User click on button "<btnName>"
	Then  verify that all the button logout popup are functional "Yes"
	Then  User should logout successfully
	
	Examples: 
		|   userName    |  Password  | code|  accountName  | btnName |
		|   username	|  password  |  1  |   acctName    |  Logout |


#TC_login_10_40 and TC_login_10_54 and TC_login_12_55 and TC_login_14_61 and TC_login_15_62 and TC_login_17_64 and TC_login_18_65 and TC_login_20_67 and TC_login_21_68 
#TC_login_21_69 and TC_login_21_71 and TC_login_27_89 and TC_login_28_94
@LoginPageBtn        
Scenario Outline: verify that all the buttons on login page should be fuctional  

	Given User Launch ubl app
	Then  Verify that the username and password fields are functional
	Then  Verify that forgot password link is functional
	Then  Verify that all the buttons on login page are functional "<QRPay>"
	Then  User click on button "<gallery>"
	Then  User click on button "<imageGallery>"
	Then  User click on Ok button
	Then  Verify that all the buttons on login page are functional "<AssPass>"
	Then  User click on button "<Country>"
	Then  User click on back button from ad screen
	Then  Verify that all the buttons on login page are functional "<LocateUS>"
#	Then  Tap on app screen 
	Then  User click on button "<Country>"
	Then  User click on back button from ad screen
	Then  Verify that all the buttons on login page are functional "<HelpBtn>"
	Then  User click on button "<FAQBtn>"
	Then  Verify that setting screen should be visible "<FAQBtn>"
	Then  Click on back button
	Then  User click on button "<ContactUSBtn>"
	Then  Verify that setting screen should be visible "<ContactUSBtn>"
	Then  Click on back button
	Then  User click on button "<HelpBtn>"
	Then  Click on back button
	Then  Verify that all the buttons on login page are functional "<QRSignUp>"
#	Then  Click on back button
#	Then  Verify that all the buttons on login page are functional "<saveBtn>"
	Then  User should unable to login into account
	Then  User click on Ok button
#	Then  Verify that all the buttons on login page are functional "<shareBtn>"
#	Then  Tap on app screen 
#	Then  Click on back button

	
	
	Examples:  
	|  FAQBtn | ContactUSBtn | HelpBtn |  Country  | LocateUS | AssPass  |  QRPay  | gallery |    imageGallery    | QRSignUp   | saveBtn | shareBtn |
	|   FAQs  |  Contact Us  |   Help  | Countries | Locate Us| Aas Pass |  QR Pay | Gallery | InstantSignup_.jpg | QR Sign Up |   Save  |  Share   |



#TC_login_10_33 and TC_login_10_34 and TC_login_10_50
#@LoginInValidCredentials        
#Scenario Outline: Sign in into UBL app with invalid credentials TC_login_10_33 , TC_login_10_34 and TC_login_10_50
#
#	Given User Launch ubl app
#	Then  Verify that forgot password link is functional
#	Then  User enters Email as"<userName>" and Password as "<Password>"
#	Then  User clicks on login button
#	Then  User should unable to login into account
#	Then  User click on Ok button
#	Then  User clicks on login button
#	Then  User should unable to login into account
#	Then  User click on Ok button
#	Then  User clicks on login button
#	Then  User should unable to login into account
#	Then  User click on Ok button
#	Then  verify that user should navigate to forget password screen "Forgot Password"
#	Then  Click on back button
#	Examples: 
#		|   userName    |  Password  | code|  accountName  |
#		|  saahir2471   |  11111111  |  1  |   acctName    | 
		
		
#TC_Feedback_02_09
#@feedback   
#Scenario Outline: verify that user is able to submit his Feedback successfully  
#
#	Given User Launch ubl app
##	And   User click on allow button
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<btnName>"
#   Then  verify text field is empty
#   Then  click on submit button
#   Then  User verify Feedback field message "<message>"
#   Then  User click on Ok button
#   And   User enter feedback in text field
#   Then  click on submit button
#	Then  User click on Ok button
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<btnName1>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	
#	Examples: 
#		|   userName    |   password  | code|  accountName  |     btnName    | btnName1 |         message      |
#		|  Saahir14527	|	11111111  |  1  |     Mohsin    |     Feedback   |  Logout  | Please enter message |
		

##TC_Logout_02_06 & TC_T&C_02_07 & TC_Logout_02_08
#@logOut   
#Scenario Outline: verify that logout should be accessible  
#
#	Given User Launch ubl app
#	Then  User enters Email as"<userName>" and Password as "<password>"
#	Then  User clicks on login button
#	Then  User enter OTP as "<code>"
#	Then  User enter nick name for user "<accountName>"
#	Then  User click on hamburger button
#	Then  User moves to scroll down
#	Then  User click on button "<btnName>"
#	Then  verify that logout should be accessible
#	Then  verify that all the button logout popup are functional "No"
#	Then  User click on hamburger button
#	Then  User click on hamburger button
#	Then  User click on button "<btnName>"
#	Then  verify that all the button logout popup are functional "Yes"
#	Then  User should logout successfully
#	
#	Examples: 
#		|   userName    |   password  | code|  accountName  |  btnName |
#		| Saahir14527	|	11111111  |  1  |     Mohsin    |  Logout  |

 













		
		