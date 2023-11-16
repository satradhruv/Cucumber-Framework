Feature: Search and Place the order for products

@OffersPage
Scenario Outline: Search experience for product search in both home and offers page

Given User is on GreenCart Landing page
When User searched with short name <Name> and extracted actual name of product
Then User searched for <Name> same shortname in offers page
And validate product name in offers page matches with Landing page

Examples:
| Name |
| Tom |
| Beet |