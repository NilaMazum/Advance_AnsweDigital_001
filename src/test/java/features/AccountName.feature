Feature: SignUp Feature

  Scenario: Validate the account name
    Given I am on the home page
    When I click the sign in option on the top right
    And I enter user name and password in the field
    | nmazum@gmail.com | 3f6@b@57D555@SP |
    And I click the Sign in button
    Then I see account name on the right top corner