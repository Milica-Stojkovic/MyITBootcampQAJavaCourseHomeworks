package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LaptopsPage extends Page {

    public LaptopsPage(WebDriver driver, WebDriverWait wdwait) {
        super(driver, wdwait, "Laptops");
    }

    //Returns SubMenu Category item the Laptops
    public WebElement getLaptopspage() {
        return getCategories().get(1);
    }

    //Filters list by Laptop category
    public void clickLaptops() {
        this.getLaptopspage().click();
    }
}