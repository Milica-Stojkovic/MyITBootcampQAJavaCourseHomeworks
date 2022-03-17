package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

////Zadatak 3 - Ulogovati se na sajt https://demoqa.com/ preko kolacica,
// izlogovati se i asertovati da je korisnik izlogovan
public class DomaciZadatakSelenium {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/profile");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"notLoggin-label\"]/a[1]"));
        Thread.sleep(2000);
        loginButton.click();

        WebElement username = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        username.sendKeys("Milica1811");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Milica1811#");
        Thread.sleep(2000);

       Cookie kolacic = new Cookie("userName", "Milica1811");
       driver.manage().addCookie(kolacic);
       driver.navigate().refresh();

    }
}
