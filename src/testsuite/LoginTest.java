package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
//1.User Should Login Successfully With Valid Credentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.name("username")).sendKeys("Admin");// Enter “Admin” username
        driver.findElement(By.name("password")).sendKeys("admin123");//Enter “admin123 password
        driver.findElement(By.tagName("button")).click();//Click on ‘LOGIN’ button
        //Verify the ‘Dashboard’ text is display
        String actualDisplay = driver.findElement(By.linkText("Dashboard")).getText();
        Assert.assertEquals("Dashboard",actualDisplay);
    }

    @After
    public void closeBrowser() {
    }
}
