import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tema3 {

    // Exercitiu Bonus

//    Pornind de la: https://demoqa.com/radio-button
//    a. Selectează radio button Yes
//    Condiții:
//            ● Fără ID direct
//            ● Fără XPath absolut
//            ● Să fie stabil
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
    }


    @Test
    public void selectRadioButton(){

        WebElement selectYesOption = driver.findElement(By.xpath("//input[@id='yesRadio']"));
        selectYesOption.click();

        WebElement checkClick = driver.findElement(By.xpath("//p[@class='mt-3']"));
        checkClick.getText();

        String checkText = checkClick.getText();

        Assert.assertEquals(checkText,"You have selected Yes","Message is not the same");
        System.out.println(checkText);

//        WebElement checkClick = driver.findElement(By.xpath("//span[@class='text-success']"));

    }

    // Exercitiul 1 - Creaza un test, pornind de la URL-ul: https://demoqa.com/automation-practice-form
//    Gaseste campul First Name folosind Xpath, bazat pe placeholder
//    Introdu in acel camp valoarea “Test”
//    Gaseste campul Last Name folosing XPath bazat pe atributul id
//    Introdu valoarea “User”
//    Gaseste campul Email folosing XPath bazat pe atributul id
//    Introdu textul “test@email.com”
//    Apasa oricare din butoanele radio de la Gender
//    Introdu un numar de telefon in campul pentru Mobile
//    Introdu un text in campul pentru ‘Subjects’
//    Introdu un text in campul pentru ‘Current Address’
//    Gaseste butonul Submit dupa text si apasa folosind click
//    BONUS optional: verifica aparitia pop-up-ului de confirmare si apasa pe butonul Close


    @Test
    public void form(){

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Test");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("User");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("test@email.com");

        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
        femaleRadioButton.click();

        WebElement phoneNumber = driver.findElement(By.xpath("//input[contains(@placeholder, 'Number')]"));
        phoneNumber.sendKeys("0755223366");

        WebElement subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subject.sendKeys("Testing");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Bucuresti");

        WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);

        WebElement confirmationPopup = driver.findElement(By.xpath("//div[@class='modal-body']"));

        Assert.assertTrue(confirmationPopup.isDisplayed(),"Pop up is not displayed");

        WebElement popUp = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
        popUp.sendKeys(Keys.ESCAPE);

    }

    // Exercitiul 2
//    Creaza un test, pornind de la URL-ul https://demoqa.com/webtables
//    Da click pe butonul ‘Add’
//    Completeaza toate campurile din pop-up-ul care se deschide
//    Da click pe butonul Submit

    @Test
    public void webTables(){

        driver.get("https://demoqa.com/webtables");

        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Simona");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Iorgulescu");

        WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder, 'name@')]"));
        email.sendKeys("simona@gmail.com");

        WebElement age = driver.findElement(By.xpath("//input[@placeholder='Age']"));
        age.sendKeys("25");

        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.sendKeys("8000");

        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.sendKeys("Documentation");

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

    }
}
