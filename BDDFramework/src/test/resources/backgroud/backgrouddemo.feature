Feature: This is a background demo

Background: User is logged in to saucedemo app
Given User is accessing saucedemo login page
When User enters valid username and password
Then User should be able to navigate to Home Page

Scenario: Test Menu Items
And clicks on breadcrum icon
Then User should be able to see the menu items

Scenario: Verify add to cart functionality
And clicks on Add to button
Then Item should be added to the cart
