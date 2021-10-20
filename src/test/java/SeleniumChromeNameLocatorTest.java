import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeNameLocatorTest {
    public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://login.salesforce.com/?locale=in");
    driver.getTitle();

        driver.findElement(By.name("username")).sendKeys("test.email@gmail.com");
        driver.findElement(By.name("pw")).sendKeys("test.email@gmail.com");
        driver.findElement(By.name("Login")).click();


        // driver.close();

    }
}
