package Tema2;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercitiul1si2 {

    //    1. Deschide un site -> deschide browser, navigheaza catre un URL (la alegere), inchide browserul
    // 2. Verifica titlul paginii -> deschide URL-ul (la alegere, sau https://example.com/), ia titlul paginii, verifica cu Assert titlul
   //  Hint: getTitle(), Assert.assertTrue

    WebDriver driver;

    // EXERCITIUL 1

    @Test
    public void openWebSite(){

        driver = new ChromeDriver();
        driver.get("https://discord.com/");

        driver.quit();
    }

    // EXERCITIUL 2

    @Test
    public void verifyTitle(){

        driver = new ChromeDriver();
        driver.get("https://discord.com/");

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Discord - Group Chat That’s All Fun & Games";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        driver.quit();

    }

}
