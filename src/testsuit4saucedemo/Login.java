package testsuit4saucedemo;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Login extends BaseTest {
    String baseurl = "https://www.saucedemo.com/";
    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }
    @Test
    public void login() {
        // userSholdLoginSuccessfullyWithValidCredentials
        WebElement UsernameField = driver.findElement(By.name("user-name"));
        UsernameField.sendKeys("standard_user");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        //click on login button
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();

        //Verify the text “PRODUCTS”
         WebElement CompTitle = driver.findElement(By.xpath("//span[@class='title']"));
         String actualText=CompTitle.getText();
         String expectedText="PRODUCTS";
         Assert.assertEquals(expectedText,actualText);

         List<WebElement> product= driver.findElements(By.className("inventory_item_name"));
         System.out.println(product.size());

    }}
