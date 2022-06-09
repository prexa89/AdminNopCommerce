@Login
Feature: Login
  Scenario: Successful login
    Given User open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email as"admin@yourstore.com" and password as "admin"
    And User click on login Button

    Then User should be logged in
