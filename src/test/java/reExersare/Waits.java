package reExersare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits {

    WebDriver driver = new ChromeDriver();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    @Test
    public void test(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");


        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        button.click();

    }

    @Test
    public void test2(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");

        WebElement buttonVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

        boolean buttonDisplayed = buttonVisible.isDisplayed();

        Assert.assertTrue(buttonDisplayed,"Button is not visible after 5 seconds");

    }

    @Test
    public void test3(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");

        boolean textIsPresent = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("visibleAfter"),"Visible After 5 Seconds"));

        Assert.assertTrue(textIsPresent,"Text is not present or correct");
    }

}
