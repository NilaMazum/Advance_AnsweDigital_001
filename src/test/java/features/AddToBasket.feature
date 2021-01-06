Feature: Validate the add to basket feature
  Background:
    Given I am on the home page

    Scenario: Validate add to basket with one item
      When I click the product from product list
      And I click the add to cart
      And I see the product is successfully msg
      And I click on the proceed to checkout
      And I land on the shopping cart page
      And I click on the delete icon
      Then I see a message display "Your shopping cart is empty."

