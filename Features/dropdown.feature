Feature: Dropdown select
  Scenario: Open dropdown page and select option 2
    Given I lunch the browser
    When I click on DropdownLink
    And I  click on the dropdown bar
    And I Select Option_2
    Then Option_2 has  selected