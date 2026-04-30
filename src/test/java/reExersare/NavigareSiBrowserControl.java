package reExersare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigareSiBrowserControl {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void exercitiuNavigare1(){
        driver.get("https://demoqa.com/");


        String title = driver.getTitle();
        System.out.println(title);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.navigate().to("https://demoqa.com/elements");

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.navigate().back();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.navigate().forward();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.navigate().refresh();


    }

    @Test
    public void tabs(){
        driver.get("https://demoqa.com/");

        String originalTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/forms");

        driver.switchTo().window(originalTab);

    }

    @Test
    public void testCase(){
        driver.get("https://demoqa.com/");

        driver.navigate().to("https://demoqa.com/elements");
        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title, "demosite", "Title is not correct");

        driver.navigate().to("https://demoqa.com/forms");
        driver.navigate().back();

        String url = driver.getCurrentUrl();
        System.out.println(url);

        Assert.assertTrue(url.contains("elements"),"URL does not contain expected word");

        driver.navigate().forward();
        driver.navigate().refresh();

    }

    @Test
    public void exercitiu(){
        driver.get("https://demoqa.com/");

        driver.navigate().to("https://demoqa.com/alertsWindows");
        String title = driver.getTitle();

        driver.navigate().to("https://demoqa.com/widgets");

        driver.navigate().back();
        driver.navigate().back();

        String finalTitle = driver.getTitle();

        Assert.assertTrue(title.equals(finalTitle));
    }

//    1. Deschide https://demoqa.com/
//    2. Deschide 3 tab-uri
//    3. Navigheaza in fiecare la o sectiune diferita
//      a. Elements
//      b. Forms
//      c. Alerts
//    4. Printeaza  titlul fiecarei pagini

    @Test
    public void exercitiu2(){
        driver.get("https://demoqa.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/elements");

        title = driver.getTitle();
        System.out.println(title);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/forms");

        title = driver.getTitle();
        System.out.println(title);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/alertsWindows");

        title = driver.getTitle();
        System.out.println(title);

        driver.close();
        driver.quit();


    }


}
