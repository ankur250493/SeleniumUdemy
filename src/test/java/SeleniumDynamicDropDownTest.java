import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDynamicDropDownTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    // Click to open the drop-down menu
        Thread.sleep(5000);
    //    driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
    // Select the value using xpath from the first drop-down menu
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    // Select the value using xapth from the second drop-down menu
    //    driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a[2]")).click();
         driver.close();

    }
}
