package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        // amazon -> city bike -> count result -> first pic

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com.tr");

        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("city bike"+ Keys.ENTER);

        List<WebElement> resultCount = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Sonuç sayısı : "+resultCount.get(0).getText());

        List<WebElement> firstPic = driver.findElements(By.className("s-image"));
        firstPic.get(0).click();






    }
}
