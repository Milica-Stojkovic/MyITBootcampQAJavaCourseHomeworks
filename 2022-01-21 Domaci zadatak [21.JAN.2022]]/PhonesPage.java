package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhonesPage extends Page {

    public PhonesPage(WebDriver driver, WebDriverWait wdwait) {
        super(driver, wdwait, "Phones");
    }

    //Returns SubMenu Category item for the Phones
    public WebElement getPhonespage() {
        return getCategories().get(0);
    }

    //Filters list by Phone category
    public void clickPhones() {
        this.getPhonespage().click();
    }
}
