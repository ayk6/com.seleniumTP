package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01first {
    public static void main(String[] args) throws InterruptedException {
        // ilkel otomasyon - web driver yeri gösterilir

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        driver.get("https://www.github.com");
        Thread.sleep(1000);
        driver.get("https://www.amazon.com");

        driver.close();
    }
}
