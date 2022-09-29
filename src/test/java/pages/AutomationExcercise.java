package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExcercise {//mail : hanifehz@gmail.com  password :1234
    public AutomationExcercise(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@src='/static/images/home/logo.png']")
    public WebElement logo ;
    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUp;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginToYourAccount;

    @FindBy(xpath="(//*[@type='email'])[1]")
    public WebElement emailAddress;

    @FindBy(xpath="(//*[@type='password'])[1]")
    public WebElement password;
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement login;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAs;
    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logout;


}
