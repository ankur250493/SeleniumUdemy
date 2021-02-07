import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumHandlingAjaxAndMouseInteractionsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    driver.findElement(By.cssSelector("a[id=nav-link-accountList]"));

        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id=nav-link-accountList]"));

        // move to specific element
        a.moveToElement(move).contextClick().build().perform();

        a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();


        // driver.close();

    }
}
