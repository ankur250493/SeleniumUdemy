import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumCalenderUIHandleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.path2usa.com/travel-companions");

        driver.findElement(By.xpath("//input[@id='travel_date']")).click();

        List <WebElement> date =  driver.findElements(By.className("day"));
        int count = driver.findElements(By.className("day")).size();

        for (int i=0;i<count;i++){

            String text = driver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("21")){
                driver.findElements(By.className("day")).get(i).click();

                break;
            }
        }


        // driver.close();

    }
}
