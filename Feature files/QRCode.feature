@QRCode
Feature: QR Code Functionality
@Regression
Scenario: Verify user is able to generate QR Code & URL
Given If user is on home page
When  Click on login link
And   Enter login details
And   Click on Receive QR-code payment
And   Enter amount
And   Click on Next button
Then  Verify QR Code and URL