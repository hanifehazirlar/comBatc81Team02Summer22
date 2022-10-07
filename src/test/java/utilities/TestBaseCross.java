package utilities;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;


public class TestBaseCross {
    protected  WebDriver driver;
    @Parameters("browser")
    @BeforeClass
    public  void setup(@Optional String browser){

        driver=CrossDriver.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public  void tearDown(){

        CrossDriver.closeDriver();
    }
}
