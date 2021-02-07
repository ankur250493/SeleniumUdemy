import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeXpathLocatorTest {
    public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://login.salesforce.com/?locale=in");
    driver.getTitle();

        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("test@gmaail.com");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("incorrectPassword");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());

        System.out.println();

        // driver.close();

    }
}
