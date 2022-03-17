package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DomaciZadatakNovijaVerzija {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/profile");

       Cookie kolacic2= new Cookie("expires","2022-01-23T14%3A30%3A09.914Z");
       driver.manage().addCookie(kolacic2);

       Cookie kolacic5 = new Cookie("userName","Milica1811");
       driver.manage().addCookie(kolacic5);

       Cookie kolacic6 = new Cookie("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik1pbGljYTE4MTEiLCJwYXNzd29yZCI6Ik1pbGljYTE4MTEjIiwiaWF0IjoxNjQyMzU5MDQ2fQ.FNclwOZFLnWFzpskA6-8D0VCWEZlHk2Ld9HOggMM60I");
       driver.manage().addCookie(kolacic6);

       WebElement button = driver.findElement(By.xpath("//*[@id=\"notLoggin-label\"]/a[1]"));
       button.click();
       Thread.sleep(2000);

        WebElement logOutbutton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        logOutbutton.click();
        Thread.sleep(2000);

        String actualURL ="https://demoqa.com/login";
        String expectedURL ="https://demoqa.com/login";
        Assert.assertEquals(actualURL,expectedURL);
        String pageNaslov ="Login";
        Thread.sleep(2000);

        Assert.assertEquals(logOutbutton.getText(), pageNaslov);

    }
}
