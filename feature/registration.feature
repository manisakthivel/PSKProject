Feature: Registering PSK Application

  Background: 
    Given Launch PSK Application

  Scenario: Registering for Single User
    And Close the popup
    And Click New User registration
    When Fill the mandatory fields to register
    And Click the Register button
    Then User registered succesfully

  Scenario: Locate Passport Seva Kendra
    Given Launch PSK Application1
    When User cliks Locate Passport Seva Kendra
    And User click Passport office in Select an option
    And User select Chennai from Passport office dropdown
    And Click Locate PSK button
    Then User should see the PSK location table in Chennai

@smoke
  Scenario: Calculating fees for Passport for Adults and Kids
    Given Launch PSK Application2
    When User clicks Fee Calculator tab
    And User select Passport from Select Application type
    And User select Fresh from Types of services
    And User select Applicant age as Less than 15 years
    And User clicks Normal from Required scheme
    And User clicks Calculate Fee button
    Then Validate Fee amount as 1000
