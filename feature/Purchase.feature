Feature: User Login register page

Scenario: User Login with valid credentials

Given User enter valid url
When User enter valid username and password
Then User navigate into dashboard
And User gets welcome message