Feature: Test OrangeHRM  
1) Valid Case
2)Invalid Case
Background: Given I should be on login page
@PositiveTesting
Scenario: check with valid data
Given To got the login page 
When Enter the username "Admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the title as "OrangeHRM"  
Examples:
|user|pass|
|Admin|admin123|

@NegativeTesting
Scenario: check with invalid data
When Enter the username "savitha"
And Enter the password "Admin123"
And Click on the login button
Then I should see the title as "OrangeHRM"  