import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeCSSLocatorTest {
    public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://login.salesforce.com/?locale=in");
    driver.getTitle();

        driver.findElement(By.cssSelector("#username")).sendKeys("sample@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        driver.findElement(By.cssSelector("#Login")).click();

        // driver.close();

    }
}
