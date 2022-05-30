package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C03_CSS_locator {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com/sign_in");

        // cssSelector id'lerde #idName kullanır
        // value'lerde .volue
        WebElement mailTextBox = driver.findElement(By.cssSelector("#session_email"));

        // xPath gibi ama // ve @ olmadan da kullanılabilir
        WebElement passBox = driver.findElement(By.cssSelector("input[placeholder='Password']"));

        mailTextBox.sendKeys("testtechproed@gmail.com");
        passBox.sendKeys("Test1234!");

        passBox.sendKeys(Keys.ENTER);
        // driver.findElement(By.cssSelector("input[value='Sign in']")).click();


        driver.close();
    }
}
