import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumWebDriverScopeTest {
    public static void main(String[] args) throws StaleElementReferenceException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");



        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // limiting webDriver scope

        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        for(int i=1;i< columnDriver.findElements(By.tagName("a")).size();i++){

            String clickOnKeys = Keys.chord(Keys.CONTROL,Keys.ENTER);

            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnKeys);

        }
        Set<String> selector = driver.getWindowHandles();
        Iterator<String> it = selector.iterator();

        while (it.hasNext()){

            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        //        driver.close();

    }
}
