Feature: New Account
  Background:
    Given I am on the home page
    When I click the sign in option on the top right

    Scenario: Validate the new account feature with valid data
      And I land on the login page and see create an account banner
      And I enter valid data "nmazum@gmail.co.uk" on the email field
      And I click the create an account tab
      And I select the radio button
      And I enter first name, last name and password on the respective fields
        | Nilakshi | Mazumder | 3f6@b@57D555@SP |
      And I click on the Date drop down and select "11"
      And I click on the Month drop down and select "December"
      And I click on the Year drop down and select "1985"
      And I enter the data on the address field's firstName, lastName and company
      | Nilakshi | Mazumder | Kimaya |
      And I enter data in the address, city and zipCode
      | 5 Stourton close | Sutton Coldfield | 26154 |
      And I click on the state drop down and select "Colorado"
      And I enter data on the mobilePhone field "07534795644"
      And I enter data in the assign address field "5 stourton close, 26154 "
      And I click register button
      Then I land on my account page and see the "My Account" banner

    Scenario: Validation of the new account feature with no data on email field
      When I land on the login page and see create an account banner
      And I click the create an account tab
      Then I see an error message

  Scenario: Validate the new account feature with invalid data
    And I land on the login page and see create an account banner
    And I enter valid data "nilakshi@gmail.com" on the email field
    And I click the create an account tab
    And I select the radio button
    And I enter first name, last name and password on the respective fields
      | Nila | Sen | 12fskjvieu7sdvjwof |
    And I click on the Date drop down and select "11"
    And I click on the Month drop down and select "December"
    And I click on the Year drop down and select "1985"
    And I enter the data on the address field's firstName, lastName and company
      | N | S | ywjn |
    And I enter data in the address, city and zipCode
      | 7 kfowifjqf | Sutton Coldfield | 29@87UOS |
    And I click on the state drop down and select "Colorado"
    And I enter data on the mobilePhone field "076894"
    And I enter data in the assign address field "5 , 261@$%54 "
    And I click register button
    Then I see an error message for invalid data




