import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumAutoSuggestiveDropDownTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        // Select the auto suggest drop-box and enter the value
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        // Storing the result from the auto suggest in a list
        for(WebElement option :options){
            if (option.getText().equalsIgnoreCase("india"))
        // Search for the required value from the list and store it
            {
                option.click();
        // Select the stored element
                break;
            }
        }
         driver.close();
    }
}
