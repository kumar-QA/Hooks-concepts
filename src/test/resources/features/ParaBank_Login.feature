@All
Feature: Verify all possibilites Test login in functionality of paraBank

@smoke @Reg
Scenario: verify the login functionality with valid credentials
Given customer entered application url and landed on login page 
When customer enter username and password 
And click on login button
Then customer should landed on Dashboard page
And click on login button
Then customer should landed on Dashboard page


@InvalidCredentials
Scenario: verify the login functionality with Invalid credentials
Given customer entered application url and landed on login page 
When customer enter username as "prasanna" and password as "admin@123" 
And click on login button
Then It should show error as invalid username&passwords


@InvalidUsername
Scenario: verify the login functionality with Invalid username valid password
Given customer entered application url and landed on login page 
When customer enter username as "xyzzz" and password as "admin@123" 
And click on login button
Then It should show error as invalid username


@InvalidPassword
Scenario: verify the login functionality with valid username invalid password
Given customer entered application url and landed on login page 
When customer enter username as "xyzzz" and password as "admin@123" 
And click on login button
Then It should show error as invalid password
