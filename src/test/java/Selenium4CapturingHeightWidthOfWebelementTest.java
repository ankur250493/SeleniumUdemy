import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Selenium4CapturingHeightWidthOfWebelementTest {
    public static void main(String[] args) throws IOException {

            System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/angularpractice/");

            WebElement userName = driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']"));
            userName.sendKeys("shdcbhb");
            File screenshotFile = userName.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile((File) screenshotFile, new File("userNameScreenshot.png"));

            System.out.println(userName.getRect().getHeight());
            System.out.println(userName.getRect().getWidth());


            //driver.close();

    }
}
