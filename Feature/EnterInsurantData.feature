@second
Feature: Enter insurant data

  Scenario: Enter valid data for Insurance tab
    Given Navigate to EnterInsurantData Page
    When User enter First name "TestName" data
    When User enter Last name "TestLastName" data
    When User enter Date of birth "01/18/1987" data
    When User enter country "Serbia" data
    When User enter Zip code "21000" data
    When User enter "Employee" data for occupation
    When User enter Hobbies data
    Then go to next page
