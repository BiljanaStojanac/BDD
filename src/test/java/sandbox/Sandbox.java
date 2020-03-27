package sandbox;

import a_pages.ProductData;
import a_pages.VehicleData;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Sandbox {
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
   WebDriver driver;
   ProductData page;
    ResourceBundle element;
    VehicleData pageVehicle;

    @Before
    public void Start() throws IOException
    {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bstojanac\\eclipse-workspace\\Assertion\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void test() throws IOException {
        page = new ProductData(driver);
        pageVehicle = new VehicleData(driver);
        driver.get("http://sampleapp.tricentis.com/101/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.findElement(By.id("nav_automobile")).click();
        driver.findElement(By.id("enterproductdata")).click();
        String dateInput = date.format(formatter);
        element = ResourceBundle.getBundle("Element");
       // page.startData(dateInput);

       /* if(!driver.findElement(By.xpath(("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"))).isSelected())
        {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
        }
*/



        //LocalDate date = LocalDate.now();
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

       // String sum = "3000000";
        //page.insuranceSum(sum);
        System.out.println(dateInput);
        //driver.findElement(By.id("startdate")).sendKeys(dateInput);
         driver.findElement(By.id(element.getString("startdata_id"))).sendKeys(dateInput);
    }
}
