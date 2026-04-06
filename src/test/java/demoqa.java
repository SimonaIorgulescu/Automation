import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoqa {

    @Test
    public void textBoxTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAdrress = driver.findElement(By.id("permanentAddress"));

        WebElement submit = driver.findElement(By.id("submit"));

        fullName.sendKeys("Simona");
        email.sendKeys("test@itschool.com");
        currentAddress.sendKeys("Bucuresti");
        permanentAdrress.sendKeys("Bucuresti");
        submit.click();


        WebElement output = driver.findElement(By.id("output"));

//        Assert.assertTrue(output.isDisplayed());

        String outputName = driver.findElement(By.id("name")).getText();

        System.out.println(outputName);

        Assert.assertTrue(outputName.contains("Simona"),"Output name nu este corect");

    }
}
