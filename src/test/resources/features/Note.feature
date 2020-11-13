Feature:
  As a user I should be able to create a new note


  @addNote
  Scenario:
  Add new note

    Given user in the login page
    When user logs in as a "posmanager"
    Then user should be see home page
    And user navigates to "Notes"
    And user clicks on "Create" button
    When user create note information

      | tags        | Salo        |
      | Description | I like salo |

    And user clicks on "Save" button



