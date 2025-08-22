Feature: checking user is able to login with valid credentials
Scenario: Successful login
Given ebay login page should be open in default browser
When click on sign link in home page
And click on username and add username
And click on continue
And click on password aand add password
Then successful home page is displayed after sign in