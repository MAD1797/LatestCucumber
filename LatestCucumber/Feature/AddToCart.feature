Feature: Add to cart
Add a product to the cart on the TestMeApp Website

Scenario: Product added successfully
User should successfully add a product to their cart on the TestMeApp website

Given I have chosen to add a product to my cart on the TestMeApp website
When I select a product on click on Add To Cart
Then The product should be added to my cart on the TestMeApp website
And The cart item number should be incremented by one