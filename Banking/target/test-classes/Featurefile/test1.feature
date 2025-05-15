Feature: Validating all the features of the application

  Background: 
    Given user opens the URL of the application
    And user enters the <"username"> in the username field
    And user enters the <"password"> in the password field
    When user clicks on the submit button

  @test1
  Scenario Outline: validate login for application using correct userid and password
    Then user will navigate to the homepage of the application

    Examples: 
      | username | password |
      | pooja    | test@123 |

  #  | abcd     | test@1213   |
  #  | xyz      | test@usafhu |
  @test2
  Scenario Outline: validate login for application using correct userid and password
    And user clicks on My Payment page of application
    Then user will be navigated to payment page of the application
 

    Examples: 
      | username | password |
      | pooja    | test@123 |
    # | abcd     | test@1213   |
    # | xyz      | test@usafhu |
