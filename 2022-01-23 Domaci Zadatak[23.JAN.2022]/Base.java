package Dz21012022Saucedemo;
//Ulogovati se na sajt: https://www.saucedemo.com/ i assertovati da je sve proslo kako treba!
//Nemojte da hardcode-ujete validne sifre i password, vec ih dohvatite preko stranice

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Base {
        public WebDriver driver;
        public WebDriverWait wdwait;
        public Login login;

        @BeforeClass
    public  void setup() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
                login = new Login(driver, wdwait);
        }

      //@AfterClass
        public void tearDown() {
                driver.manage().deleteAllCookies();
                driver.close();
                driver.quit();
        }


}
