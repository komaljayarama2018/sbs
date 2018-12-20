Feature: Login works as expected

@QA
Scenario Outline:Sign-in with invalid username

Given the app is launched 
When username "<username>" and password "<password>" is entered
Then the user is not logged in

Examples:
 |username |   password     |
 |user@gmail.com   | password1 |
 
Scenario Outline:Sign-in with valid user

Given the user is on the login page
When username "<username>" and password "<password>" is entered
Then the user is logged in 

Examples:
 |username |   password     |
 |komalj.sbs@gmail.com  | test12345 |
 
 #Login using FB
 #Login using google
 #Create Account 