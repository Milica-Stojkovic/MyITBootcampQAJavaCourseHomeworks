package DomaciZadaci;
//Postoji pesma koja je himna ITBootcampa: https://www.youtube.com/watch?v=dQw4w9WgXcQ
  // Vas domaci zadatak je da otvorite pretrazivac, odete na youtube i pustite Rick Astley-a

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DZ18012022 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com/watch?v=dQw4w9WgXcQ");

        WebElement rickAshley = driver.findElement(By.cssSelector(".ytp-play-button.ytp-button"));
        rickAshley.click();
    }
}