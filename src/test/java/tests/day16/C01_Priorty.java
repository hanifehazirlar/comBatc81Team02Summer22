package tests.day16;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_Priorty extends TestBaseBeforeClassAfterClass {
    //youtube anasayfasina gidiniz
    //asagidaki adlari kullanarak 4 testmethodu olusturun ve gerekli testleri yapınız
    //titleTest() => sayfa baslıgının "YouTube oldugunu test ediniz
    //imageTest(9 => YouTube resminin goruntulendigini(is.displayed()) test edin
    //Search box'in erisilebilir oldugunu test edin(isEnabled())
    //wrongTitleTest => Sayfa baslıgının "youtube olmadigini test ediniz


    @BeforeClass
    public void beforeClass() {
        //youtube anasayfasina gidiniz
        driver.get("https://www.youtube.com");

    }
    @Test (priority = 1)
    public void titleTest() {
        //titleTest() => sayfa baslıgının "YouTube oldugunu test ediniz
        assert driver.getTitle().equals("YouTube");
    }

    @Test (priority = 2)
    public void imageTest() {
        //imageTest(9 => YouTube resminin goruntulendigini(is.displayed()) test edin
        assert driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed();
    }
    @Test (priority = 3)
    public void searcBoxTest() {
        //Search box'in erisilebilir oldugunu test edin(isEnabled())
        assert driver.findElement(By.xpath("//*[@id='search-input']")).isEnabled();
    }

    @Test (priority = 4)
    public void wrongTitleTest() {
        //wrongTitleTest => Sayfa baslıgının "youtube olmadigini test ediniz
        assert !driver.getTitle().equals("youtube");
    }
}
