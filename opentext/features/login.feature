Feature: login feature
Scenario Outline: login to photo app
  Given i enter Username "<username>"
   When i enter password
    Then logged in
    
    Examples:
    |username|
    |mohan|