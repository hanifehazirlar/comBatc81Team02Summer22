package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class C02_Homework {
    //Hepsiburada sayfasına gidiniz
    //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
    //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
    //Sayfayı kapatalım

    @Test
    public void test01() throws IOException, InterruptedException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburadaUrl"));
        HepsiBuradaPage hepsiBuradaPage = new HepsiBuradaPage();
        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
        int linkSize=hepsiBuradaPage.subLinks.size();
        String oldTitle = Driver.getDriver().getTitle();
        String newTitle = "";

        for (int i = 0; i < linkSize; i++) {
            Thread.sleep(2000);
            ReusableMethods.getActions().moveToElement(hepsiBuradaPage.electronik).perform();
            Thread.sleep(2000);
            ReusableMethods.getActions().moveToElement(hepsiBuradaPage.bilgisayarTablet).perform();
            Thread.sleep(10000);
            hepsiBuradaPage.subLinks.get(i).click();
            newTitle = Driver.getDriver().getTitle();

            Assert.assertNotEquals(oldTitle, newTitle);

            ReusableMethods.getScreenshot("Link" + i);

            Driver.getDriver().navigate().back();
        }
    }
}
