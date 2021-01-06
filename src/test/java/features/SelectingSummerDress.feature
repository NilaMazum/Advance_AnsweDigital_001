Feature: Validate Summer Dress selection
  Background:
    Given I am on the home page

    Scenario: Validate Summer dress product list page
      When I hover the mouse over the Women button
      And I see the submenu option and click on the summer dress option
      And I land on the summer dress product list page and I see the banner
      Then I scroll down and see summer dresses in the page
