Feature: Testing Redbus Login Page2

  Scenario: Accessing Redbus.com
    Given I am a chrome user
    When I access Redbus website
    Then I  see Redbus login page
