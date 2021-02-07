import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandlingCalenderTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // Click to open the drop-down menu
        Thread.sleep(5000);
        //    driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();
        driver.findElement(By.linkText("Chennai (MAA)")).click();
        // Select the value using xpath from the first drop-down menu
        Thread.sleep(5000);
        driver.findElement(By.linkText("Bengaluru (BLR)")).click();

        driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(3) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")).click();
        // Select the value using xapth from the second drop-down menu
        driver.close();

    }
}
