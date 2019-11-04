Feature: Payment
Purchase a product on the TestMeApp Website

Scenario: Payment Successfull
User should successfully purchase a product from the TestMeApp website

Given I have chosen to purchase a product on the TestMeApp website
When I click on Checkout and complete the payment process through the payment portal
Then The order should be placed on the website
And I should receive a purchase confirmation message