Feature: Testing Forward and Backward

Scenario: Accessing facebook and bookings website
Given I am a chrome user
When I access facebook website
And I access bookings.com website
And I go backward
Then I see Facebook
  And I go forward
  And I see bookings