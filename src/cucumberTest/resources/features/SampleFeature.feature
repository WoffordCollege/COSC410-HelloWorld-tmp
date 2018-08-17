
Feature: An example feature
  As a user of the Hello World program,
  I want to say hello
  So that I can see the response.

  Scenario: A greeting is given in response to the user.
    Given the user enters the greeting "forward"
    When the user views the interface
    Then the program responds forwards

  Scenario: A reverse greeting is given in response to the user.
    Given the user enters the greeting "backward"
    When the user views the interface
    Then the program responds backwards
