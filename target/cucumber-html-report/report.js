$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/testcase.feature");
formatter.feature({
  "line": 2,
  "name": "http://examples.codecharge.com/TaskManager/Default.php",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Taskmanager_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "To  check that the application i taking  the valid credentials.",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;to--check-that-the-application-i-taking--the-valid-credentials.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "open the application",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter username \u0026 password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "a_login.launch_the_browser()"
});
formatter.result({
  "duration": 42675215320,
  "status": "passed"
});
formatter.match({
  "location": "a_login.open_the_application()"
});
formatter.result({
  "duration": 14523229624,
  "status": "passed"
});
formatter.match({
  "location": "a_login.enter_username_password()"
});
formatter.result({
  "duration": 13765965603,
  "status": "passed"
});
formatter.match({
  "location": "a_login.click_on_login_button()"
});
formatter.result({
  "duration": 10161362119,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To check  that the application  Open the Tasklist in the taskmanager website",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;to-check--that-the-application--open-the-tasklist-in-the-taskmanager-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_Tasklist"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "click on tasklist",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Select Assined to as Alex kniel",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on search  button",
  "keyword": "And "
});
formatter.match({
  "location": "b_search.login_to_the_application()"
});
formatter.result({
  "duration": 20652870685,
  "status": "passed"
});
formatter.match({
  "location": "b_search.click_on_tasklist()"
});
formatter.result({
  "duration": 1382629473,
  "status": "passed"
});
formatter.match({
  "location": "b_search.select_Assined_to_as_Alex_kniel()"
});
formatter.result({
  "duration": 72831879,
  "status": "passed"
});
formatter.match({
  "location": "b_search.click_on_search_button()"
});
formatter.result({
  "duration": 10576400318,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To check the application add Task in examples.codecharge.com/TaskManager/Default.php",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;to-check-the-application-add-task-in-examples.codecharge.com/taskmanager/default.php",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tc03_AddTask"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "open the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "click on Administration",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click on add task",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "enter all fields",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "select Start Date",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "select End Date",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "click on Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "c_addTask.open_the_Application()"
});
formatter.result({
  "duration": 12025409382,
  "status": "passed"
});
formatter.match({
  "location": "c_addTask.click_on_Administration()"
});
formatter.result({
  "duration": 2913116574,
  "status": "passed"
});
formatter.match({
  "location": "c_addTask.login_with_valid_credentials()"
});
formatter.result({
  "duration": 5109407675,
  "status": "passed"
});
formatter.match({
  "location": "c_addTask.click_on_add_task()"
});
formatter.result({
  "duration": 11526321570,
  "status": "passed"
});
formatter.match({
  "location": "c_addTask.enter_all_fields()"
});
formatter.result({
  "duration": 869109843,
  "status": "passed"
});
formatter.match({
  "location": "c_addTask.select_Start_Date()"
});
formatter.result({
  "duration": 12918500408,
  "status": "passed"
});
formatter.match({
  "location": "c_addTask.select_End_Date()"
});
formatter.result({
  "duration": 1467328266,
  "status": "passed"
});
formatter.match({
  "location": "c_addTask.click_on_Add_button()"
});
formatter.result({
  "duration": 3522648697,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "To check the applicationPrint the  task in the TaskManager website",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;to-check-the-applicationprint-the--task-in-the-taskmanager-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@tc04_Print"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Access TaskManager website",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "open the task list",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "print the tasks list",
  "keyword": "And "
});
formatter.match({
  "location": "d_Screenshot.open_the_browser()"
});
formatter.result({
  "duration": 5826073546,
  "status": "passed"
});
formatter.match({
  "location": "d_Screenshot.access_TaskManager_website()"
});
formatter.result({
  "duration": 3644446737,
  "status": "passed"
});
formatter.match({
  "location": "d_Screenshot.open_the_task_list()"
});
formatter.result({
  "duration": 620090926,
  "status": "passed"
});
formatter.match({
  "location": "d_Screenshot.print_the_tasks_list()"
});
formatter.result({
  "duration": 3880595974,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "To check that the application is logout from the task manager  application",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;to-check-that-the-application-is-logout-from-the-task-manager--application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@tc05_Logout"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "access Taskmanager website",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "click the administration",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click the logout",
  "keyword": "And "
});
formatter.match({
  "location": "e_logout.open_the_browser()"
});
formatter.result({
  "duration": 4753578831,
  "status": "passed"
});
formatter.match({
  "location": "e_logout.access_Taskmanager_website()"
});
formatter.result({
  "duration": 1905467535,
  "status": "passed"
});
formatter.match({
  "location": "e_logout.click_the_administration()"
});
formatter.result({
  "duration": 4254119473,
  "status": "passed"
});
formatter.match({
  "location": "e_logout.click_the_logout()"
});
formatter.result({
  "duration": 1990882736,
  "status": "passed"
});
});