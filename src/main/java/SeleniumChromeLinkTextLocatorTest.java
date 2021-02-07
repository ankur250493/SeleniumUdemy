import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeLinkTextLocatorTest {
    public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://facebook.com");
    driver.getTitle();

        driver.findElement(By.linkText("Forgotten password?")).click();


        // driver.close();

    }
}
