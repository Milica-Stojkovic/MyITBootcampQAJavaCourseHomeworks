package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class ProductStoreBasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Page mainPage;
    public PhonesPage phonespage;
    public LaptopsPage laptopspage;
    public MonitorsPage monitorspage;

    @BeforeClass
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        mainPage = new Page(driver,wdwait, "Main");
        phonespage = new PhonesPage(driver,wdwait);
        laptopspage = new LaptopsPage(driver,wdwait);
        monitorspage = new MonitorsPage(driver,wdwait);
    }
}
