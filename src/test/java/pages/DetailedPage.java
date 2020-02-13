package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailedPage {
    private static WebElement element;

    public static WebElement humminbirdTshirtDetailed(WebDriver driver){
        element = driver.findElement(By.xpath("//h1[contains(text(),'Hummingbird printed t-shirt')]"));
        return element;
    }

    public static WebElement addToCart(WebDriver driver){
        element = driver.findElement(By.cssSelector(".add-to-cart"));
        return element;
    }
}
