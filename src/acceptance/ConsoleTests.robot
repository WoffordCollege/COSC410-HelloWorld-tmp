*** Settings ***
Library     keywords.Console


*** Keywords ***
The program responds
  [Arguments]  ${response}
  ${actual}=  Get program response
  Should Be Equal  ${response}  ${actual}


*** Test Cases ***
Scenario: A greeting is given in response to the user.
  Given the user starts the program  forward
  When the user views the interface
  Then the program responds  hello world

Scenario: A reverse greeting is given in response to the user.
  Given the user starts the program  backward
  When the user views the interface
  Then the program responds  dlrow olleh
