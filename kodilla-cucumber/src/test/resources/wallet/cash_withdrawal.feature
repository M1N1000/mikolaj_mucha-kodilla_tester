Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $<deposit> in my wallet
    When I request $<amount>
    Then $<answer> should be dispensed
    And  And the balance of my wallet should be $<balance>

    Examples:
    | deposit |amount|answer|balance|
    |200  |30  |30 |170             |
    |200  |210 |0  |200             |
    |100  |100 |100|0               |
