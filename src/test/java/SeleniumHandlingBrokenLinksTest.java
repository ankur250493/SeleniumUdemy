import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class SeleniumHandlingBrokenLinksTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        SoftAssert softAssert = new SoftAssert();
      //  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // step 1 get all URL tied up to the links using selenium

        // if status code is greater than 400 than its not working

        List <WebElement> links = driver.findElements(By.cssSelector("li[class*='gf-li'] a"));

        for (WebElement link : links){
            String url = link.getAttribute("href");

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);
            softAssert.assertTrue(responseCode<400,"message");


//            if (responseCode<400){
//
//                System.out.println("Broken link" + link.getText() + "staus code" + responseCode);
//                Assert.assertTrue(false);
//
//            }
        }

        softAssert.assertAll();

       // driver.close();
    }

}
