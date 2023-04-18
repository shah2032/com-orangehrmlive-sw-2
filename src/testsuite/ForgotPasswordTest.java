package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgottenPassword(){
        // Find forgotten password link and click on forgotten link
        driver.findElement(By.xpath("//p[contains(@class,'forgot')]")).click();
        String expectedMessage = "Reset Password";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h6[contains(@class,'oxd')]"));
        String actualMessage = actualTextMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
