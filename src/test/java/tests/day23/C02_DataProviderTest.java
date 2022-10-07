package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProviderTest {
    //https://www.bluerentalcars.com/ adresine git
    //login butonuna bas
    //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
    //login butonuna tiklayin
    //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
    BlueRentaCarPage blueRentaCarPage=new BlueRentaCarPage();



    @DataProvider
    public static Object[][] users() {
        return new Object[][]{
                {"email@gmail.com","12388"},
                {"customer@bluerentalcars.com","69837"},
                {"team02@gmail.com","12345"}
        };
    }

    @Test (dataProvider = "users")
    public void negativeTest(String userEmail,String password) {

        //https://www.bluerentalcars.com/ adresine git
        //login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("blurentacar"));
        blueRentaCarPage.login.click();
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        blueRentaCarPage.emailBox.sendKeys(userEmail, Keys.TAB,password,Keys.TAB);
        //login butonuna tiklayin
        blueRentaCarPage.accountLogin.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(blueRentaCarPage.accountLogin.isDisplayed());

    }

    @Test
    public void testClose() {
        //Sayfayi kapatalim
        Driver.closeDriver();
    }
}
