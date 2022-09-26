@Test
Feature: Test a form in a web page

    Scenario: I enter many inputs in the form
        Given   I go to the form page with its url
        And I complete the inputs in the form
        Then Validate form

