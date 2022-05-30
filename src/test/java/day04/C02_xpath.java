package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // click add element
        //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        // tag önemli olmadığında * kullanılabilir (//*[text()='Add Element'])

        // delete button is displayed?
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("delete button test passed");
        } else System.out.println("delete button test failed");
        deleteButton.click();

        // add/remove elements is displayed?

        WebElement addRemmove = driver.findElement(By.xpath("//h3"));
        if (addRemmove.isDisplayed()) {
            System.out.println("add/remove button test passed");
        } else System.out.println("add/remove button test failed");

        driver.close();
    }
}
