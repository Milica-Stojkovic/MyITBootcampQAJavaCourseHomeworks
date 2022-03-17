package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Page {
    public WebDriver driver;
    public WebDriverWait wdwait;
    private String expectedText;
    private List<Item> items;

    private List<WebElement> itemsInCart;
    public List<WebElement> getItemsInCart() {
        return itemsInCart;
    }

    public Page(WebDriver driver, WebDriverWait wdwait, String expectedText) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.expectedText = expectedText;
        this.itemsInCart = new ArrayList<>();
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    //Returns All categories as List of WebElement items
    public List<WebElement> getCategories() {
        return  driver.findElements(By.id("itemc"));
    }

    //Returns all div items under div[id=tbodyid]
    //Div represents items and those could be filtered by onre of 3 Categories
    public List<WebElement> getItems(){
        return driver.findElements(By.xpath("//*[@id=\"tbodyid\"]/div"));
    }

    //Returns item title
    public String getTitle(WebElement element){
        return element.findElement(By.tagName("h4")).getText();
    }

    //Returns item price
    public double getPrice(WebElement element){
        String price = element.findElement(By.tagName("h5")).getText();
        //As the price is coming with currency sign ('$'), it will be replaced with an empty space
        //and string will be trimmed to eliminate all empty spaces
        price = price.replace('$', ' ').trim();
        try{
            return Double.valueOf(price);
        }
        catch (Exception ex){
            return 0;
        }
    }

    //Returns item description
    public String getDescription(WebElement element){
        return element.findElement(By.tagName("p")).getText();
    }

    //From WebElements a new list of Items is being created
    // and set to the Page Items attribute
    public void setPageItems(List<WebElement> pageItems){
        List<Item> list = new ArrayList<>();
        for(WebElement phoneWebElement : pageItems){
            String title = getTitle(phoneWebElement);
            double price = getPrice(phoneWebElement);
            String description = getDescription(phoneWebElement);
            list.add(new Item(title, price, description));
        }
        setItems(list);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(expectedText);
        sb.append(":\n");
        for(Item item : items){
            sb.append("naziv: ");
            sb.append(item.getTitle());
            sb.append("\n");
            sb.append("opis: ");
            sb.append(item.getDescription());
            sb.append("\n");
            sb.append("cena: ");
            sb.append(item.getPrice());
            sb.append("\n\n");
        }
        sb.append("Ukupno stavki iz kategorije ");
        sb.append(expectedText);
        sb.append(" = ");
        sb.append(items.size());
        sb.append(". \n");
        sb.append("Ukupna cena svih proizvoda iz kategorije ");
        sb.append(expectedText);
        sb.append(" = ");
        sb.append(totalPrice());
        sb.append(". \n\n");
        return sb.toString();
    }

    //Calculates total price for all items
    public double totalPrice(){
        double sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void clickMain() {
        driver.findElement(By.id("cat")).click();
    }
    public void putItemIntoCart(WebElement itemWebElement){
        itemsInCart.add(itemWebElement);
    }
}