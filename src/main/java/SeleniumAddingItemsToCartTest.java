import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class SeleniumAddingItemsToCartTest {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        String[] itemNames = {"Cucumber", "Brocolli","Cauliflower"};
        int j = 0;
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");


        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {

            String[] temp = products.get(i).getText().split("-");
            String formattedName = temp[0].trim();

            List itemNamesArrayList = Arrays.asList(itemNames);


            if (itemNamesArrayList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                if (j==itemNames.length)
                break;
            }

        }
        //    driver.close();

    }
}
