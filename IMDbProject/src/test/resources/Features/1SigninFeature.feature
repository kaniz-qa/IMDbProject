Feature: Signin feature
  I want to sign in with email and password.


  Scenario: As a user , I want to sign in with email and password.
    Given Navigate the url
  
    When Click on sign in link from upper right corner
    And Click on sign in with IMDb link
    And enter email and password
    And click on sign in button
    Then display home page 