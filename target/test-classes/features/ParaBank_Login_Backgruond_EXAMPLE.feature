
Feature: Verify all possibilites Test login in functionality of paraBank


#-----------------------With Out Background Keyord-------------------------

			#Scenario: verify the login functionality with valid credentials
			#Given customer entered application url and landed on login page 
			#When customer enter username and password 
			#And click on login button
			#Then customer should landed on Dashboard page
			
			#Scenario: verify the login functionality with Invalid credentials
			#Given customer entered application url and landed on login page 
			#When customer enter username and password 
			#And click on login button
			#Then It should show error as invalid username&passwords
			
			#Scenario: verify the login functionality with Invalid username valid password
			#Given customer entered application url and landed on login page 
			#When customer enter username and password  
			#And click on login button
			#Then It should show error as invalid username
		
		
			#Scenario: verify the login functionality with valid username invalid password
			#Given customer entered application url and landed on login page 
			#When customer enter username and password  
			#And click on login button
			#Then It should show error as invalid password


#With Background Keyword

Background:
Given customer entered application url and landed on login page 
When customer enter username and password 
And click on login button



Scenario: verify the login functionality with valid credentials
Then customer should landed on Dashboard page

Scenario: verify the login functionality with Invalid credentials
Then It should show error as invalid username&passwords


Scenario: verify the login functionality with Invalid username valid password
Then It should show error as invalid username


Scenario: verify the login functionality with valid username invalid password
Then It should show error as invalid password



