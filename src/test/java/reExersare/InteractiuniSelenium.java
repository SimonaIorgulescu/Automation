package reExersare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InteractiuniSelenium {

    WebDriver driver;

    @BeforeMethod
    public void setUP(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test() {

        driver.get("https://demoqa.com/text-box");

        String fullNameValue = "Simona";
        String emailValue = "simona@gmail.com";
        String currentAddressValue = "Bucuresti";
        String permanentAddressValue = "Bucuresti";

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submit = driver.findElement(By.className("btn-primary"));

        fullName.sendKeys(fullNameValue);
        email.sendKeys(emailValue);
        currentAddress.sendKeys(currentAddressValue);
        permanentAddress.sendKeys(permanentAddressValue);

        submit.click();

        String outputName = driver.findElement(By.xpath("//p[@id='name']")).getText();
        String outputEmail = driver.findElement(By.xpath("//p[@id='email']")).getText();
        String outputCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
        String outputPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();

        System.out.println(outputName);
        System.out.println(outputEmail);
        System.out.println(outputCurrentAddress);
        System.out.println(outputPermanentAddress);

        Assert.assertTrue(outputName.contains(fullNameValue),"Output name is not correct");
        Assert.assertTrue(outputEmail.contains(emailValue),"Output email is not correct");
        Assert.assertTrue(outputCurrentAddress.contains(currentAddressValue),"Output Current Address is not correct");
        Assert.assertTrue(outputPermanentAddress.contains(permanentAddressValue),"Output Permanent Address is not correct");

        boolean display = submit.isDisplayed();
        boolean enabled = submit.isEnabled();

        Assert.assertTrue(display,"Button is not displayed");
        Assert.assertTrue(enabled,"Button is not enabled");
    }

    @Test
    public void buttonsPage(){

        driver.get("https://demoqa.com/buttons");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();

        WebElement outputClickMeMessage = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));

        boolean outputClickMe = outputClickMeMessage.isDisplayed();
        Assert.assertTrue(outputClickMe,"Message is not displayed");

        String dynamicClickMessage = outputClickMeMessage.getText();
        Assert.assertEquals(dynamicClickMessage,"You have done a dynamic click","Output message is not correct");

    }

    @Test
    public void changeName(){

        driver.get("https://demoqa.com/text-box");

        String fullNameValue1 = "Simona";
        String fullNameValue2 = "Iorgulescu";
        String emailValue = "simona@email.com";

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(fullNameValue1);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(emailValue);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        fullName.clear();
        fullName.sendKeys(fullNameValue2);

    }
}
