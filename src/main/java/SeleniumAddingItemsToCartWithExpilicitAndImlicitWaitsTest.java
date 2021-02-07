import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumAddingItemsToCartWithExpilicitAndImlicitWaitsTest {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InterruptedException {
        String[] itemNames = {"Cucumber", "Brocolli","Cauliflower"};

        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        addItems(driver,itemNames);


    }
    public static void addItems(WebDriver driver, String[] itemNames) throws InterruptedException {
        int j = 0;

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
        WebDriverWait w = new WebDriverWait(driver,7);
        driver.findElement(new By.ByCssSelector("img[alt=Cart]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();


        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class=promoInfo]")));
        System.out.println(driver.findElement(By.cssSelector("span[class=promoInfo]")).getText());
        //    driver.close();
    }
}


