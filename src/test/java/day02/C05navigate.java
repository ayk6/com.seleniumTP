package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C05navigate {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.github.com");
        Thread.sleep(2000);

        driver.navigate().back(); // geri al
        Thread.sleep(2000);
        driver.navigate().forward(); // sonraki sayfa
        Thread.sleep(2000);
        driver.navigate().refresh(); // yenile
        Thread.sleep(2000);

        driver.close();
    }
}
