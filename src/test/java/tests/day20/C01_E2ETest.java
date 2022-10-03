package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_E2ETest {
    @Test
    public void test01() throws InterruptedException {
        //https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        //log in butonuna basin
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login.click();

        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin
        //Username : manager
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelmycampUsername"));
        //Password  : Manager1!
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelmycampPassword"));
        //Login butonuna tıklayın.
        hotelMyCampPage.accountLogin.click();
        //6. Hotel Management/Hotel List menusunden Room Reservations butonuna tikla ve
        // ADD ROOM RESERVATION butonuna tiklayin
        hotelMyCampPage.hotelManagement.click();
        hotelMyCampPage.roomReservationAdmin.click();
        hotelMyCampPage.addRoomReservation.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker=new Faker();
        hotelMyCampPage.idUser.sendKeys("manager");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys("Hapy Hotel")
                .sendKeys(Keys.TAB).sendKeys("100")
                .sendKeys(Keys.TAB).sendKeys("10/06/2022").sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/10/2022").sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2") .sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys("goodHoliday")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(3000);
        assert hotelMyCampPage.fillAllFieldsPlease.isDisplayed();

        //10. OK butonuna tıklayın.
        hotelMyCampPage.ok.click();

        //sayfayi kapatalim
        Driver.closeDriver();

    }
}
