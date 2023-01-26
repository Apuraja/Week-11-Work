package testsuit3herokuapp;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logintest extends BaseTest {
    String baseurl = "http://the-internet.herokuapp.com/login";
    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }
    @Test
    public void login() {
        // userSholdLoginSuccessfullyWithValidCredentials
        WebElement UsernameField = driver.findElement(By.name("username"));
        UsernameField.sendKeys("tomsmith");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='radius']"));
        loginButton.click();

        //* Verify the text “Secure Area”
        WebElement CompTitle = driver.findElement(By.xpath("//h2"));
        String actualText=CompTitle.getText();
        String expectedText="Secure Area";
        Assert.assertEquals(expectedText,actualText);
    }
// verifyTheUsernameErrorMessage
    @Test
    public void Errormessage(){
        // userSholdLoginSuccessfullyWithinValidCredentials
        WebElement UsernameField = driver.findElement(By.name("username"));
        UsernameField.sendKeys("tomsmith");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPasswo");

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='radius']"));
        loginButton.click();

        //Verify the error message “Your password is invalid!”
        WebElement verifyErrorMsg = driver.findElement(By.xpath("//div[@class='flash error']"));
        String actualText = verifyErrorMsg.getText().substring(0, 25);
        String expectedText = "Your password is invalid!";
        Assert.assertEquals(expectedText, actualText);

    }
@Test
    public void InvalidUsername(){
    // userSholdLoginSuccessfullyWithinValidCredentials
    WebElement UsernameField = driver.findElement(By.name("username"));
    UsernameField.sendKeys("tomsmith4");

    //enter password into password field
    WebElement passwordField = driver.findElement(By.name("password"));
    passwordField.sendKeys("SuperSecretPassword!");

    //click on login button
    WebElement login = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
    login.click();

    //Verify the error message “Your Username is invalid!”
    WebElement verifyErrorMsg = driver.findElement(By.xpath("//div[@class='flash error']"));
    String actualText = verifyErrorMsg.getText().substring(0, 25);
    String expectedText = "Your username is invalid!";
    Assert.assertEquals(expectedText, actualText);


}

}
