package tests.day22;

import org.testng.annotations.Test;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    //-https://www.bluerentalcars.com/ adresine git
    //    -login butonuna bas
    //    -test data user email: customer@bluerentalcars.com ,
    //    -test data password : 12345 dataları girip login e basın
    //    -login butonuna tiklayin
    //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void test01() {
        extentTest=extentReports.createTest("Positive Test","Valid Username and Password");
        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blurentacar"));
        extentTest.info("Blue RentaCar sitesine gidildi");
        BlueRentaCarPage blueRentaCarPage=new BlueRentaCarPage();

        //    -login butonuna bas
        blueRentaCarPage.login.click();
        extentTest.info("login butonuna basildi");

        //    -test data user email: customer@bluerentalcars.com ,
        blueRentaCarPage.emailBox.sendKeys(ConfigReader.getProperty("userEmail"));
        extentTest.info("gecerli email girildi");

        //    -test data password : 12345 dataları girip login e basın
        blueRentaCarPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("gecerli password girildi");

        //    -login butonuna tiklayin
        blueRentaCarPage.accountLogin.click();
        extentTest.info("Gecerli kullanici login butonuna basildi");

        //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        assert blueRentaCarPage.johnWalker.getText().equals("John Walker");
        extentTest.pass("Sayfaya basarili sekilde girildi");

    }
}
