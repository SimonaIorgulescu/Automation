package Tema2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercitiul3si4si5 {


//    3. Creaza o clasa care are doua teste: unul care navigheaza la https://example.com/ si inchide browserul;
//    unul care navigheaza la https://www.apple.com/ si inchide browserul.
//    4. Refactorizeaza clasa de la exercitiul 3 sa foloseasca @BeforeMethod si @AfterMethod
//    5. Creaza un test prin care se navigheaza la https://example.com si verifica:
//       -Titlul nu este null
//       -Titlul contine ‘Example’


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void navigate1(){
        driver.get("https://discord.com/");


    }

    @Test
    public void navigate2(){

        driver.get("https://www.apple.com/");

    }

    @Test
    public void verifyTitleNotNull(){
        driver.get("https://discord.com/");

        String title = driver.getTitle();
        Assert.assertNotNull(title,"Title is not null");
        Assert.assertTrue(title.contains("Discord"),"The title does not contain expected word");
        System.out.println("Title contains the expected word");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
