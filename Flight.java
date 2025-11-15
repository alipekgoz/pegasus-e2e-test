package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Flight {

    public static void main(String[] args) throws InterruptedException {

        // Driver location
        System.setProperty("webdriver.chrome.driver.exe",
                "C:\\Users\\alipe\\OneDrive\\Belgeler\\chrome-headless-shell");

        WebDriver driver = new ChromeDriver();

        // Navigate to website
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");

        // Select FROM city
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        // Select TO city
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        // Select date
        driver.findElement(By.xpath("(//a[@href='#'][text()='9'])[1]")).click();

        // One-way trip
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        // Check if return date is disabled
        String style = driver.findElement(By.id("Div1")).getAttribute("style");
        if (style.contains("0.5")) {
            System.out.println("RETURN date is disabled (as expected for one-way trip)");
            Assert.assertTrue(true);
        } else {
            Assert.fail("RETURN date must be disabled but it is not!");
        }
        // Passenger selection
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println("Passenger count: " + driver.findElement(By.id("divpaxinfo")).getText());

        // Currency dropdown
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println("Selected Currency: " + dropdown.getFirstSelectedOption().getText());

        // Click “Search”
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

        System.out.println("Test completed successfully.");

        driver.quit();
    }
}

