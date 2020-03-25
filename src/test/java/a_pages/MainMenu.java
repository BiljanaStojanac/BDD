package a_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ResourceBundle;

public class MainMenu {
    ResourceBundle element;
    WebDriver driver;
    public MainMenu(WebDriver driver)
    {
        this.driver = driver;
        element = ResourceBundle.getBundle("Element");

    }
    public void goToAutomobile()
    {
        driver.findElement(By.id(element.getString("menu_Automobile_id"))).click();

    }
    public void goToTruck()
    {
        driver.findElement(By.id(element.getString("menu_Truck_id"))).click();
    }
    public void goToMotorcycle()
    {
        driver.findElement(By.id(element.getString("menu_Motorcycle_id = nav_motorcycle\n"))).click();
    }
    public void goToCamper()
    {
        driver.findElement(By.id(element.getString("menu_Camper_id"))).click();
    }
}
