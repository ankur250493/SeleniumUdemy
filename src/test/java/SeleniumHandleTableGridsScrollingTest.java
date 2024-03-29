import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class SeleniumHandleTableGridsScrollingTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scroll(0,500)");

        Thread.sleep(5000);

        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

//        driver.findElements(By.cssSelector(".tablefixHead td:nth-child(4)"));

        List <WebElement> values = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));

        int sum = 0;
        for(int i=0;i<values.size();i++){
           sum = sum + Integer.parseInt(values.get(i).getText());
        }

         System.out.println(sum);
        driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim();
      int totalAmount = Integer.parseInt(driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());

        Assert.assertEquals(sum,totalAmount);

      //  driver.close();

    }
}
