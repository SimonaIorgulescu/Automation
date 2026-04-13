package reExersare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits2 {

    public WebElement waitForElementVisible(By locator){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement elementClickable(By locator){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean textToBePresent(By locator, String s){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,""));
    }

    WebDriver driver;

    @BeforeMethod
            public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void visibilityOfElement(){

        WebElement buttonVisible = waitForElementVisible(By.id("visibleAfter"));

        boolean buttonDisplayed = buttonVisible.isDisplayed();

        Assert.assertTrue(buttonDisplayed,"Button is not visible after 5 seconds");

    }

    @Test
    public void buttonClickable(){

        WebElement button = elementClickable(By.id("enableAfter"));

        boolean buttonIsEnabled = button.isEnabled();

        Assert.assertTrue(buttonIsEnabled,"Button is not enabled after 5 seconds");
    }

    @Test
    public void textIsPresent(){

        boolean textIsPresent = textToBePresent(By.id("visibleAfter"),"Visible After 5 Seconds");

        Assert.assertTrue(textIsPresent,"Text is not present or correct");
    }
}
