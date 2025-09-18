Feature: Login
	In order to manage remote repositories
	As a user 
	I want to login into the github
	
	Scenario: Valid Credendial
	Given I have browser with github home page
	When User enter uesrname as "balaji-githubstore" 
	And  User enter password as "welcome@123"
	And  User click on Sign in 
	Then User should gets access to dashboard with header as "Top repository"
	
	Scenario: Invalid credential
	Given User have browser with github home page
	When User enter username as "<username>"
	And User enter password as "<password>"
	And User click on Sign in
	Then User should gets access to dashboard with error as "<Expected error>"
	Examples:
	| username | password | expected_error                 |
	| john     | john123  | Incorrect username or password |
	| peter    | peter123 | Incorrect username or password |
	