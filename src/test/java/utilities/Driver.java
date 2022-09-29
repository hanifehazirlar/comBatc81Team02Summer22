package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver==null) {//driver bos ise asagidakileri yap
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){//driver bos degil ise
            driver.close();
            driver = null;
        }
    }
    public static void closeQuit(){
        if (driver != null){//driver bos degil ise
            driver.quit();//Kapandiktan sonraki acmalari garanti altina almak icin driver'i tekrar null yaptik
            driver = null;
        }
    }

}