@KiwiSaverCalculator
Feature: To check kiwi saver retirement calculator information icons and its message

  #Background:
   # Given I launch the website on "<browserName>"
    

  @smoketest @regression
  Scenario Outline: To ensure the presence of information icon for all fields in Kiwi saver retirement calculator
  Given launch browser "<Browser>"
    Given I am on application home page
    When I check for the presence of "<navigationOption>" option
    When I hover over "<navigationOption>"
    And I check "KiwiSaver calculators" button is displayed
    And I click on "KiwiSaver calculators" button
    And I check  "Retirement calculator" page is opened
  And I check "Click here to get started." button is displayed
  And I click on "Click here to get started." button
   And I check "KiwiSaver Retirement calculator" page is opened
    Then I see information icon for all fields for KiwiSaver Retirement Calculator

    Examples:
      | Browser | navigationOption |
      | chrome      | KiwiSaver        |
     # | firefox     | KiwiSaver        |
     
     
     
     

