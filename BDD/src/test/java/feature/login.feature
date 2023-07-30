Feature: Login facebook page
Scenario: validate login
Given User on Facebook login page
When User enters validate username
And User enters validate password
And User clicks on login button
Then Home page displayed

Scenario: Invalidate login
Given User on Facebook login page
When User enters invalide username
And User enters invalide password
And User Clicks on login button
Then Source Error

Scenario Outline: Login HRM
Given User is on signin page
When user enters username as <username> and <password>
And User clicks on Login 
Then HomePage should be  displayed
Examples:
    |username|password|
    |admin|admin123|
    |hr001|mgr00|
    


