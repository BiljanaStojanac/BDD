package a_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ResourceBundle;


public class VehicleData {
     ResourceBundle element;
    WebDriver driver;
    public VehicleData(WebDriver driver)
    {
        this.driver = driver;
        element = ResourceBundle.getBundle("Element");

    }




    //-----MAKE FIELD-----
    public void MakeSelectAudi(String CarMakeData) throws IOException
    {
        Select make = new Select(driver.findElement(By.id(element.getString("txtMake_Id"))));
        make.selectByValue(CarMakeData);
    }


    //-----ENGINE PERFORMANCE FIELD-----

    public void EnginePerformance( String ValueOfEnginePerformanceData) throws IOException
    {
        driver.findElement(By.id(element.getString("txtEnginePerformance[kw]_id"))).sendKeys(ValueOfEnginePerformanceData);
    }

    //-----DATE OF MANUFACTURE FIELD-----
    //Date in past
    public void DateOfManufacture( String date) throws IOException
    {
        driver.findElement(By.id(element.getString("calendarDateofManufacture_id"))).sendKeys(date);
    }


    //-----NUMBER OF SEATS FIELD----
    public void NumberOfSeats( String NumberOfSeatsData) throws IOException
    {
        Select numbrOfSeats = new Select(driver.findElement(By.id(element.getString("ddlNumberOfSeats_Id"))));
        numbrOfSeats.selectByValue(NumberOfSeatsData);
    }


    //-----FUEL TYPE FIELD----
    public void FuelType(String FuelTypeData) throws IOException
    {
        Select flueType = new Select(driver.findElement(By.id(element.getString("ddlFuelType_Id"))));
        flueType.selectByValue(FuelTypeData);
    }





    //-----LIST PRICE FIELD----

    public void ListPrice( String price) throws IOException
    {
        driver.findElement(By.id(element.getString("txtListPrice[$]_Id"))).sendKeys(price);
    }


    //-----LICENSE PLATE NUMBER FIELD----
    public void LicensePlateNumber()
    {

    }


    //-----ANNUAL MILEAGE FIELD----

    public void AnnualMileage( String AnnualMileage) throws IOException
    {
        driver.findElement(By.id(element.getString("txtAnnualMileage_Id"))).sendKeys(AnnualMileage);
    }
    public void NextToInsuranceData()
    {
        driver.findElement(By.id(element.getString("btnNext_id"))).click();
    }
  public  void HomePage() throws IOException
  {
      driver.findElement(By.id(element.getString("homePage_id"))).click();
  }



}
