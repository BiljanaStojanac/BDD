package a_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ResourceBundle;

public class InsurantData {


   ResourceBundle element;
   WebDriver driver;

   public InsurantData(WebDriver driver)
    {
        this.driver = driver;
        element = ResourceBundle.getBundle("Element");

    }
    public void enterIsurantDataTab()
    {
        driver.findElement(By.id(element.getString("InsurantDataTab_id"))).click();
    }
    public void firstName(String firstName)
    {
        driver.findElement(By.id(element.getString("firstName_id"))).sendKeys(firstName);
    }
    public void lastName(String lastName)
    {
        driver.findElement(By.id(element.getString("lastName_id"))).sendKeys(lastName);

    }
    public void dateOfBird(String dateOfBird)
    {
        driver.findElement(By.id(element.getString("dateOfBird_id"))).sendKeys(dateOfBird);
    }
    public void country(String countryValue)
    {
        Select country= new Select(driver.findElement(By.id(element.getString("ddlCountry_id"))));
        country.selectByValue(countryValue);
    }
    public  void zipCode(String code)
    {
        driver.findElement(By.id(element.getString("zipCode_id"))).sendKeys(code);
    }
    public  void occupation(String occupationValue)
    {
        Select occupation = new Select(driver.findElement(By.id(element.getString("ddlOccurapion_id"))));
        occupation.selectByValue(occupationValue);
    }


    public void hobbies()
    {
        if(!driver.findElement(By.id(element.getString("hobbiesSpeeding_id"))).isSelected())
        {
            driver.findElement(By.className(element.getString("hobbiesSpeeding_class"))).click();
         }
    }
    public void next()
    {
        driver.findElement(By.id(element.getString("btnNext_EnterInsurantData_id"))).click();

    }
    public void prev()
    {
        driver.findElement(By.id(element.getString("btnPrev_id"))).click();
    }





}
