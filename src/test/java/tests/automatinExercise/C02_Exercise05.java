package tests.automatinExercise;

import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_Exercise05 {
    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExcerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        assert automationExcercisePage.logo.isDisplayed();

        //4. Click on 'Signup / Login' button
        automationExcercisePage.signUp.click();

        //5. Verify 'New User Signup!' is visible
        assert automationExcercisePage.newUserSignUp.isDisplayed();

        //6. Enter name and already registered email address
        automationExcercisePage.signUpName.sendKeys(ConfigReader.getProperty("autoExerName"));
        automationExcercisePage.signUpEmail.sendKeys(ConfigReader.getProperty("autoExerMail"));

        //7. Click 'Signup' button
        automationExcercisePage.signUpButton.click();

        //8. Verify error 'Email Address already exist!' is visible
        assert automationExcercisePage.emailAddressalreadyExist.isDisplayed();

        //Sayfayi kapatalim
        Driver.closeDriver();
    }
}
