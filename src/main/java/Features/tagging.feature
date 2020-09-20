Feature: AFree CRM Application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact

@SmokeTest 
Scenario: Create a deal
Given This is a deal

@Regression
Scenario: Create a case
Given This is a case

@SmokeTest @RegressionTest
Scenario: Create a task
Given This is a task

 @RegressionTest
Scenario: Search a deal
Given This is Search deal 

@SmokeTest
Scenario: Search a contact
Given This is Search contact

@RegressionTest
Scenario: Search a case
Given This is Search case

@End
Scenario: Search a task
Given This is Search task

@SmokeTest @RegressionTest
Scenario: Search a call
Given This is Search call

@RegressionTest
Scenario: Search a email test
Given This is Search email 

@SmokeTest
Scenario: Search a docs
Given This is Search docs

@SmokeTest @RegressionTest @End
Scenario: Search a form
Given This is Search form

@End
Scenario: validate a report
Given This is validate report

@End
Scenario: Application Logout
Given This is Logout        



