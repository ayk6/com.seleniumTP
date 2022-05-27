package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {
    public static void main(String[] args) {
        // amazona git , başlık amazon kelimesi içeriyor mu kontrolet
        // url amazona mı ait kontrol et, testi kapat

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get("https://www.amazon.com");

        String aTitle=driver.getTitle();
        if (aTitle.contains("Amazon")){
            System.out.println("başlık Amazon kelimesi içeriyor");
        }
        else System.out.println("başlık amazon kelimesi içermiyor");

        if (driver.getCurrentUrl().equals("https://www.amazon.com/")){
            System.out.println("url doğru");
        }
        else System.out.println("url hatalı");

        driver.close();
    }
}
