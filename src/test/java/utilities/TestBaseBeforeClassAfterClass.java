package utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeClassAfterClass {

    protected static WebDriver driver;
    protected   Actions actions;
    protected  Faker faker;
    protected   Select select;
    protected  LocalDateTime date;
    protected  String tarih;
    // @BeforeClass ve @AfterClass notasyonlarını TestNG de kullanırken
    // JUnit'teki gibi static yapmaya gerek yoktur

    @BeforeClass
    public  void setup(){
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
    @AfterClass
    public  void tearDown(){
        //driver.quit();
    }
}
