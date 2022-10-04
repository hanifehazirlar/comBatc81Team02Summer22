package tests.automatinExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Exercise09 {
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Products' button
    //5. Verify user is navigated to ALL PRODUCTS page successfully
    //6. Enter product name in search input and click search button
    //7. Verify 'SEARCHED PRODUCTS' is visible
    //8. Verify all the products related to search are visible

    @Test
    public void test01() {
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().navigate().to(ConfigReader.getProperty("automationExcerciseUrl"));
        //3. Verify that home page is visible successfully
        assert Driver.getDriver().getCurrentUrl().equals("https://automationexercise.com/");
        //4. Click on 'Products' button
        AutomationExcercisePage automationExcercisePage = new AutomationExcercisePage();
        automationExcercisePage.products.click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        assert automationExcercisePage.allProducts.isDisplayed();
        //6. Enter product name in search input and click search button
        automationExcercisePage.searchProduct.sendKeys("Tshirt", Keys.TAB, Keys.ENTER);
        //7. Verify 'SEARCHED PRODUCTS' is visible
        assert automationExcercisePage.searchedProduct.isDisplayed();

        //8. Verify all the products related to search are visible

        List<WebElement> searchedItems = new ArrayList<>();
        automationExcercisePage.productItemsInSearchedPage.stream().
                filter(t -> t.getText().contains("Tshirt") || t.getText().contains("T-Shirts") || t.getText().contains("T SHIRT") ||
                            t.getText().contains("T-Shirt")).forEach(searchedItems::add);

        assert automationExcercisePage.productItemsInSearchedPage.size() == searchedItems.size();

    }
}
