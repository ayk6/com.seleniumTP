package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        // driver.manage().window().fullscreen(); // tam ekran (büyük)
        driver.manage().window().maximize(); // tam ekran

        driver.get("https://www.amazon.com");
        System.out.println(""+driver.getTitle()); // site başlığı yazdır
        System.out.println(driver.getCurrentUrl()); // site adresi yazdır

        driver.close();
    }
}
