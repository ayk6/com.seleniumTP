package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        // driver.getPageSource(); sayfa kaynak kodunu getirir
        // kaynak kodda Gateway var mı kontrol et
        String mainCode = driver.getPageSource();

        if (mainCode.contains("Gateway")) {
            System.out.println("kaynak kod Gateway içeriyor");
        } else System.out.println("kaynak kod Gateway içermiyor");

        driver.close();
    }
}
