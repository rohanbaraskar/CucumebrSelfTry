Feature: User should buy product successfully



  Scenario: User should be able to Register successfully
    Given I open browser and goto Nopecommerce website
    And I click on register link to open register page
    And I enter register details
    When I click on register button
    Then I see successfully registered message


