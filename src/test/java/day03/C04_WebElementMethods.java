package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C04_WebElementMethods {
    public static void main(String[] args) {
        // amazon search bar'ı locate et
        // bar tag name input mu kontrol et
        // name attribute field-keywords mu kontrol et

        // getTagName() locate edilmiş elementin tagname'ini verir
        // getAttribute(attribute ismi) elementin attribute değerini verir

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");

        WebElement searchBar= driver.findElement(By.id("twotabsearchtextbox"));

        String expName ="input", actName=searchBar.getTagName();
        if (expName.equals(actName)){
            System.out.println("tag name test passed");
        }else System.out.println("tag name test failed");

        String expnameAttribute ="field-keywords",
                actnameAttribute=searchBar.getAttribute("name");
        if (expnameAttribute.equals(actnameAttribute)){
            System.out.println("name attribute test passed");
        }else System.out.println("name attribute test failed");

        driver.close();


    }
}
