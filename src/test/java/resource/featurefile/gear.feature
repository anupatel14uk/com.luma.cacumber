@regression
Feature: Gear Test
  As user I want to login into luma shopping website

  @smoke
  Scenario: user Should Add Product SuccessFully ToShoppingCart
    Given I am on shopping page
    When  I Mouse Hover on Gear Menu
    And   I click on Bags
    And   I Click on Product Name Overnight Duffle
    And   I  Verify the text "Overnight Duffle"
    And   I Change Qty "3"
    And   I Click on Button Add to Cart
    And   IVerify the text "You added Overnight Duffle to your shopping cart."
    And   IClick on ‘shopping cart’ Link into message
    And   I  Verify the product name "Overnight Duffle"
    And   I  Verify the Qty is "3"
    And   I Verify the product price "$135.00"
    And   I Change duffle Qty to "5"
    And   I Click on ‘Update Shopping Cart’ button
    Then  I Verify the product price is "$225.00"


