Feature: STC Plans Tests
  Background:
    Given User is in STC Plan URL

  Scenario Outline: Verify Stc Tv Plan Prices
    Given User Chooses Country
    Then Verify prices for each plan for <country>

    Examples:
      |country|
      |"KSA"|
#         |"Kuwait"|
#         |"Bahrain"|