package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExcercisePage {//mail : hanifehz@gmail.com  password :1234
    public AutomationExcercisePage(){
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

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignUp;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement signUpName;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement signUpEmail;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement emailAddressalreadyExist;

    @FindBy(xpath = "//*[@href='/contact_us']")
    public WebElement contact_us;

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement get_in_touch;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement contact_usName;

    @FindBy(xpath = "//*[@name='upload_file']")
    public WebElement upload_file;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public  WebElement submit;

    @FindBy(xpath = "//*[text()='Success! Your details have been submitted successfully.']")
    public WebElement success;

    @FindBy(xpath = "//*[@class='btn btn-success']")
    public WebElement home;

    @FindBy(xpath = "(//*[@href='/test_cases'])[1]")
    public WebElement testCases;

    @FindBy(xpath = "//*[text()='Test Cases']")
    public WebElement testCasesText;

    @FindBy(xpath = "//*[@href='/products']")
    public WebElement products;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement allProducts;

    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    public WebElement viewProductFirst;

    @FindBy(xpath = "//*[@class='product-information']")
    public WebElement productInformation;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchProduct;

    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchedProduct;
    @FindBy(css = "div[class=\"productinfo text-center\"]")
    public List<WebElement> productItemsInSearchedPage;
}
