package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04relativeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // bir element locate edilemiyorsa yakınında bulunan elementler
        // kullanılarak tarif edilebilir

        WebElement sailor = driver.findElement(By.id("pid11_thumb"));
        WebElement area = driver.findElement(By.cssSelector("img[src='bots/sl-bay-area-bot.png']"));

        // movember sailor'un sağında, area'nın altında

        WebElement movember = driver.findElement(RelativeLocator.
                with(By.tagName("img")).below(area).toRightOf(sailor));

        System.out.println(movember.getAttribute("id"));

    }
}
