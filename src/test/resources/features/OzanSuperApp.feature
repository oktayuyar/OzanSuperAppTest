@ozan_superapp_test_scenarios
Feature: Ozan SuperApp

  @Check_send_money_with_phone_number_page
  Scenario: Check send money with phone number page
    Given Login to ozan super app
    And Check the successful login to app
    When Select send money with phone number
    Then Check send money with phone number page