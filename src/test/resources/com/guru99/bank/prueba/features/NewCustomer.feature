Feature: New Customer

  Background: login page Guru Bank 
    Given that I am on the page GuruBank 
    When entered your user and password
      | mngr360656 | UnyhUgY |
  Scenario: Register of New Customer
    When entered the form data
       | Johan | f | 19/11/1990 | CLL 46 67 B 80 | Caldas |    Not | 063792 | 3227201115 | Johan@gmail.com | 0406730 | 
    Then Validate the message from Customer Registered Successfully!!!