Feature: Username deletion and Validation

  Scenario Outline:  Delete a User and validate
     When  user click on Delete button for <userName> user
    Then confirmation pop up shows up
    And user clicks on ok button in the popup
    Then verify user <userName> information is deleted from the table

    Examples:
    |userName |
    |novak    |
