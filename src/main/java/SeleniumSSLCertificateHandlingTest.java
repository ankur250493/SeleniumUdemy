import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumSSLCertificateHandlingTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");

        DesiredCapabilities ch = DesiredCapabilities.chrome();
        //   ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ChromeOptions c = new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver(c);
        //driver.close();

    }
}
