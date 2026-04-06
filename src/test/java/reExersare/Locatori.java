package reExersare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locatori {

    @Test
    public void textBoxTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAdrress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submit = driver.findElement(By.id("submit"));

        fullName.sendKeys("Simona");
        email.sendKeys("simona@gmail.com");
        currentAdrress.sendKeys("Bucuresti");
        permanentAddress.sendKeys("Bucuresti");

        submit.click();

        WebElement output = driver.findElement(By.id("output"));

        Assert.assertTrue(output.isDisplayed());
    }

    @Test
    public void textBoxTest2() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAdrress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submit = driver.findElement(By.className("btn-primary"));

        fullName.sendKeys("Simona");
        email.sendKeys("simona@gmail.com");
        currentAdrress.sendKeys("Bucuresti");
        permanentAddress.sendKeys("Bucuresti");

        submit.click();

        WebElement output = driver.findElement(By.id("output"));

        Assert.assertTrue(output.isDisplayed());

    }

    @Test
    public void getAttributeTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAdrress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submit = driver.findElement(By.className("btn-primary"));

        fullName.sendKeys("Simona");
        email.sendKeys("simona");
        currentAdrress.sendKeys("Bucuresti");
        permanentAddress.sendKeys("Bucuresti");

        submit.click();

        String classAttribute = email.getAttribute("class");

        System.out.println(classAttribute);

        Assert.assertTrue(classAttribute.contains("field-error"));

    }

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        WebElement doubleClickMeButton = driver.findElement(By.className("rc-tree-checkbox"));

        doubleClickMeButton.click();
    }

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickMeButton = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickMeButton = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickMeButton).perform();

        WebElement outputMessageDoubleClick = driver.findElement(By.id("doubleClickMessage"));

        Assert.assertTrue(outputMessageDoubleClick.isDisplayed());

        actions.contextClick(rightClickMeButton).perform();

        WebElement outputMessageRightClick = driver.findElement(By.id("rightClickMessage"));
        Assert.assertTrue(outputMessageRightClick.isDisplayed());

        WebElement clickMeButton = driver.findElement(By.xpath("//*[text()='Click Me']"));
        clickMeButton.click();

        WebElement outputMessageClick = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue(outputMessageClick.isDisplayed());
    }
}
