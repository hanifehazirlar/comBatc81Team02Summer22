package tests.automatinExercise;

import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_Exercise07 {
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Test Cases' button
    //5. Verify user is navigated to test cases page successfully
    @Test
    public void test01() {
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExcerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        assert automationExcercisePage.logo.isDisplayed();

        //4. Click on 'Test Cases' button
        automationExcercisePage.testCases.click();
        //5. Verify user is navigated to test cases page successfully
        assert automationExcercisePage.testCasesText.isDisplayed();

    }
}
