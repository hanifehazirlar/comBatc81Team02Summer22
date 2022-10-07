package tests.day22;

import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class Exercise08 extends TestBaseCross {
   //1. Launch browser
   //2. Navigate to url 'http://automationexercise.com'
   //3. Verify that home page is visible successfully
   //4. Click on 'Products' button
   //5. Verify user is navigated to ALL PRODUCTS page successfully
   //6. The products list is visible
   //7. Click on 'View Product' of first product
   //8. User is landed to product detail page
   //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
    @Test
    public void RoomCreateTest() {
       //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().navigate().to(ConfigReader.getProperty("automationExcerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        assert automationExcercisePage.logo.isDisplayed();
        //4. Click on 'Products' button
        automationExcercisePage.products.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        assert Driver.getDriver().getTitle().contains("All Products");

        //6. The products list is visible
        assert automationExcercisePage.allProducts.isDisplayed();

        //7. Click on 'View Product' of first product
        automationExcercisePage.viewProductFirst.click();

        //8. User is landed to product detail page
        assert Driver.getDriver().getCurrentUrl().equals("https://automationexercise.com/product_details/1");

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        System.out.println(automationExcercisePage.productInformation.getText());
        assert automationExcercisePage.productInformation.isDisplayed();
    }
}
