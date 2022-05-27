package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        System.out.println(driver.getWindowHandle());
        // CDwindow-B520ED4E7104642FF59089F1C66B9AEF
        // her pencere için benzersiz hash kodu üretilir

    }
}
