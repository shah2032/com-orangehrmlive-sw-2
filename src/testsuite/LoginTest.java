package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find username field and enter 'Admin' to username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Find password field and enter 'admin123' to password
        driver.findElement(By.name("password")).sendKeys("admin123");
         driver.findElement(By.xpath("//button[starts-with(@class,'oxd')]")).click();
        String expectedMessage = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[starts-with(@class,'oxd')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
