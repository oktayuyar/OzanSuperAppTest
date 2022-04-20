@ozan_superapp_test_scenarios
Feature: Ozan SuperApp

  @Check_send_money_with_phone_number_page
  Scenario: Check send money with phone number page
    Given Login to ozan super app
    And Check the successful login to app
    When Select send money with phone number
    Then Check send money with phone number page

  @Send_money_with_missing_phone_number
  Scenario: Send money with missing phone number
    Given Login to ozan super app
    And Check the successful login to app
    When Select send money with phone number
    Then Check send money with missing phone number

  @Send_money_with_invalid_phone_number
  Scenario: Send money with invalid phone number
    Given Login to ozan super app
    And Check the successful login to app
    When Select send money with phone number
    Then Check send money with invalid phone number