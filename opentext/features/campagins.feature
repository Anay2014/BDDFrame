Feature: create campagin
Scenario Outline: To create campagins for services
 Given i enter the username
 When i enter the "<password>"
 Then i logged in to freeCRM
     When i click on campaigns tab
     Then i validate campaigns page
     When i click on new tab
     When i enter the valid credentials
     When click on save button
     
     Examples:
     |password|
     |Mohan1988|