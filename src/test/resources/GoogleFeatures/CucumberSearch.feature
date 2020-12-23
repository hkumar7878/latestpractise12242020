Feature: Searching on google

  Scenario Outline: Direct search on google firefox
    Given launch browser "<Browser>"
    When user navigates to "http://google.com"
    And User search "cucumber"

    @Smoke
    Examples: 
      | Browser |
      | firefox |
      | chrome  |
