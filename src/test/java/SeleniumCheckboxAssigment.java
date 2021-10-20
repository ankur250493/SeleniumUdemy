import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumCheckboxAssigment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

//        driver.findElement(By.id("checkBoxOption1")).click();
//        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//
//        // Find and select the required checkbox
//        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
//        // Check that the checkbox is selected or not
//        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//        //count the number od checkboxes
//        driver.close();

    }
}
