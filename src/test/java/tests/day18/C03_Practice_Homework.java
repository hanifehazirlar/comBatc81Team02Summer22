package tests.day18;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.SauceDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_Practice_Homework {
    @Test
    public void test01() {
        // * Navigate to  https://www.saucedemo.com/
         Driver.getDriver().navigate().to(ConfigReader.getProperty("saucedemoUrl"));
        //  * Enter the username  as standard_user
        SauceDemoPage sauceDemoPage=new SauceDemoPage();
        sauceDemoPage.username.sendKeys(ConfigReader.getProperty("saucedemoUsername"));
        //  * Enter the password as   secret_sauce
        sauceDemoPage.password.sendKeys(ConfigReader.getProperty("saucedemoPassword"));
        //  * Click on login button
        sauceDemoPage.loginButton.click();
        //  * Choose price low to high
        Select select=new Select(sauceDemoPage.dropDown);
        select.selectByVisibleText("Price (low to high)");

        //    and verify that PRICE (LOW TO HIGH) is visible
        assert sauceDemoPage.lowToHigh.isDisplayed();

        Driver.closeDriver();


    }
}
