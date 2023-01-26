package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest{
    String baseurl = "https://demo.nopcommerce.com/"; // Storing base URL
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
public void userShouldNavigateToRegisterPageSuccessfully (){
     // click on the Register link
        WebElement ResgisterLink=driver.findElement(By.xpath("//ul/li[1]/a[contains(text(),'Register')]"));
        ResgisterLink.click();
        //  Verify the text ‘Register’
        WebElement RegisterLink = driver.findElement(By.xpath("//div/h1"));
        }
@Test
public void userSholdRegisterAccountSuccessfully(){
    // click on the Register link
    WebElement ResgisterLink=driver.findElement(By.xpath("//ul/li[1]/a[contains(text(),'Register')]"));
    ResgisterLink.click();
    //* Select gender radio button
    WebElement Genderradiobutton = driver.findElement(By.id("gender-female"));
    Genderradiobutton.click();
    //* Enter First name
    WebElement Enterfirstname = driver.findElement(By.xpath("//input[@name='FirstName']"));
    Enterfirstname.sendKeys("Arpita");
    //* Enter Last name
    WebElement Lastname = driver.findElement(By.xpath(" //input[@id='LastName']"));
    Lastname.sendKeys("Patel");
    //* Select Day Month and Year
    WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
    Select Date = new Select(Day);
    Date.selectByIndex(6);
    WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
    Select A = new Select(Month);
    A.selectByIndex(4);
    WebElement Year= driver.findElement(By.name("DateOfBirthYear"));
    Select D = new Select(Year);
    D.selectByIndex(78);
    //enter email id in to email field
    WebElement emailIdField = driver.findElement(By.id("Email"));//input[@class='email']
   // WebElement emailIdField = driver.findElement(By.xpath("//input[@class='email']"));
    emailIdField.sendKeys("Apupatel1987@yahoo.com");
    //enter password into password field
    WebElement passwordField = driver.findElement(By.name("Password"));
    passwordField.sendKeys("Admin1234");
    WebElement Confirmpasswordfield = driver.findElement(By.id("ConfirmPassword"));
    Confirmpasswordfield.sendKeys("Admin1234");
    //* Verify the text 'Your registration completed
    WebElement Completed = driver.findElement(By.id("register-button"));
    Completed.click();
    WebElement Continue = driver.findElement(By.xpath("//a[text()='Continue']"));
    Continue.click();
    }}