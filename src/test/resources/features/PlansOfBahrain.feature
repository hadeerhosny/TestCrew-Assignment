Feature: Bahrain packages

  Scenario Outline: open Bahrain page
    Given Home page in English
    When open Bahrain country page
    And get plans names "<planName>" "<id>"
    Then check Bahrain Currency "<price>" "<id>"

    Examples:
      | id | planName | price       |
      | 0  | LITE     | 2 BHD/month |
      | 1  | CLASSIC  | 3 BHD/month |
      | 2  | PREMIUM  | 6 BHD/month |