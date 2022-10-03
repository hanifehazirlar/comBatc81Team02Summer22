package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_E2E_Homework {
    // 1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
    //2. Bir metod olusturun: RoomCreateTest()
    //3. https://www.hotelmycamp.com adresine gidin.
    //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
    //a. Username : manager b. Password : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna basin.
    //9. "HotelRoom was inserted successfully" textinin göründüğünü test edin.
    //10. OK butonuna tıklayın.
    //11. Hotel rooms linkine tıklayın.
    //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..


    @Test
    public void RoomCreateTest() throws InterruptedException {
        // 1.Tests packagenin altına class olusturun: D18_HotelRoomCreation
        //2. Bir metod olusturun: RoomCreateTest()
        //3. https://www.hotelmycamp.com adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        //log in butonuna basin
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login.click();
        //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        //a. Username : manager b. Password : Manager1!
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelmycampUsername"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelmycampPassword"));
        //5. Login butonuna tıklayın.
        hotelMyCampPage.accountLogin.click();
        //6. Hotel Management menusunden Hotel Rooms menusune tiklayiniz ve Add Hotelroom butonuna tıklayın.
        hotelMyCampPage.hotelManagement.click();
        hotelMyCampPage.hotelRooms.click();
        hotelMyCampPage.addHotelRoom.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //8. Save butonuna basin.
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        hotelMyCampPage.idHotel.sendKeys("name");
        actions.sendKeys(Keys.TAB).sendKeys("123")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.country().capital())
                .sendKeys(Keys.TAB).sendKeys("QA")
                .sendKeys(Keys.TAB).sendKeys("300")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("King")
                .sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys("3")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB,"123",Keys.TAB,faker.name().fullName(),Keys.TAB,faker.country().capital(),
                Keys.TAB,"QA",Keys.TAB,"300",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"King",
                Keys.TAB,"2",Keys.TAB,"3",Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER).perform();


        //9. "HotelRoom was inserted successfully" textinin göründüğünü test edin.
        Thread.sleep(3000);
        assert hotelMyCampPage.hotelRoomWasInsertedSuccessfully.isDisplayed();
        //10. OK butonuna tıklayın.
         hotelMyCampPage.okHotelRoomWasInsertedSuccessfully.click();
        //11. Hotel rooms linkine tıklayın.
        actions.sendKeys(Keys.HOME).perform();
        hotelMyCampPage.hotelRoomsLink.click();
        //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
        assert hotelMyCampPage.listOfHotelRooms.isDisplayed();

        Driver.closeDriver();
    }
}
