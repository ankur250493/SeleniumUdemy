import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDropDownLoopingTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        // Selecting dropdown menu
        Thread.sleep(2000);
        driver.findElement(By.id("hrefIncAdt")).click();
        // Selecting and clicking on plus button once
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        // print the selected number of people
//        int i = 1;
//        while (i < 2) {
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
        for (int i=1;i<2;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        // For loop to click plus button twice
        Thread.sleep(2000);
       driver.findElement(By.id("btnclosepaxoption")).click();
       // Click on done
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        // print the selected number of people
         driver.close();

    }
}
