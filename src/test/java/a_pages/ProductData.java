package a_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ResourceBundle;

public class ProductData {
    ResourceBundle element;
    WebDriver driver;

    public ProductData(WebDriver driver)
    {
        this.driver = driver;
        element = ResourceBundle.getBundle("Element");

    }


    public void startData(String date) throws IOException
    {
        driver.findElement(By.id(element.getString("startdata_id"))).sendKeys(date);
    }
    public void insuranceSum(String sum) throws IOException
    {
        Select insuranceSum = new Select(driver.findElement(By.id(element.getString("insurancesum_id"))));
        insuranceSum.selectByValue(sum);
    }
    public void meritRating(String rating) throws IOException
    {
        Select meritRating = new Select(driver.findElement(By.id(element.getString("meritrating_id"))));
        meritRating.selectByValue(rating);
    }
    public void damageInsurance(String insurance) throws IOException
    {
        Select damageInsurance = new Select(driver.findElement(By.id(element.getString("damageinsurance_id"))));
        damageInsurance.selectByValue(insurance);
    }
    public void optionalProducts()
    {
        if(!driver.findElement(By.xpath(("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"))).isSelected())
        {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
        }
    }


    public void courtesyCar(String courtesy) throws IOException
    {
        Select courtesyCar = new Select(driver.findElement(By.id(element.getString("courtesycar_id"))));
        courtesyCar.selectByValue(courtesy);
    }
     public void next()
     {
         driver.findElement(By.className(element.getString("nextselectpriceoption_id"))).click();
     }
    public void prev()
    {
        driver.findElement(By.className(element.getString("preventerinsurancedata_id"))).click();
    }

}
