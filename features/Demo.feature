Feature: Verify the create, update and retrieve for Dummy endPoints.

  @Test200
  Scenario Outline: Verify 200 response status code positive scenario
    Given I send "<httpMethod>" request to Dummy endPoints for positive status codes with base path as "<basePath>",queryParameters as "<queryParameters>" and "<requestPayLoad>"
    Then Verify the response status code with expected status code "<responseStatusCode>"

    Examples:

      | httpMethod | basePath       | queryParameters              | requestPayLoad | responseStatusCode |
      | GET        | /employee      | noofRecords=10&idStarts=1001 |                | 200                |
      | POST       | /api/v1/create |                              |                | 201                |

  @Test404
  Scenario Outline: Verify 404 response status code negative scenario
    Given I send "<httpMethod>" request to Dummy endPoints for 404 status code with base path as "<basePath>",queryParameters as "<queryParameters>" and "<requestPayLoad>"
    Then Verify the response status code with expected status code "<responseStatusCode>"

    Examples:

      | httpMethod | basePath       | queryParameters              | requestPayLoad | responseStatusCode |
      | GET        | /employee      | noofRecords=10&idStarts=1001 |                | 404                |
      | POST       | /api/v1/create |                              |                | 404                |