package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void test1Computer(){
        WebElement Computer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        Computer.click();
        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualtext = CompTitle.getText();
        String expectedtext = "Computer";
        Assert.assertEquals(expectedtext,actualtext);
}
@Test
public void test2Electronics(){
    WebElement Electronics = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics '] "));
    Electronics.click();
    WebElement Eletitle = driver.findElement(By.className("page-title"));
    String actualtext = Eletitle.getText();
    String expectedtext = "Electronics";
    Assert.assertEquals(expectedtext,actualtext);
}
@Test
    public void test3Apparel(){
    WebElement Apparel= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
    Apparel.click();
    WebElement Appatitle = driver.findElement(By.className("page-title"));
    String actualtext = Appatitle.getText();
    String expectedtext = "Apparel";
    Assert.assertEquals(expectedtext,actualtext);
}
@Test
    public void test4Digitaldownloads(){
    WebElement Digital= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads  ']"));
    Digital.click();
    WebElement Digitaltitle = driver.findElement(By.className("page-title"));
    String actualtext = Digital.getText();
    String expectedtext = "Digital downloads";
    Assert.assertEquals(expectedtext,actualtext);
}
@Test
    public void test5Books(){
    WebElement Books= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
    Books.click();
    WebElement Booktitle = driver.findElement(By.className("page-title"));
    String actualtext = Booktitle.getText();
    String expectedtext = "Books";
    Assert.assertEquals(expectedtext,actualtext);

}
}

