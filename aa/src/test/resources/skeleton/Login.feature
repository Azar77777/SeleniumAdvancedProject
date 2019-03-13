Feature: Login
  I want to use this template for my feature file


  Scenario Outline: Successful login
    Given User is on the Same page
    When user enters "<username>" and "<password>" and click submit button
    Then login is successful

  
Examples:
|username|password|
|azar|azar|
|azar|azar|
