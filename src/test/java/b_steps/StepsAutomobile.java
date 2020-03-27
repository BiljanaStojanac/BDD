package b_steps;

import _base.CreateDriverInstance;
import a_pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class StepsAutomobile {

    VehicleData pageVehicle;
    InsurantData pageInsurant;
    ProductData pageProduct;
    MainMenu pageMain;
    SendQuote pageSendQuote;

    WebDriver driver;

    CreateDriverInstance driverInstance;




    //String dateInput;
    //  System.out.println(date.format(formatter));

    //-----------------------------------------------------------Steps for EnterVehicleData----------------------------------------------------------------------------------------
    @Given("Navigate to EnterVehicleData Page")
    public void navigate_to_EnterVehicleData_Page() throws Exception {
        driverInstance = new CreateDriverInstance();
        driver = driverInstance.generateDriverInstance();
        pageVehicle = new VehicleData(driver);
        pageInsurant = new InsurantData(driver);
        pageMain = new MainMenu(driver);
        pageMain.goToAutomobile();
    }

    @When("User enter {string} data")
    public void userEnterData(String make) throws IOException {
        pageVehicle.MakeSelectAudi(make);
    }

    @When("User enter Engine Performance {string} data")
    public void userEnterEnginePerformanceData(String engine) throws IOException {
        pageVehicle.EnginePerformance(engine);
    }

    @When("User enter DateofManufacture {string} data")
    public void userEnterDateofManufactureData(String dateManufacture) throws IOException {
        pageVehicle.DateOfManufacture(dateManufacture);
    }

    @When("User enter NumberOfSeats {string} data")
    public void userEnterNumberOfSeatsData(String seats) throws IOException {
        pageVehicle.NumberOfSeats(seats);
    }

    @When("User enter FuelType {string} data")
    public void userEnterFuelTypeData(String fuelType) throws IOException {
        pageVehicle.FuelType(fuelType);
    }

    @When("User enter ListPrice {string} data")
    public void userEnterListPriceData(String listPrice) throws IOException {
        pageVehicle.ListPrice(listPrice);
    }

    @When("User enter AnnualMileage {string} data")
    public void userEnterAnnualMileageData(String annualMileage) throws IOException {
        pageVehicle.AnnualMileage(annualMileage);
    }

    @When("NextPage")
    public void nextpage() {
        pageVehicle.NextToInsuranceData();
    }


    @And("User enter following for vehicle data tab")
    public void user_enter_following_for_vehicle_data_tab(io.cucumber.datatable.DataTable dataTable) throws IOException {
        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        pageVehicle.MakeSelectAudi(list.get(0).get("Make"));
        pageVehicle.EnginePerformance(list.get(0).get("Engine"));
        pageVehicle.DateOfManufacture(list.get(0).get("Date"));
        pageVehicle.NumberOfSeats(list.get(0).get("Seats"));
        pageVehicle.FuelType(list.get(0).get("Fuel"));
        pageVehicle.ListPrice(list.get(0).get("List"));
        pageVehicle.AnnualMileage(list.get(0).get("Mileage"));

    }
    //---------------------------------------------------------------Steps for Enter Insurant Data--------------------------------------------------------------------------------------------------------------
    @Given("Navigate to EnterInsurantData Page")
    public void navigateToEnterInsurantDataPage() {

        driverInstance = new CreateDriverInstance();
        driver = driverInstance.generateDriverInstance();
        pageInsurant = new InsurantData(driver);
        pageMain = new MainMenu(driver);
        pageMain.goToAutomobile();
        pageInsurant.enterIsurantDataTab();

    }

    @And("User enter following for insurant data tab")
    public void user_enter_following_for_insurant_data_tab(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        pageInsurant.firstName(list.get(0).get("FirstName"));
        pageInsurant.lastName(list.get(0).get("LastName"));
        pageInsurant.dateOfBird(list.get(0).get("Birth"));
        pageInsurant.country(list.get(0).get("Country"));
        pageInsurant.zipCode(list.get(0).get("Zip"));
        pageInsurant.occupation(list.get(0).get("Occupation"));

    }


    @When("User enter First name {string} data")
    public void userEnterFirstNameData(String firstName) {

        pageInsurant.firstName(firstName);
    }



    @When("User enter Last name {string} data")
    public void userEnterLastNameData(String lastName) {
        pageInsurant.lastName(lastName);
    }

    @When("User enter Date of birth {string} data")
    public void userEnterDateOfBirthData(String date) {
        pageInsurant.dateOfBird(date);
    }

    @When("User enter country {string} data")
    public void userEnterCountryData(String country) {
        pageInsurant.country(country);
    }

    @When("User enter Zip code {string} data")
    public void userEnterZipCodeData(String code) {
        pageInsurant.zipCode(code);
    }

    @When("User enter {string} data for occupation")
    public void userEnterDataForOccupation(String occupation) {
        pageInsurant.occupation(occupation);
    }

    @When("User enter Hobbies data")
    public void userEnterHobbiesData() {
        pageInsurant.hobbies();
    }


    @Then("go to next page")
    public void goToNextPage() {
        pageInsurant.next();
    }

//--------------------------------------------------------------Steps product data-------------------------------------------------------------------------------------------------




   @And("User enter following data for product data tab")
    public void user_enter_following_data_for_product_data_tab(io.cucumber.datatable.DataTable dataTable) throws IOException {

        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
       pageProduct.insuranceSum(list.get(0).get("InsuranceSum"));
       pageProduct.meritRating(list.get(0).get("MeritRating"));
       pageProduct.damageInsurance(list.get(0).get("DamagteInsurance"));
       pageProduct.courtesyCar(list.get(0).get("CourtesyCar"));


    }
    @When("User enter StartTime data")
    public void user_enter_StartTime_data() throws IOException {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        pageProduct = new ProductData(driver);
        LocalDate returnvalue = date.plusMonths(5);
        String dateInput = returnvalue.format(formatter);
        pageProduct.startData(dateInput);
    }

    @And("User enter Optional products data")
    public void user_enter_Optional_products_data() {
        pageProduct.optionalProducts();
    }

    @When("go Select price option page")
    public void go_Select_price_option_page() {
        pageProduct.next();

    }
//-------------------------------------------------Select price option----------------------------------------------------------------
    @And("select option")
    public void selectOption() {
        pageProduct.selectOption();
    }

    @Then("go to Select quote")
    public void goToSelectQuote() {
        pageProduct.nextToSendQuote();
    }


//-------------------------------------------------Send Quote---------------------------------------------------------------------------
     @And("User enter following data for Send quote")
     public void user_enter_following_data_for_Send_quote(io.cucumber.datatable.DataTable dataTable) throws IOException {
        pageSendQuote = new SendQuote(driver);
     List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
         pageSendQuote.email(list.get(0).get("E-Mail"));
         pageSendQuote.userName(list.get(0).get("Username"));
         pageSendQuote.password(list.get(0).get("Password"));
         pageSendQuote.confimPassword(list.get(0).get("Confirm Password"));

}

    @Then("User enter Send button")
    public void userEnterSendButton() {
        pageSendQuote.send();
    }


//SCENARIO OUTLINE
/*

    @When(value = "^User enter \"([^\"]*)\" data$")
    public void userEnterMakeData(String make) throws IOException {
        pageVehicle.MakeSelectAudi(make);
    }

    @When(value = "^User enter Engine Performance \"([^\"]*)\" data")
    public void userEnterEnginePerformanceEngineData(String engine) throws IOException {
        pageVehicle.EnginePerformance(engine);
    }

    @When("^User enter DateofManufacture \"([^\"]*)\" data")
    public void userEnterDateofManufactureDateManufactureData(String dateManufacture) throws IOException {
        pageVehicle.DateOfManufacture(dateManufacture);
    }

    @When("^User enter NumberOfSeats \"([^\"]*)\" data")
    public void userEnterNumberOfSeatsSeatsData(String seats) throws IOException {
        pageVehicle.NumberOfSeats(seats);
    }

    @When("^User enter FuelType \"([^\"]*)\" data")
    public void userEnterFuelTypeFuelTypeData(String fuelType) throws IOException {
        pageVehicle.FuelType(fuelType);
    }

    @When("^User enter ListPrice \"([^\"]*)\" data")
    public void userEnterListPriceListPriceData(String listPrice) throws IOException {
        pageVehicle.ListPrice(listPrice);
    }

    @When("^User enter AnnualMileage \"([^\"]*)\" data")
    public void userEnterAnnualMileageAnnualMileageData(String annualMileage) throws IOException {
        pageVehicle.AnnualMileage(annualMileage);
    }

    @Then("NextPage")
    public void nextpage() {

        pageVehicle.NextToInsuranceData();
    }
*/







    /*   @Then("Close browser")
    public void close_browser() throws IOException {
   // driverInstance.CloseDriverInstance();
        page.Next();
    }*/

}

