package AprofundareTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priorities {

    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void openHomePage(){

    }


    @Test(priority = 1)
    public void verifyTitle(){

    }


    @Test(priority = 2)
    public void verifyLoginButton(){

    }


    @Test(priority = 3)
    public void verifyFooter(){

    }


}
