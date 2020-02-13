package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {

    public static WebElement humminbirdTshirt(WebDriver driver){
        WebElement element;
        element = driver.findElement(By.xpath("//img[@alt='Hummingbird printed t-shirt']"));
        return element;
    }
}
