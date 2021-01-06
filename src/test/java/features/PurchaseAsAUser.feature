Feature: Validate purchase as a user
  @nila
  Scenario: Validate the account name
    Given I am on the home page
    When I click the sign in option on the top right
    And I enter user name and password in the field
      | nmazum@gmail.com | 3f6@b@57D555@SP |
    And I click the Sign in button
    And I click on the women option from the menu
    And I click product from product list
    And I click add to cart and see the success msg
    And I click on continue shopping
    And I click on Tops from the women submenu
    And I click on the "Blouse"
    And I land on the product description page and see the logo
    And I click on the size drop down and select "M"
    And I select the colour "White"
    And I click on add to cart
    And I see the success message and I click on the cross icon
    And I land on the previous page and I click on the cart icon
    And I land on the shopping summary page
    And I click on the proceed to checkout button
    And I land on the Address page and click on proceed to check out
    And I land on the shopping page and and see the banner
    And I click the TAndC check box
    And I click on the proceed to checkout tab
    And I land on the payment method page and select "Pay by bank transfer" option
    And I click on the confirmation button
    Then I see a success message "Your order on My Store is complete"
