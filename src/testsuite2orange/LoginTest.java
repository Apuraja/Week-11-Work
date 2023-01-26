package testsuite2orange;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //enter Username in  field
        WebElement UsernameField = driver.findElement(By.name("username"));
        UsernameField.sendKeys("Admin");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        loginButton.click();

        //* Verify the ‘Welcome’ text is display
        WebElement Dashboard = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']"));
        String actualText=Dashboard.getText();
        String expectedText="dashboard";
        Assert.assertEquals(expectedText,actualText);
    }
    }
