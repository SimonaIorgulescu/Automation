package Tema8.Exercitiul8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(){
        WebDriver driver = new ChromeDriver();

        BasePage basePage = new BasePage(driver);

        basePage.openUrl("https://practicesoftwaretesting.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.openUrl("https://practicesoftwaretesting.com/");
        loginPage.login("simona111","Pisicicolorate1");

        driver.quit();

    }
}
