package Tema6;

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

public class Exercise5and6 {

    // am pus niste teste din temele mai vechi si am adaugat pentru ele Groups si Priorities

    // Exercitiul 5
//    Creaza cateva teste simple (la alegere, cu body complet si Assert), seteaza prioritati incepand de la -1
    // Exercitiul 6
    //Creaza cateva teste simple (la alegere, cu body complet si Assert), seteaza groups si ruleaza-le dintr-un fisier .xml


    WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void setUP() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test(groups = {"smoke"},priority = -1)
    public void exercise1(){

        driver.get("https://practicesoftwaretesting.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement filter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(., 'Sander')]/child::input")));
        filter.click();

        String product1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[text()=' Sheet Sander ']"))).getText();
        String product2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[text()=' Belt Sander ']"))).getText();

        boolean productTitle1 = product1.contains("Sander");
        boolean productTitle2 = product2.contains("Sander");

        Assert.assertTrue(productTitle1,"Product is filtered incorrectly");
        Assert.assertTrue(productTitle2,"Product is filtered incorrectly");
    }

    @Test(groups = {"smoke","regression"},priority = 0)
    public void exercise2(){

        driver.get("https://practicesoftwaretesting.com/");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        WebElement product = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='col-md-9']/child::div/child::a")));
        product.click();

        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-add-to-cart")));
        addToCartButton.click();

        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='cart']")));
        cart.click();

        WebElement productPresentInCart = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class='col-md-4']")));
        System.out.println(productPresentInCart.getText());

        Assert.assertTrue(productPresentInCart.isDisplayed(),"Product is not in cart");

        WebElement quantity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-test='product-quantity']")));
        String valueStr = quantity.getAttribute("value");

        int quantityOfProducts = Integer.parseInt(valueStr);

        Assert.assertTrue(quantityOfProducts == 1);

    }

    @Test(groups = {"smoke","regression"},priority = 1)
    public void testCase() {

        driver.get("https://practicesoftwaretesting.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search-query']")));
        search.sendKeys("Hammer");

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-test='search-submit']")));
        searchButton.click();

        WebElement productHammer = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-test='search_completed']/child::a/following-sibling::a")));
        productHammer.click();

        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-test='add-to-cart']")));
        addToCartButton.click();

        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='cart']")));
        cart.click();

        WebElement productPresentInCart = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class='col-md-4']")));
        System.out.println(productPresentInCart.getText());

        Assert.assertTrue(productPresentInCart.isDisplayed(),"Product is not in cart");

        WebElement quantity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-test='product-quantity']")));
        String valueStr = quantity.getAttribute("value");

        int quantityOfProducts = Integer.parseInt(valueStr);

        Assert.assertTrue(quantityOfProducts == 1);

        WebElement totalPrice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@data-test='cart-total']")));

        Assert.assertTrue(totalPrice.isDisplayed());

    }
}


