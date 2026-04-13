import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema4 {


    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @BeforeMethod
    public void setUP(){
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
    }


    // Exercitiul 1
//    Creează un test care:
//    a. Deschide aplicația https://practicesoftwaretesting.com/
//    b. Verifică titlul paginii.
//    c. Verifică dacă logo-ul aplicației este vizibil.

    @Test
    public void test1(){

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice Software Testing - Toolshop - v5.0";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not correct");


        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navbar-brand']")));
        Assert.assertTrue(logo.isDisplayed());
    }

    // Exrcitiul 2
//    Creează un test pentru căutarea unui produs
//    a. Identifică search bar.
//    b. Introdu textul “hammer”
//    c. Apasă Enter sau butonul de căutare.
//    d. Așteaptă afișarea rezultatelor.
//    e. Verifică dacă apare cel puțin un produs în listă.

    @Test
    public void test2(){

        WebElement searchBar = driver.findElement(By.xpath("//input[@id='search-query']"));
        searchBar.sendKeys("hammer");


        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search ']"));
        searchButton.click();

        WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test='search_completed']")));
        int productList = driver.findElements(By.xpath("//a[contains(@data-test,'product')]")).size();
        Assert.assertTrue(productList > 0, "No results appear");

    }


    // Exercitiul 3
//    Creează un test pentru deschiderea unui produs
//    a. Deschide pagina principală.
//    b. Așteaptă încărcarea produselor.
//    c. Apasă pe primul produs din listă.
//    d. Verifică dacă:
//       I. imaginea produsului este vizibilă
//       II. butonul Add to cart este vizibil.

    @Test
    public void test3(){

        WebElement mainPageProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-9']//child::div")));
        WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@data-test,'product')])[1]")));
        firstProduct.click();

        WebElement productImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@class,'figure-img')]")));
        Assert.assertTrue(productImage.isDisplayed(),"Image is not visible");

        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='btn-add-to-cart']"));
        Assert.assertTrue(addToCartButton.isDisplayed(),"Button is not visible");
    }

    // Exercitiul 4
//    Creează un test pentru filtrarea produselor
//    a. Deschide pagina principală
//    b. Selectează un filtru (ex: brand sau categorie)
//    c. Așteaptă actualizarea listei
//    d. Verifică dacă produsele afișate respectă filtrul

    @Test
    public void test4(){

        WebElement filter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(., 'Wrench')]")));
        filter.click();

        //WebElement filter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='checkbox']/following-sibling::div/following-sibling::div/child::label/child::input")));


        //WebElement filteredProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test='filter_completed']")));

        WebElement filteredProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()=' Adjustable Wrench ']")));
        Assert.assertTrue(filteredProducts.getText().contains("Wrench"));

    }

}
