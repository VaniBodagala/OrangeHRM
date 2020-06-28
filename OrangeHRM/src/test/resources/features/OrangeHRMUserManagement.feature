#Author: vani
#Feature: List of scenarios.
#Scenario: POM example
Feature: feature to verify user management

  #@SmokeTests
 #Scenario Outline: verify OrangeHRM admin add user functionality
    #Given user logged in as admin
    #When user click on admin and hover usermanagement and click on users
    #Then click on Add user
    #Then enter <userRole>, <employeeName>, <username> and <status> and click on Save button
    #Then User should be added in the users list
#
    #Examples: 
      #| userRole | employeeName | username | status  |
      #| ESS      | Fiona Grace  | abcdefgh  | Enabled |
      
      
   
  Scenario: verify OrangeHRM admin add user functionality
    Given user logged in as admin
    When user click on admin and hover usermanagement and click on users
    Then click on Add user
    Then enter userRole, employeeName, username and status and click on Save button
    Then User should be added in the users list

    

  Scenario: verify OrangeHRM delete user functionality
    Given admin logs in and go to admin page
    When admin selects user to be deleted from the list of users and click on delete button
    Then selected user should be deleted from the users list
