package reExersare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    // Before Method - inainte de fiecare test, se executa instructiunea mea de cod
    // After Method - dupa fiecare test, se executa instructiunea mea de cod
    // Before All si After All - se executa o singura data per clasa

    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }

    @Test
    public void searchTest(){
        driver.findElement(By.xpath("//*[text()='Acceptă tot']")).click();

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).submit();
    }

    @Test
    public void searchWikipedia(){
        driver.findElement(By.xpath("//*[text()='Acceptă tot']")).click();

        driver.findElement(By.name("q")).sendKeys("Wikipedia");
        driver.findElement(By.name("q")).submit();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
