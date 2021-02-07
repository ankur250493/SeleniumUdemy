import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SeleniumHandlingWindowsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
        Set <String> windows = driver.getWindowHandles(); //[parent child id]
        Iterator<String>it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);

       System.out.println(driver.findElement(By.cssSelector("p[class = 'im-para red']")).getText().split("at")[1].trim().split(" ")[0]);
       String mailId = driver.findElement(By.cssSelector("p[class = 'im-para red']")).getText().split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(parentId);

       driver.findElement(By.id("username")).sendKeys(mailId);
       driver.findElement(By.id("password")).sendKeys("password");

       // driver.close();

    }
}
