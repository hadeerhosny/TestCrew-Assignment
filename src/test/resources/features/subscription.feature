Feature: Subscription Feature
  Scenario: User Navigate to the following URL and Validate the Subscription Packages
    Given User selects one of the countries
    When User Validate the Subscription Packages Type, Price and Currency
    Then User knows the data of each packages
