Feature: Kuwait packages

  Scenario Outline: open Kuwait page
    Given Home page in English
    When open Kuwait country page
    And get plans names "<planName>" "<id>"
    Then check Kuwait Currency "<price>" "<id>"

    Examples:
      | id | planName | price         |
      | 0  | LITE     | 1.2 KWD/month |
      | 1  | CLASSIC  | 2.5 KWD/month |
      | 2  | PREMIUM  | 4.8 KWD/month |