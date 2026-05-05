package Tema8.Exercitiul8;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void login(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

}
