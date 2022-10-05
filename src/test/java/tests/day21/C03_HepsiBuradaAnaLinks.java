package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class C03_HepsiBuradaAnaLinks {
    @Test
    public void test01() throws InterruptedException, IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburadaUrl"));
        //Elektronik altında bilgisayar/tablet altındaki ana linkleri tıklayalım
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
        HepsiBuradaPage hepsiBuradaPage=new HepsiBuradaPage();

        int count=1;

        for (int i = 0; i <14 ; i++) {
            Thread.sleep(4000);
            ReusableMethods.hover(hepsiBuradaPage.electronik);
            Thread.sleep(4000);
            ReusableMethods.hover(hepsiBuradaPage.bilgisayarTablet);
            Thread.sleep(4000);
            hepsiBuradaPage.anaLinks.get(i).click();
            ReusableMethods.getScreenshot((i+1)+".link");
            Driver.getDriver().navigate().back();
            count++;
        }
        assert (count == 14);
        //Sayfayı kapatalım
        Driver.closeDriver();
    }
}
