Feature: validate home page of FreeCRM
Scenario: To validate home page
Given i enter the username
   When i enter the Password
    Then i logged in to freeCRM
    Then i validate the Header contacts activity stream
    Then i validate the header Deals
    Then i Validate the header Call Queue