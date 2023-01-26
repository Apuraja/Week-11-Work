package testsuite2orange;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Forgotpassword extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
 public void Fogotyourpassword(){
        WebElement forgotpasswordField = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
        forgotpasswordField.click();

    }}
