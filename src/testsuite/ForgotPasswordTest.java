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
 * 2. ForgotPasswordTest
 */
public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
//1. User Should Navigate To Forgot Password Page Successfully
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        driver.findElement(By.className("orangehrm-login-forgot")).click();
        //Verify the text ‘Reset Password’
        String actualDisplay = driver.findElement(By.tagName("h6")).getText();
        Assert.assertEquals("Reset Password", actualDisplay);
    }


    @After
    public void closeBrowser() {
    }

}
