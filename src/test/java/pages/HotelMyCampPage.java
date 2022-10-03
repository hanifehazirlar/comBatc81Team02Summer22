package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public  HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement accountLogin;
    
    @FindBy(xpath = "//*[@class='page-md page-header-fixed page-quick-sidebar-over-content']")
    public WebElement validLogin;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement unvalidLogin;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(xpath = "//*[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRooms;

    @FindBy(xpath = "//*[text()='Add Hotelroom ']")
    public WebElement addHotelRoom;

    @FindBy(xpath = "//*[@id='IDHotel']")
    public WebElement idHotel;

    @FindBy(xpath = "//*[text()='HotelRoom was inserted successfully']")
    public WebElement hotelRoomWasInsertedSuccessfully;

    @FindBy(xpath = "//*[@data-bb-handler='ok']")
    public WebElement okHotelRoomWasInsertedSuccessfully;

    @FindBy(xpath = "//*[text()='Hotelrooms']")
    public WebElement hotelRoomsLink;

    @FindBy(xpath = "(//*[text()='List Of Hotelrooms'])[2]")
    public WebElement listOfHotelRooms;

    @FindBy(xpath = "(//*[@href='/admin/RoomReservationAdmin'])[1]")
    public WebElement roomReservationAdmin;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//*[@name='IDUser']")
    public WebElement idUser;

    @FindBy(xpath = "//*[text()='RoomReservation was inserted successfully']")
    public WebElement fillAllFieldsPlease;
    @FindBy(xpath = "//*[text()='OK']")
    public WebElement ok;


}
