Feature: Edit Customer

Background: login page Guru Bank 
    Given that I am on the page GuruBank 
    When entered your user and password
      | mngr360656 | UnyhUgY | 

  Scenario: Edit Customer
     When Datos nuevos
      | Juan | f | 19/11/2021 | CLL 46b 67 A 40c | francia | si aplica | 093912 | 3127816525 | Juan70m@gmail.com | 1234567 |
     Then Submit de validar
