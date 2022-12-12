Feature: Test Mercury Tours
1)Valid Case
2)Invalid Case
Background: Given I should be on login page
@PositiveTesting
Scenario: check with valid data
Given To got the login page
When Enter the username "user"
And Enter the password "user"
And Click on the login button
Then I should see the title as "MERCURY T O U R S"
Examples:
|username|password|
|user|user|
|savi|savi|
@NegativeTesting
Scenario: check with invalid data
When Enter the username "savitha"
And Enter the password "Admin123"
And Click on the login button
Then I should see the title as "MERCURY T O U R S "
Examples:
|username|password|
|savitha|Admin123|
React
Reply








