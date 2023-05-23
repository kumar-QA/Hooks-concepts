@f1
Feature:  Verify Registration page Functionality with DataDriven Testing

Scenario Outline: verify registration functionality with multiple Data

Given User is on register page
When user Enter "<FirstName>" and "<LastName>"
And user should enter "<Email>" and "<PhoneNo>" also
When user  click on register btn
Then user should get success Message notification
Then user should navigate to homePage directly


Examples: 
	|FirstName|LastName|Email|PhoneNo|
	| prasanna | Kumar | prasannakumar@gmail.com | 9550335422 |
	| pramod | Kumar | kumar@gmail.com | 9550225422 |