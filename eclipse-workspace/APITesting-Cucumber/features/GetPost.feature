Feature: Verify different GET and POST operation using REST-assured and Cucumber

  Scenario: Add an Employee record and Verify Status code, Header and Body
    Given I set POST employee service api endpoint
    When Send a POST HTTP request
    Then I receive valid response
