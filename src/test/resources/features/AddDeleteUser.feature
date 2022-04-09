Feature: User addition deletion and verification


  Background: Given user is on home Page

  Scenario Outline:  Add valid User Information and validate
    When user click on Add User link
    Then verify user is able to see Add User page
    When user enters the following <firstName> in FirstName field
    And user enters <lastName> in LastName field
    And user enters <userName> in UserName field
    And user enters <password> in Password field
    And user selects <customer> in Customer checkbox
    And user enters <email> in Email field
    And user enters <cellPhone> in CellPhone field
    And user selects <Role> in Role dropdown
    And user clicks on save button
    Then verify user <userName> information is added to the table

    Examples:
      | firstName | lastName    | userName      | password  | email               |  cellPhone     | Role   |
      | John      | Grisham     | jgrisham      | testPass1 | jgrisham@email.com  |  2341235674    | Admin  |


  Scenario Outline:  Delete a User and validate
    When  user click on Delete button for <userName> user
    Then confirmation pop up shows up
    And user clicks on ok button in the popup
    Then verify user <userName> information is deleted from the table

    Examples:
      |userName |
      |novak    |