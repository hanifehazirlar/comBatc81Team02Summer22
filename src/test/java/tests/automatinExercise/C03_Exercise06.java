package tests.automatinExercise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class C03_Exercise06 {
    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().navigate().to(ConfigReader.getProperty("automationExcerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        assert automationExcercisePage.logo.isDisplayed();
        //4. Click on 'Contact Us' button
        automationExcercisePage.contact_us.click();

        //5. Verify 'GET IN TOUCH' is visible
        assert automationExcercisePage.get_in_touch.isDisplayed();
        //6. Enter name, email, subject and message
        automationExcercisePage.contact_usName.sendKeys(ConfigReader.getProperty("autoExerName"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("autoExerMail")).sendKeys(Keys.TAB).
                sendKeys("QA").sendKeys(Keys.TAB).sendKeys("tester").perform();

        //7. Upload file
        String pathOfFile="C:\\Users\\lenovo\\Downloads\\test.txt";
        automationExcercisePage.upload_file.sendKeys(pathOfFile);

        //8. Click 'Submit' button
        automationExcercisePage.submit.click();

        //9. Click OK button
        Driver.getDriver().switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        assert automationExcercisePage.success.isDisplayed();

        //11. Click 'Home' button and verify that landed to home page successfully
        automationExcercisePage.home.click();
        assert Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("automationExcerciseUrl"));

        //sayfayi kapatiniz
        Driver.closeDriver();

    }
}
