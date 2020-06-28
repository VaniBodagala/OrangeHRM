#Author: vani
#Feature: List of scenarios.
#Scenario: POM example
Feature: feature to verify OrangeHRM login with valid credentials

  #@SmokeTests
  Scenario: verify OrangeHRM admin login functionality
    Given user is on OrangeHRM Login page
    When Login page is verified
    Then user enters username and password and click on Login button
    Then user is navigated to dashboard page
