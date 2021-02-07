import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefoxTest {
    public static void main(String[] args){
    System.setProperty("webdriver.gecko.driver", "/home/ankur/Documents/Selenium/geckodriver");
    WebDriver driver = new FirefoxDriver();

    driver.get("https://amazon.in");
    driver.getTitle();
    System.out.println(driver.getTitle());

    JavaTest obj = new JavaTest();
    obj.ValidateHeader();
    System.out.println(obj.ValidateHeader());
    }
}
