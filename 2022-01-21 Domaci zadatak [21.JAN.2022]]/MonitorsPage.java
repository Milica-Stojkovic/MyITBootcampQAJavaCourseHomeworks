package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MonitorsPage extends Page {

    public MonitorsPage(WebDriver driver, WebDriverWait wdwait) {
        super(driver, wdwait, "Monitors");
    }

    //Returns SubMenu Category item for the Monitors
    public WebElement getMonitorspage() {
        return getCategories().get(2);
    }

    //Filters list by Monitor category
    public void clickMonitors() {
        this.getMonitorspage().click();
    }
}
