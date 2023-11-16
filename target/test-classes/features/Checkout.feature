Feature: Place the order for product

@PlaceOrder
Scenario Outline: Search experience for product search in both home and offers page

Given User is on GreenCart Landing page
When User searched with short name <Name> and extracted actual name of product
And User added "3" items in cart 
Then User  proceeds to checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Name|
| Tom |