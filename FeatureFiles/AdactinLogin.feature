Feature: Checking Login Functions

  Scenario Outline: Checking with Valid Credentials
    Given Facebook Website is loaded
    When User Enters userName and password 2D with Heading
      | UserName   | Password |
      | Sathish    |      123 |
      | SABA       |     5656 |
      | Velmurugan |     9999 |
    And User Clicks Login Button
    Then Take Scrrenshot
	
  Scenario: Forgot Password
	Given User Clicks Forgot Password
	When User Gives Valid Data
	Then Assert the Result
