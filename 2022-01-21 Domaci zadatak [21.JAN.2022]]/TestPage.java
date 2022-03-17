package Selenium;

import net.bytebuddy.matcher.FilterableList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestPage extends ProductStoreBasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    //Goes (clicks) to Phones Category and prints all items
   @Test(priority = 1)
    public void PhonesPageTest() throws InterruptedException {
        goToPhonesPage();
        Thread.sleep(2000);
        //Assert.assertEquals(phonespage.getPhonespage().getText(), phonespage.getExpectedText());
       //Set Phones items
       phonespage.setPageItems(phonespage.getItems());
       //Print phones
       System.out.println(phonespage);
    }

    public void goToPhonesPage() {
        phonespage.clickPhones();
    }

    //Goes (clicks) to Laptops Category and prints all items
    @Test(priority = 2)
    public void LaptopsPageTest() throws InterruptedException {
        goToLaptopsPage();
        Thread.sleep(2000);
        //Set Laptop items
        laptopspage.setPageItems(laptopspage.getItems());
        //Print laptops
        System.out.println(laptopspage);
    }

    public void goToLaptopsPage() {
        laptopspage.clickLaptops();
    }

    //Goes (clicks) to Monitors Category and prints all items
   @Test(priority = 3)
    public void MonitorsPageTest() throws InterruptedException {
        goToMonitorsPage();
        Thread.sleep(2000);
        //Set Monitor items
        monitorspage.setPageItems(monitorspage.getItems());
        //Print monitors
        System.out.println(monitorspage);
    }

    public void goToMonitorsPage() {
        monitorspage.clickMonitors();
    }

    //Put random 3 items in cart and check if there is 3 added within Cart items
    @Test(priority = 4)
    public void CartTest() throws InterruptedException {
        goToMainPage();
        Thread.sleep(2000);
        List<WebElement> items = mainPage.getItems();
        int itemsCount = items.size();
        List<Integer> itemss = new ArrayList();
        for (int i = 0; i<3; i++)
        {
            int randomItem = new Random().nextInt(0, itemsCount-1);
            mainPage.putItemIntoCart(items.get(randomItem));
            itemss.add(randomItem);
            System.out.println(randomItem + ", ");
        }

        for (int i = 0; i<3; i++)
        {
            WebElement we = mainPage.getItems().get(itemss.get(i));
            wdwait.until(ExpectedConditions.elementToBeClickable(we));
            we.findElement(By.tagName("h4")).click();
            wdwait.until(WebDriver::navigate);
            Thread.sleep(2000);
            WebElement addToCart = driver.findElement(By.cssSelector("a[class='btn btn-success btn-lg']"));
            addToCart.click();
            wdwait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            driver.navigate().to("https://www.demoblaze.com/index.html");
            Thread.sleep(2000);
        }
        driver.navigate().to("https://www.demoblaze.com/cart.html");
        Thread.sleep(2000);
        var itemsInCart = driver.findElements(By.xpath("//*[@id=\"tbodyid\"]/tr"));
        System.out.println("U korpi ima: " + itemsInCart.size());
        Assert.assertEquals(itemsInCart.size(), 3);
        //Assert.assertEquals(itemsInCart.get(0).findElements(By.tagName("td")).get(1).getText(), mainPage.getTitle(mainPage.getItems().get(0)));
    }
    public void goToMainPage() {
        mainPage.clickMain();
    }
}



