@regression
Feature: WomenPage Test
  As user I want to login into luma shopping website


  Scenario: user Should Add Product SuccessFully ToShoppingCart
    Given I am on women shopping page
    When  I mouse Hover on Women Menu
    And   I mouse Hover on Tops
    And   I click on Jackets
    Then  I storing jackets names in list,filter Product Name, Ascending Order,display in alphabetical order



  Scenario: verify The Sort By Price Filter
    Given I am on women shopping page
    When  I mouse Hover on Women Menu
    And   I mouse Hover on Tops
    And   I click on Jackets
    Then  I storing jackets price in list,Sort By filter Price,list after,before to Ascending Order,price display in Low to High


#  Scenario: verify The Sort By Price Filter
#    Given I am on women shopping page
#    When  I mouse Hover on Women Menu
#    And   I mouse Hover on Tops
#    And   I click on Jackets
#    And   I storing jackets price in list,
#    And   I select Sort By filter “Price”
#    And   I after Sorting Products by Price
#    And   I storing jackets price in list after
#    And   I sort the jacketPriceListBefore to Ascending Order
#    Then  I Verify the products price display in Low to High





