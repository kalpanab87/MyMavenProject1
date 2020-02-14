Feature: To check the elements of FB website

  Scenario Outline: To test FB elements
    Given I am a chrome user
    When I access facebook website
    Then I see "<elementName>" is visible

    Examples:
      |elementName|
      |email|
      |pass|
      |u_0_b|
      |login_form|
      |u_0_q|
      |u_0_s|
      |u_0_v|
      |u_0_10|
      |day|
      |month|
      |year|
      |u_0_6|
      |u_0_7|
      |u_0_14|
      |gender-help|
      |u_0_17|
      |u_0_18|
      |reg_pages_msg|
      |pageFooter|





