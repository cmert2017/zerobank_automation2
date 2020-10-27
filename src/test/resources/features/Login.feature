Feature: As a user, i want to login so that i can see Account summary page

  Background: common steps
    Given user is on the login page

  @login_1
  Scenario: Login with valid credentials
   When user enters valid credentials
   Then system should display "Account Summary" page


  Scenario: Login with invalid credentials
    When user enters not valid credentials
         |username |123         |
         |user     |password    |

    Then system should display the message Login and-or password are wrong.
    And  user should see the error header message Troubles entering the site?



#  ||password|
# |user||
#         |user|   |
#         |user|null|
