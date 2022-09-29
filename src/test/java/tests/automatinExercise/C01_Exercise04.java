package tests.automatinExercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.Driver;

public class C01_Exercise04<AutomationExercise> {
    //    1. Launch browser
    //    2. Navigate to url 'http://automationexercise.com'
    //    3. Verify that home page is visible successfully
    //    4. Click on 'Signup / Login' button
    //    5. Verify 'Login to your account' is visible
    //    6. Enter correct email address and password
    //    7. Click 'login' button
    //    8. Verify that 'Logged in as username' is visible
    //    9. Click 'Logout' button
    //    10. Verify that user is navigated to login page


    @Test
    public void test01() {
        //    1. Launch browser
        //    2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().navigate().to("http://automationexercise.com");
        //    3. Verify that home page is visible successfully

        AutomationExcercise autoExer=new AutomationExcercise();
        assert autoExer.logo.isDisplayed();

        //    4. Click on 'Signup / Login' button
        autoExer.signUp.click();
        //    5. Verify 'Login to your account' is visible
        assert autoExer.loginToYourAccount.isDisplayed();

        //    6. Enter correct email address and password
        autoExer.emailAddress.sendKeys("hanifehz@gmail.com");
        autoExer.password.sendKeys("1234");

        //    7. Click 'login' button
        autoExer.login.click();

        //    8. Verify that 'Logged in as username' is visible
        assert autoExer.loggedInAs.isDisplayed();

        //    9. Click 'Logout' button
        autoExer.logout.click();
        //    10. Verify that user is navigated to login page
        assert autoExer.loginToYourAccount.isDisplayed();

    }
}
