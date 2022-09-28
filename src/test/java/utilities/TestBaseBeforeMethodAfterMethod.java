package utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeMethodAfterMethod {
    protected static WebDriver driver;
    protected  static Actions actions;
    protected static Faker faker;
    protected  static Select select;
    protected LocalDateTime date;
    protected String tarih;
    //TestNG framework'unde @Before ve @After notasyonlari yerine @BeforeMethod ve @AfterMethod kullanilir
    //Calisma prensibi JUnit deki Before, After ile aynidir.
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        actions=new Actions(driver);
        faker=new Faker();
        date=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("ddMMyyHHmmss");
        tarih=date.format(formatter);

    }
    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
