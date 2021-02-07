import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumCheckboxWithTestNGTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());




        driver.findElement(By.id("divpaxinfo")).click();
        // Selecting dropdown menu
        Thread.sleep(2000);
        driver.findElement(By.id("hrefIncAdt")).click();
        // Selecting and clicking on plus button once
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for (int i=1;i<2;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        // For loop to click plus button twice
        Thread.sleep(2000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        // Click on done
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"3 Adult");
        // print the selected number of people


        //count the number od checkboxes

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


        // driver.close();

    }
}
