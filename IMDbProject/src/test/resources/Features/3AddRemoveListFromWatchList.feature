Feature: Verify add and remove items from the watch list feature
  I want to remove  items from the watch list .


  Scenario: As a user , I want to verify add items from the watch list.
  
  Given Navigate the url
  
    When Click on sign in link from upper right corner
    And Click on sign in with IMDb link
    And enter email and password
    And click on sign in button
    And display home page 
    
          
    And Click on menu icon
    And Click on most popular menu link
    And click on add to watchlist icon
    And Click on account icon
    And select your watchlist
    Then I can show all selected watch list
  
  
  Scenario: As a user , I want to verify remove items from the watch list.
  
  Given Navigate the url
  
    When Click on sign in link from upper right corner
    And Click on sign in with IMDb link
    And enter email and password
    And click on sign in button
    And display home page 
  
    
     And Click on menu icon
    And Click on most popular menu link
    And click on add to watchlist icon
    And Click on account icon
    And select your watchlist
    And I can show all selected watch list   
     
     
     And Click on remove from watchlist icon 
    Then refresh the page , after that I am not able to see in the watch list 
  
  
  
  