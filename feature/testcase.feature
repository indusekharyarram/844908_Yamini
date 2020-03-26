@Taskmanager_Feature
Feature: http://examples.codecharge.com/TaskManager/Default.php

@tc01_login
Scenario: To  check that the application i taking  the valid credentials. 

Given launch the browser
When open the application
Then enter username & password 
And click on login button

@tc02_Tasklist
Scenario: To check  that the application  Open the Tasklist in the taskmanager website
Given  Login to the application
When click on tasklist
Then Select Assined to as Alex kniel
And click on search  button

@tc03_AddTask
Scenario: To check the application add Task in examples.codecharge.com/TaskManager/Default.php
Given open the Application
When click on Administration 
When login with valid credentials
When click on add task
When enter all fields 
When select Start Date
When select End Date
Then click on Add button

@tc04_Print
Scenario: To check the applicationPrint the  task in the TaskManager website
Given Open the browser
When Access TaskManager website
Then open the task list
And print the tasks list

@tc05_Logout
Scenario: To check that the application is logout from the task manager  application

Given open the browser
When  access Taskmanager website
Then click the administration
And click the logout
 

