Feature: Example feature
  ExAMPLE

  Background:
    Given I go to sauce demo page

  @Example
  Scenario: Adding product to cart
    Given I login with userName standard_user and password secret_sauce
    When I add Sauce Labs Backpack product to cart
    And I click on the cart button
    Then I verify that the Sauce Labs Backpack product was added to the cart

  @Example2
  Scenario: Removing product to cart
    Given I login with userName standard_user and password secret_sauce
    When I add Sauce Labs Backpack product to cart
    And I click on the cart button
    And I remove the product Sauce Labs Backpack
    Then I verify that Sauce Labs Backpack product was removed from the cart


