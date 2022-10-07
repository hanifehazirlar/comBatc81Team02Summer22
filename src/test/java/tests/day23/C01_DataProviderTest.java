package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProviderTest {
    AmazonPage amazonPage=new AmazonPage();

    @DataProvider
    public static Object[][] words() {
        return new Object[][]{
                {"elma"},
                {"java"},
                {"selenium"},
                {"klavye"},
                {"mouse"}
        };
    }

    @Test (dataProvider = "words")
    public void amazonSearchTest(String word) {
        //Amazon sayfasina gidip search box da
        //elma, java, selenium, klavye, mouse

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        try {
            amazonPage.searchBox.sendKeys(word, Keys.ENTER);
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
        }

        Assert.assertTrue(amazonPage.searchResultText.getText().contains(word));

    }
    @Test(dependsOnMethods = "amazonSearchTest")
    public void testClose() {
        Driver.closeDriver();
    }
}
