package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C06manage {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // driver.manage().window().minimize();  görev çubuğuna atar
        System.out.println(driver.manage().window().getSize());
        // pencere ölçülerini verir

        System.out.println(driver.manage().window().getPosition());
        // pencere konumu verir

        driver.manage().window().setPosition(new Point(40,40) );
        driver.manage().window().setSize(new Dimension(800,800));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // sayfanın yüklenmesi için max süre belirler
        // yükleme bittiğinde sonraki işleme geçer
        // hatalı giriş, kesinti vs olduğunda sürekli beklemeyi engeller

        driver.quit(); // test ile açılan tüm pencereleri kapatır
    }
}
