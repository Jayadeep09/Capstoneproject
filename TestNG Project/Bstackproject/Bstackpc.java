package Bstackproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Bstackpc{
    
    WebDriver driver;
    pageclass page;
    
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://bstackdemo.com/");    
        driver.manage().window().maximize();
        page = new pageclass(driver);
    }
    
    @Test(priority=1)
    public void Signin() {
        page.login();
    }
    
   @Test(priority=2)
    public void favourites() {
        page.addToFavourites();
        page.clickFavourites();
        page.clickLogo();
        page.addToFavourites();
    }
    
    @Test(priority=3)
    public void Addtocart() {
        page.addItemToCart();
        page.closeCart();
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,-200)");
    }
    
    @Test(priority=4)
    public void Removefromcart() {
        page.openCart();
        page.removeItemFromCart();
        page.closeCart();
        
    }
    
    @Test(priority=5)
    public void Filters() {
        page.filter();
    }
    
    @Test(priority=6)
    public void Search() {
        page.searchFor();
    }
    
    @Test(priority=7)
    public void FooterLinks() {
        page.clickPrivacyPolicy();
    }
    
    @Test(priority=8)
    public void Vendors() {
        page.Samsung();
        page.Samsung();
        page.Google();
        page.Google();
        page.OnePlus();
        page.Apple();
        page.Apple();
        page.OnePlus();
    }
    
    @Test(priority=9)
    public void HeaderLinks() {
        page.clickOffers();
        page.clickOrders();
        page.clickFavourites();
        page.clickLogo();
    }
    
    @Test(priority=10)
    public void Checkout() {
        
        page.addItemToCart();
        page.addQuantity();
        page.removeQuantity();
        page.clickBuy();
        page.AddressInfo();
        page.clickContinue();
        page.downloadPdf();
        page.continueShopping();
    }
    
    @Test(priority=11)
    public void Subscribeletter() {
        page.NewsletterEmail();
    }
    
    @Test(priority=12)
    public void Logout() {
        page.logout();
    }
    
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}