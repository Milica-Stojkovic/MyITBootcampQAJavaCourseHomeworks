package Dz21012022Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SaucedemoTest extends  Base{

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");

    }
    @Test
    public void userCanLogin() throws InterruptedException {
        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        goToLogin();

        login.insertUsername(validUsername);
        login.insertPassword(validPassword);
        Thread.sleep(2000);
        login.clickOnLoginButton();

        String expectedURL="https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL);

}
     private void goToLogin() {

    }
}
