@Login
Feature: Login Functionality
@smoke
Scenario: Verify user is able to login with valid credentials
Given If user is on home page
When  Click on login link
And   Enter login details
Then  Verify logout link
@sanity @smoke
Scenario: Verify user is able to generate QR Code & URL
Given If user is on home page
When  Click on login link
And   Enter login details
And   Click on Receive QR-code payment
And   Enter amount
And   Click on Next button
Then  Verify QR Code and URL
@sanity @smoke
Scenario: Verify user is able to generate QR Code & URL
Given If user is on home page
When  Click on login link
And   Enter login details
And   Click on Receive QR-code payment
And   Enter amount
And   Click on Next button
And   Click  on button 
Then  Verify QR Code and URL
