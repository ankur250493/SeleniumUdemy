import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4MultipleWindowsOrTabsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

      //  driver.switchTo().newWindow(WindowType.TAB);

      // driver.switchTo().newWindow(WindowType.TAB);
       // driver.close();

    }
}
