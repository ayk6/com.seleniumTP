package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com");
        // sign in butonuna bas
        WebElement signIn = driver.findElement(By.id("sign-in"));
        signIn.click();
        // e-mail, password, sign in butonlarını bul
        WebElement eMailText=driver.findElement(By.id("session_email"));
        WebElement passText=driver.findElement(By.id("session_password"));
        WebElement signButton=driver.findElement(By.name("commit"));

        eMailText.sendKeys("testtechproed@gmail.com");
        passText.sendKeys("Test1234!");
        signButton.click();

        // user id mail ile eşleşti mi kontrol et
        String expMail = "testtechproed@gmail.com";
        WebElement userID= driver.findElement(By.className("navbar-text"));
        System.out.println(userID.getText());

        if (expMail.equals(userID.getText())){
            System.out.println("mail ile user id eşleşti");
        } else System.out.println("mail ile user id eşleşmedi");

        // Adresses ve Sign Out textleri mevcut mu kontrol et
        // isDisplayed istenen veri görünüyor mu kontrol eder boolean döndürür
        WebElement adresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));

        if (adresses.isDisplayed()){
            System.out.println("Adresses test passed");
        }else System.out.println("Adresses test failed");

        if (signOut.isDisplayed()){
            System.out.println("Sign Out test passed");
        }else System.out.println("Sign Out test failed");

        // 3. sayfada kaç link var yazdır
        List<WebElement> linkCount= driver.findElements(By.tagName("a"));
        System.out.println("3. sayfa link sayısı : "+linkCount.size());
        for (WebElement each : linkCount){
            System.out.println(each.getText());
        }
        driver.close();

    }
}
