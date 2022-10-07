package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentaCarPage {
    public BlueRentaCarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//*[@href='/login']")
    public WebElement login;

    @FindBy(xpath ="//*[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath ="//*[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath ="//*[@type='submit']")
    public WebElement accountLogin;

    @FindBy(xpath ="//*[text()='John Walker']")
    public WebElement johnWalker;

}
