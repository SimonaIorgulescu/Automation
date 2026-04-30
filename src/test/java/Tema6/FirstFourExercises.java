package Tema6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FirstFourExercises {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    // Exercitiul 1
//    Creează un test care:
//     -deschide un site
//     -deschide un tab nou (WindowType.TAB)
//     -accesează alt site în noul tab
//     -Afișează titlul ambelor taburi


    @Test(priority = 0)
    public void exercitiu1(){

        driver.get("https://demoqa.com/");
        String title = driver.getTitle();
        System.out.println(title);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://practicesoftwaretesting.com/");

        title = driver.getTitle();
        System.out.println(title);
    }

    // Exercitiul 2
//    Creează un test care:
//     -deschide 2 taburi
//     -salvează windowHandles
//     -navighează între ele
//     -Verifică titlul fiecărui tab folosind Assert

    @Test(priority = 1)
    public void exercitiu2(){

        driver.get("https://demoqa.com/");
        String firstTab = driver.getWindowHandle();
        String firstSiteTitle = driver.getTitle();
        System.out.println(firstSiteTitle);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://practicesoftwaretesting.com/");

       String secondTab = driver.getWindowHandle();
        String secondSiteTitle = driver.getTitle();
        System.out.println(secondSiteTitle);

       driver.switchTo().window(firstTab);
       driver.switchTo().window(secondTab);

        Assert.assertEquals(firstSiteTitle,"demosite","Title is not correct");
        Assert.assertEquals(secondSiteTitle,"Practice Software Testing - Toolshop - v5.0","Title is not correct");
    }

    // Exercitiul 3
//    Creează un test care:
//     -deschide 2 taburi
//     -închide unul cu driver.close()
//     -revine pe tabul principal
//     -Verifică dacă încă ești pe pagina corectă
//     -Ruleaza testul folosing fisier .xml

    @Test(groups = {"smoke"},priority = 2)
    public void exercitiu3(){

        driver.get("https://demoqa.com/");
        String originalTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://practicesoftwaretesting.com/");
        driver.close();

        driver.switchTo().window(originalTab);

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains("demoqa"));

    }

    // Exercitiul 4
//    Creează un test care:
//     1. Deschide https://practicesoftwaretesting.com/
//     2. Navighează pe o categorie
//     3. Deschide produsul într-un tab nou
//     4. Revine în tabul principal
//     5. Face refresh
//     6. Adauga:
//       - @BeforeMethod
//       - @AfterMethod
//       - Assert
//     7. Ruleaza testul folosind un fisier .xml

    @Test(groups = {"smoke"},priority = 3)
    public void exercitiu4(){

        driver.get("https://practicesoftwaretesting.com/");

        String firstTab = driver.getWindowHandle();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement filter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()=' Hammer ']/child::input")));
        filter.click();

        Actions actions = new Actions(driver);

        WebElement firstItem = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-test='filter_completed']/child::a")));

        actions.keyDown(Keys.CONTROL).click(firstItem).keyUp(Keys.CONTROL).build().perform();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.switchTo().window(firstTab);

        driver.navigate().refresh();

        String currentURL = driver.getCurrentUrl();

        Assert.assertTrue(currentURL.contains("practicesoftware"),"Not on correct site");
    }
}
