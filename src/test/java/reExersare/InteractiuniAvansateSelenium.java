package reExersare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class InteractiuniAvansateSelenium {

    WebDriver driver = new ChromeDriver();


    @Test
    public void dropDownSelect(){
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        //selecteaza culoarea Blue

        WebElement selectDropDownLocator = driver.findElement(By.id("oldSelectMenu"));
        Select dropDown = new Select(selectDropDownLocator);

        dropDown.selectByVisibleText("Blue");

        //Selecteaza culoarea Yellow

        dropDown.selectByValue("3");

        //Selecteaza culoarea Purple

        dropDown.selectByIndex(4);

        String selectedOptionText = dropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOptionText,"Purple","Selected option is not Purple");
    }

    @Test
    public void dropDownNew(){
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.className("css-13cymwt-control"));
        dropDown.click();

        WebElement option1 = driver.findElement(By.id("react-select-2-option-0-0"));
        option1.click();

    }

    @Test
    public void checkboxTest(){
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), 'MightyCraft Hardware')]/child::input")));
        WebElement checkBox = driver.findElement(By.xpath("//label[contains(text(), 'MightyCraft Hardware')]/child::input"));
        checkBox.click();
        checkBox.click();

        if(checkBox.isSelected() == true){
            System.out.println("Is selected");
        }else {
            System.out.println("Is not selected");
            checkBox.click();
        }

        Assert.assertTrue(checkBox.isSelected(), "Checkbox is not selected");
    }

    @Test
    public void radioButtons(){
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement buttonYes = driver.findElement(By.id("yesRadio"));

        WebElement buttonImpressive = driver.findElement(By.id("impressiveRadio"));

        buttonYes.click();
        buttonImpressive.click();
    }

    @Test
    public void uploadDownload(){
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
        uploadButton.sendKeys("C:\\Users\\Simona\\Desktop\\blabla.txt.TXT");
    }

    @Test
    public void clickActions(){
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickButton).perform();

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(rightClickButton).perform();
    }

    @Test
    public void testCase(){
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(dropDown);
        select.selectByValue("1");

        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption,"Blue","Selected option is correct");

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement doubleClickMeButton = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickMeButton).perform();

        WebElement rightClickMeButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMeButton).perform();

        String doubleClickMeMessage = driver.findElement(By.id("doubleClickMessage")).getText();
        String rightClickMeMessage = driver.findElement(By.id("rightClickMessage")).getText();

        String doubleClickMessage = "You have done a double click";
        String rightClickMessage = "You have done a right click";

        Assert.assertEquals(doubleClickMeMessage,doubleClickMessage,"Message is not correct");
        Assert.assertEquals(rightClickMeMessage,rightClickMessage,"Message is not correct");
    }

    @Test
    public void priceFilter(){
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();

        WebElement sortDropDown = driver.findElement(By.xpath("//select[@aria-label='sort']"));

        Select select = new Select(sortDropDown);
        select.selectByValue("price,desc");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@data-test='product-price'])[1]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@data-test='product-price'])[2]")));

        String firstProduct = driver.findElement(By.xpath("(//span[@data-test='product-price'])[1]")).getText();
        String secondProduct = driver.findElement(By.xpath("(//span[@data-test='product-price'])[2]")).getText();

        System.out.println(firstProduct);
        System.out.println(secondProduct);

        firstProduct = firstProduct.replace("$","");
        secondProduct = secondProduct.replace("$","");

        System.out.println(firstProduct);
        System.out.println(secondProduct);

        double firstPrice = Double.parseDouble(firstProduct);
        double secondPrice = Double.parseDouble(secondProduct);

        Assert.assertTrue(firstPrice > secondPrice,"First price is not bigger that the second one");
    }

}
