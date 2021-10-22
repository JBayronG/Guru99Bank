Feature:  Delete Customer

Background: login page Guru Bank 
    Given that I am on the page GuruBank 
    When entered your user and password
      | mngr360656 | UnyhUgY | 
      
    
    Scenario: Delete customer
    When entered your id
    Then valid that if it has been removed correctly


