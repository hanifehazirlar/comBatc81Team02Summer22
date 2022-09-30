package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {
    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='user-name']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='product_sort_container']")
    public WebElement dropDown;

    @FindBy(xpath = "(//*[text()='Price (low to high)'])[1]")
    public WebElement lowToHigh;




}
