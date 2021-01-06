Feature: Validate the searching with price range

  Scenario: Validate the Search result with price filter
    Given I am on the home page
    When I hover the mouse over the Women button
    And I see the submenu option and click on the summer dress option
    And I land on the summer dress product list page and I see the banner
    And I scroll down to price range option
    And I change the price range to $16-$20
    Then I should see an updated search result
