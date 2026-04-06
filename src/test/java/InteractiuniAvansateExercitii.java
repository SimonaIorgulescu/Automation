import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractiuniAvansateExercitii {

    WebDriver driver;

    @Test
    public void testDropDownSelect(){

        driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");

        // selecteaza culoarea Blue
        WebElement selectDropDownLocator = driver.findElement(By. id("oldSelectMenu"));
        Select dropdown = new Select(selectDropDownLocator);

        dropdown.selectByVisibleText("Blue");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //selecteaza culoarea yellow folosing value

        dropdown.selectByValue("3");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //selecteaza culoarea purple folosing index

        dropdown.selectByIndex(4);

        String selectedOptionText = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOptionText,"Purple");
        System.out.println("Optiunea selectata nu este Purple");


        }

    @Test
    public void dropdownNew() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        WebElement dropdown = driver.findElement(By.className("css-13cymwt-control"));

        dropdown.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement option1 = driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));

        option1.click();

    }
}
