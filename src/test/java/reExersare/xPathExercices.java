package reExersare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class xPathExercices {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
    }

    @Test
    public void checkBoxHome() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.xpath("//span[@role='checkbox']"));
        checkBox.click();

        WebElement textHome = driver.findElement(By.xpath("//span[contains(text(), 'Home')]"));
        textHome.getText();

        String text = textHome.getText();

        Assert.assertEquals(text,"Home","Text is incorrect");

    }

}

