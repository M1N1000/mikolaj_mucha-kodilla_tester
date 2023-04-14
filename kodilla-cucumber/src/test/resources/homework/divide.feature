Feature: Divide

  Scenario Outline: Fizz or Buzz
    Given number is <number>
    When I ask whether it's divide
    Then The result is <answer>
    Examples:
      | number | answer |
      |18|"Fizz"|
      |15|"FizzBuzz"|
      |10|"Buzz"|
      |4|"None"|


