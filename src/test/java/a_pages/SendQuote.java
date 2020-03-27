package a_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ResourceBundle;

public class SendQuote {
    ResourceBundle element;
    WebDriver driver;

    public SendQuote(WebDriver driver)
    {
        this.driver = driver;
        element = ResourceBundle.getBundle("Element");

    }
    public void email(String mail) throws IOException
    {
        driver.findElement(By.id(element.getString("email_id"))).sendKeys(mail);
    }
    public void userName(String name) throws IOException
    {
        driver.findElement(By.id(element.getString("username_id"))).sendKeys(name);
    }
    public void password(String pass) throws IOException
    {
        driver.findElement(By.id(element.getString("password_id"))).sendKeys(pass);
    }
    public void confimPassword(String confirm) throws IOException
    {
        driver.findElement(By.id(element.getString("confirmpassword_id"))).sendKeys(confirm);
    }
    public void send()
    {
        driver.findElement(By.id(element.getString("sendemail_id"))).click();
    }
}
