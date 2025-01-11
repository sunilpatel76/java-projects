Feature: Swag Labs login screen

  @default
  Scenario: login  with standard user
    Given user invoke 'chrome' browser with url 'https://www.saucedemo.com'
    Then  application should display login screen

    When  user input user name 'standard_user' and password 'secret_sauce'
    And   click login button
    Then  application should display 'Product' page