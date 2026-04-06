package reExersare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGoogle {

    // Sesiunea 6

    // @Test este o metoda
    //Pentru metode se foloseste intotdeauna "void"
    //Pentru metode se pun intotdeauna parantezele ()
    //Obiectele in Java, se definesc tot timpul cu litera mare la inceputul cuvantului

    @Test
    public void openGoogle(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }

}
