Feature: Test Skillary
1)valid case
2)invalid case
Background: 
Given I should go to the login page 
@PositiveTesting
Scenario: To test login functionality with multiple data
And  Enter the email "admin"
And Enter the password "admin"
And Click on the login button
Then I should see the username as "SkillRary Ecommerce"
And Click on the username
And Click on the signout
Then I should go skillary homepage as"Skillary Courses"
Examples:
|admin|admin|
|user|user|
|admin|admin|

@NegativeTesting
Scenario: To test login functionality with valid data
And  Enter the email "savi"
And Enter the password "savi"
And Click on the login button
Then I should see the username as "Skillary"
And Click on the username
And Click on the signout
Then I should go skillary homepage as"Skillary Courses"
