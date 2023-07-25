@regression
Feature: MenPage Test
  As user I want to login into luma shopping website

@senity
  Scenario: user Should Add Product SuccessFully ToShoppingCart
    Given I am on Men shopping page
    When  I Mouse Hover To MenMenu
    And   I Mouse Hover on Bottoms
    And   I Click on Pants
    And   I Mouse Hover on product name Cronus Yoga Pant and click on size thirty two.
    And   I Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    And   I Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    And   I Verify the text "You added Cronus Yoga Pant to your shopping cart."
    And   I Click on ‘shopping cart’ Link into message
    And   I  Verify the text is "Shopping Cart"
    And   I  Verify the product name is "Cronus Yoga Pant"
    And   I Verify the product size "32"
    Then  I Verify the product colour "Black"


