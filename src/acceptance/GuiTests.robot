*** Settings ***
Library     SwingLibrary
Library     Screenshot


*** Keywords ***
The user starts the program
  [Arguments]  ${direction}
  Start Application   edu.wofford.GuiMain
  Select Window       Hello World
  Run Keyword If      "${direction}" == "forward"   Check Check Box   mycheckbox   ELSE   Uncheck Check Box   mycheckbox
  Click On Component  mybutton

The user views the interface
  No Operation

The program responds
  [Arguments]          ${response}
  ${actual}=           Get Label Content  mylabel
  Run Keyword Unless   "${response}" == "${actual}"   Take Screenshot
  Should Be Equal      ${response}  ${actual}
  Close Window         Hello World


*** Test Cases ***
Scenario: A greeting is given in response to the user.
  Given the user starts the program  forward
  When the user views the interface
  Then the program responds  hello world

Scenario: A reverse greeting is given in response to the user.
  Given the user starts the program  backward
  When the user views the interface
  Then the program responds  dlrow olleh
