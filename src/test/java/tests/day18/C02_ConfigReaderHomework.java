package tests.day18;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderHomework {
    @Test (groups = "grp2")
    public void test01() {
        //https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login.click();

        //test data username: manager ,
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelmycampUsername"));

        //test data password : Manager1!
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelmycampPassword"));

        //log in butonuna basin
        hotelMyCampPage.accountLogin.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        assert hotelMyCampPage.validLogin.isDisplayed();
        Driver.closeDriver();

    }
}
