import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeTest {
    public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://google.in");
    driver.getTitle();
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
//    System.out.println(driver.getPageSource());
    driver.get("https://yahoo.com");
    driver.navigate().back();
        driver.navigate().forward();
        driver.close();

    }
}
