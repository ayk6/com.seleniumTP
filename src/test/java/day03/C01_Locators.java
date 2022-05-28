package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");

        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        // istenen web element bulundu ve objeye atandı
        // en olağan sonuç vereni id, By.name vs de denenebilir
        // " " (space) içeren veriler doğru sonuç vermeyebilir
        // link etiketi kısmı da By.linkText ile kullanılabilir
        // bulamazsa rte verir


        searchBar.sendKeys("pc glaasses"+ Keys.ENTER);
        //veri gönderilip enter'a basıldı


    }
}
