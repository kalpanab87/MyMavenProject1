Feature: Access Websites through internet

  Scenario Outline: Access Multiple websites
    Given I am a chrome user
    When I access "<websiteName>" website
    Then I see Home page with "<websiteTitle>"

    Examples:
    |websiteName|websiteTitle|
    |Facebook|Facebook|
    |Lloydsbank|Lloyds|
    |Booking|Booking|
    |Santander|Santander|


