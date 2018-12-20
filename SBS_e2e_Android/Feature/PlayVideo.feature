Feature: Video plays as expected

@QA
Scenario Outline: A user not logged in is prompted to sign-in 

When the user plays a video from the featured screen 
Then the user is prompted to login

Examples:
|username |   password     |
|user@gmail.com   | password1 |