Feature: In-App Purchases
Purchase a product on Instagram using In-App Purchases

Scenario: Payment Successful
User should get a confirmation of product purchase along with the tracking details

Given I have chosen to purchase a product
When I purchase the product using a valid payment method
Then I should receive a confirmation message
And I should receive the transaction details and tracking details
