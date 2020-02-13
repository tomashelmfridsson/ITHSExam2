import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PrestashopTest.class);
        System.out.println("Result was " + result.wasSuccessful());

    }
}
