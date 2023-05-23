Feature:  Verify Registration page Functionality

Scenario: verify with positive Testing
Given User is on register page
When User should enter fallowing Details
	| prasanna | Kumar | prasannakumar@gmail.com | 9550335422|
	| pramod | Kumar | kumar@gmail.com | 9550225422|
Then click on signup button 
Then It should navigate to HomePage 



#Scenario: verify with negative Testing
#Given User is on register page with different url
#|"xyz.com"|
#|"zyx.com"|
#
#
#Scenario: verify with positive Testing
#Given User is on register page
#When User should enter fallowing Details
#	|FirstName|LastName|Email|PhoneNo|
#	| prasanna | Kumar | prasannakumar@gmail.com | 9550335422|
#	| pramod | Kumar | kumar@gmail.com | 9550225422|
#Then click on signup button 
#Then It should navigate to HomePage 
#
