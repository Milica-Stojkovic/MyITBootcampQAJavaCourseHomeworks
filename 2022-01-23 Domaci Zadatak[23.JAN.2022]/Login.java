package Dz21012022Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class Login {
         WebDriver driver;
         WebDriverWait wdwait;
         WebElement username;
         WebElement password;
         WebElement loginButton;

        public Login(WebDriver driver, WebDriverWait wdwait) {
            this.driver = driver;
            this.wdwait = wdwait;
        }

        public WebElement getUsername() {
            return driver.findElement(By.id("user-name"));
        }

        public WebElement getPassword() {
            return driver.findElement(By.id("password"));
        }

        public WebElement getLoginButton() {
            return driver.findElement(By.id("login-button"));
        }

        public void insertUsername(String username) {
            this.getUsername().clear();
            this.getUsername().sendKeys(username);
        }

        public void insertPassword(String pass) {
            this.getPassword().clear();
            this.getPassword().sendKeys(pass);
        }

        public void clickOnLoginButton() {
            this.getLoginButton().click();
        }
    }

