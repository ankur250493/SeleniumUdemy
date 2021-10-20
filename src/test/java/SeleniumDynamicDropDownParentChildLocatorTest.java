import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDynamicDropDownParentChildLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        Thread.sleep(5000);

    //    driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        //    driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a[2]")).click();


        // driver.close();

    }
}
