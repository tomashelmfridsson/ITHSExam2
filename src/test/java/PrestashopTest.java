import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DetailedPage;
import pages.FirstPage;

import java.util.concurrent.TimeUnit;

public class PrestashopTest {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        driver = new ChromeDriver();
        System.out.println("BeforeClass");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void before(){
        System.out.println("Before");
        driver.get("http://127.0.0.1:8001");
    }

    @Test
    public void buyAProduct(){
        System.out.println("Test 1");
        FirstPage.humminbirdTshirt(driver).click();
        Assert.assertTrue("T-shirt is Displayed", DetailedPage.humminbirdTshirtDetailed(driver).isDisplayed());
        DetailedPage.addToCart(driver).click();
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @AfterClass
    public static void after(){
        driver.close();
        driver.quit();
    }

}
