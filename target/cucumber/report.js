$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Automobile.feature");
formatter.feature({
  "name": "Enter vehicle data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Enter validate data in table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Table"
    }
  ]
});
formatter.step({
  "name": "Navigate to EnterVehicleData Page",
  "keyword": "Given "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.navigate_to_EnterVehicleData_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter following for vehicle data tab",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.user_enter_following_for_vehicle_data_tab(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "NextPage",
  "keyword": "When "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.nextpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter following for insurant data tab",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.user_enter_following_for_insurant_data_tab(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Hobbies data",
  "keyword": "And "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.userEnterHobbiesData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to next page",
  "keyword": "When "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.goToNextPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter StartTime data",
  "keyword": "When "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.user_enter_StartTime_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter following data for product data tab",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.user_enter_following_data_for_product_data_tab(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Optional products data",
  "keyword": "And "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.user_enter_Optional_products_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go Select price option page",
  "keyword": "Then "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.go_Select_price_option_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select option",
  "keyword": "And "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.selectOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to Select quote",
  "keyword": "Then "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.goToSelectQuote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter following data for Send quote",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.user_enter_following_data_for_Send_quote(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Send button",
  "keyword": "Then "
});
formatter.match({
  "location": "b_steps.StepsAutomobile.userEnterSendButton()"
});
formatter.result({
  "status": "passed"
});
});