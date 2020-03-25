package _base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class CreateDriverInstance {
    WebDriver driver;
    ResourceBundle config;
    public WebDriver generateDriverInstance()
    {


        config = ResourceBundle.getBundle("config");
        if(config.getString("browser").equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bstojanac\\eclipse-workspace\\Assertion\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(config.getString("browser").equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\bstojanac\\eclipse-workspace\\Assertion\\Driver\\geckodriver.exe");

            driver = new FirefoxDriver();


        }
        else if(config.getString("browser").equalsIgnoreCase("internet explorer"))
        {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\bstojanac\\eclipse-workspace\\Assertion\\Driver\\IEDriverServer.exe");

            driver = new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        }
        else
        {
            System.out.println("Problem with browser");
        }

        driver.get(config.getString("applicationURL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;


        return  driver;
    }

    public void CloseDriverInstance()
    {
        driver.quit();
    }
}
