Feature: Verify add items from the watch list feature
  I want to add more items from the watch list .


  Scenario: As a user , I want to verify add items from the watch list.
  
   Given Navigate the url
  
    When Click on sign in link from upper right corner
    And Click on sign in with IMDb link
    And enter email and password
    And click on sign in button
    And display home page 
  
  
  
    And Select your watchlist from my account list icon 
    And Click on create new list link
    And Input list title and input list description 
    And Select type of list
    And Click on create button
    And Click on done button 
   
  