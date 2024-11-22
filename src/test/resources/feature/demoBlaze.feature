Feature: Automation softka technical challenge

  @Test
  Scenario: Validate first automation process
    Given The user adds a product to the shopping cart
    When The user registers in the system
      | user     | password |
      | EstebanE | 1234     |
    And The user make login into the system
      | user     | password |
      | EstebanE | 1234     |
    Then The user see that Welcome EstebanE