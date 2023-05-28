@Login
Feature: Login
  As a Registered User of the application
  I want to validate the Login functionality
  In order to check if it works as desired

  Background: A Registered User navigates to Login page
    Given I am a registered user
      And I navigate to the "sign-in" page

  @SuccessfulLogin
  Scenario Outline: Successful login using valid credentials
    When I fill in "sign-in__email" with "<username>"
    And I fill in "sign-in__password" with "<password>"
    And I click on the Sign In button
    Then I should be successfully logged in
    And I should land on the Home page
    And I should see "Dashboard" and Sign out links
    Examples:
      | username			|	password	|
      |	beasumy+q@gmail.com			|	82Gerko!	|

  @failedLogin
  Scenario Outline: Failed login using wrong credentials
    When I fill in "sign-in__email" with "<username>"
    And I fill in "sign-in__password" with "<password>"
    And I click on the Sign In button
    And I should see message as "<alert>"
    Examples:
      | username    | password   | alert                               	 |
      | beasumy+q@gmail.com	       | 82Gerko1!			 	 | Sign in failed! |
      | bEasumy+q@gmail.com	       | 82Gerko!        | Sign in failed! |
      | beasumy+q@gmail.com	        | 82Geerko!        | Sign in failed! |
      | beaasumy+q@gmail.com	        | 82Gerko!        | Sign in failed! |

  @DisabledLogin
  Scenario Outline: Disabled Login when one of the required fields is left blank
    When I fill in "sign-in__email" with "<username>"
    And I fill in "sign-in__password" with "<password>"
    And I click on the Sign In button
    Then I should see "<form error>" message for input field on Log In page
    And I should see Sign In buttton disbaled
    And I should not be able to submit the "Login" form
    Examples:
      | username    | password   | form error |
      | 		        | Asdf@1234	 | Enter a valid email	|
      | araj@gmail.com       | 		       | Enter a password|