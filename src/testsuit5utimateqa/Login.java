package testsuit5utimateqa;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseTest {
    String baseurl = "https://courses.ultimateqa.com/";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void login() {
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();

        WebElement welcome = driver.findElement(By.xpath("//h2[@class='page__heading']"));
        String actualText = welcome.getText();
        String expectedText = "Welcome Back!";
        Assert.assertEquals(expectedText,actualText);
        System.out.println("Welcome Back!");
    }
    @Test
    public void verifyTheErrorMessage(){

        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();

        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("abc@gmil.com");

        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("123123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement invalid = driver.findElement(By.xpath("//li[@class='form-error__list-item']"));
        String actualText = invalid.getText();
        String expectedText ="Invalid email or password.";
        Assert.assertEquals(expectedText,actualText);
    }
}