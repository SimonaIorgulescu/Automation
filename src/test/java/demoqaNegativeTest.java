import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoqaNegativeTest {


    @Test
    public void textBoxTestNegative() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAdrress = driver.findElement(By.id("permanentAddress"));

        WebElement submit = driver.findElement(By.id("submit"));

        fullName.sendKeys("Simona");
        email.sendKeys("test");
        currentAddress.sendKeys("Bucuresti");
        permanentAdrress.sendKeys("Bucuresti");
        submit.click();


        String classAttribute = email.getAttribute("class");
        System.out.println(classAttribute);

        Assert.assertTrue(classAttribute.contains("field-error"));
    }
}
