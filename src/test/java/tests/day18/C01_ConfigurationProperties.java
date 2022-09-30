package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ConfigurationProperties {
    @Test
    public void test01() {
        //Amazon sayfasina ve
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //facebook sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        //hepsiburada sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburadaUrl"));
        Driver.closeDriver();
    }
}
