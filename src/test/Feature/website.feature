Feature: Test Multiple websites facebook.com, loyids.com, bookings.com, santander.com

  Scenario: Verify Facebook access
    Given I am a chrome user
    When I access facebook.com website
    Then  I see facebook login page

  Scenario: Verify loyids access
    Given I am a chrome user
    When I access loyids.com website
    Then  I see loyids login page

  Scenario: Verify bookings access
    Given  I am a chrome user
    When I access bookings.com website
    Then  I see bookings.com website

  Scenario: Verify santander access
    Given  I am a chrome user
    When I access santander.com website
    Then  I see santander.com website

