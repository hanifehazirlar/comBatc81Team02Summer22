package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C01_DependsOnMethod extends TestBaseBeforeClassAfterClass {
    @Test (groups = "grp1")
    public void test01() {
        driver.get("https://amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
    }
    @Test(dependsOnMethods = "test01")
    public void test02() {
        assert driver.findElement(By.cssSelector("div[class=\"a-section a-spacing-small a-spacing-top-small\"]")).isDisplayed();
    }
    @Test(dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://bestbuy.com/");
    }
    @Test
    public void test04() {
        driver.get("https://youtube.com/");
    }
}
//depends on methodunda iki methodu birbirine bagliyoruz,
//eger ilk methodumuz fail olursa ona bagli olan method/lari ignore eder
//depends on ile bir methoda baglanan methodlar en son calisir.
//burdaki bagliligin siralama ile hicbir alakasi yok
//yukaridaki testlerde ilk olarak test01 calisir daha sonra
//dependsOn edilmemis test04 calisir ,en son olarak da depends on edilmis 2.ve3. testler calisir


