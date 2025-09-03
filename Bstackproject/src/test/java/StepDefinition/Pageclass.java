package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageclass {
    WebDriver driver;
    WebDriverWait wait;
    
    By signin = By.id("signin");
    By username = By.id("username");
    By demouser = By.xpath("//div[text()='demouser']");
    By password = By.id("password");
    By passwordText = By.xpath("//div[text()='testingisfun99']");
    By loginBtn = By.id("login-btn");
    By favouriteBtn = By.xpath("//*[@id=\"1\"]/div[1]/button");
    By favourites = By.id("favourites");
    By logo = By.className("Navbar_logo__26S5Y");
    By addToCart = By.xpath("//*[@id=\"1\"]/div[4]");
    By closeCart = By.className("float-cart__close-btn");
    By cartIcon = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/span");
    By removeFromCart = By.cssSelector("div[class=\"shelf-item__del\"]");
    By dropdown = By.cssSelector("div>select");
    By search = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/input");
    By searchButton = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/button");
    By privacyPolicy = By.cssSelector("span>a");
    By samsung = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span");
    By google = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span");
    By oneplus = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span");
    By apple = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span");
    By offers = By.cssSelector("a[id=\"offers\"]");
    By orders = By.cssSelector("a[id=\"orders\"]");
    By addQuantity = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[4]/div/button[2]");
    By removeQuantity = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[4]/div/button[1]");
    By buyBtn = By.cssSelector("div[class=\"buy-btn\"]");
    By firstName = By.id("firstNameInput");
    By lastName = By.id("lastNameInput");
    By address = By.id("addressLine1Input");
    By province = By.id("provinceInput");
    By postCode = By.id("postCodeInput");
    By continueBtn = By.id("checkout-shipping-continue");
    By downloadpdf = By.id("downloadpdf");
    By continueshopping = By.xpath("//*[@id=\"checkout-app\"]/div/div/div/div/a/button");
    By newsletterEmail = By.id("newsletter-email");




	public Pageclass(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
   
    
    public void login() {
    	wait.until(ExpectedConditions.elementToBeClickable(signin)).click();
        wait.until(ExpectedConditions.elementToBeClickable(username)).click();
        wait.until(ExpectedConditions.elementToBeClickable(demouser)).click();
        wait.until(ExpectedConditions.elementToBeClickable(password)).click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordText)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
    
    public void addToFavourites() {
        wait.until(ExpectedConditions.elementToBeClickable(favouriteBtn)).click();
    }
    
    public void clickFavourites() {
        wait.until(ExpectedConditions.elementToBeClickable(favourites)).click();
    }
    
    public void clickLogo() {
        wait.until(ExpectedConditions.elementToBeClickable(logo)).click();
    }

    public void addItemToCart() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }
    
    public void closeCart() {
    	
        wait.until(ExpectedConditions.elementToBeClickable(closeCart)).click();
       
    }
    
    public void openCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    }
    
    public void removeItemFromCart() {
        wait.until(ExpectedConditions.elementToBeClickable(removeFromCart)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
    }
    
    public void filter() {
    WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
   	  Select pdropdown=new Select(dropdownElement);
   	  pdropdown.selectByValue("lowestprice");
   	  pdropdown.selectByIndex(2);
   	  pdropdown.selectByVisibleText("Select");
   	  
    }
    
   
    
    public void searchFor(String s) {
        WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        searchElement.sendKeys(s);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }
    
    public void clickPrivacyPolicy() {
        wait.until(ExpectedConditions.elementToBeClickable(privacyPolicy)).click();
    }
    
    public void Samsung() {
        wait.until(ExpectedConditions.elementToBeClickable(samsung)).click();
    }
    
    public void Google() {
        wait.until(ExpectedConditions.elementToBeClickable(google)).click();
    }
    
    public void OnePlus() {
        wait.until(ExpectedConditions.elementToBeClickable(oneplus)).click();
    }
    
    public void Apple() {
        wait.until(ExpectedConditions.elementToBeClickable(apple)).click();
    }
    
    public void clickOffers() {
        wait.until(ExpectedConditions.elementToBeClickable(offers)).click();
    }
    
    public void clickOrders() {
        wait.until(ExpectedConditions.elementToBeClickable(orders)).click();
    }
    
    public void addQuantity() {
        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addQuantity));
        	addBtn.click();
            addBtn.click();
        
    }
    
    public void removeQuantity() {
        WebElement removeBtn =driver.findElement(removeQuantity);
        	removeBtn.click();
            removeBtn.click();
        
    }
    
    public void clickBuy() {
        wait.until(ExpectedConditions.elementToBeClickable(buyBtn)).click();
    }
    
    public void AddressInfo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Kota");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys("Jayadeep");
        wait.until(ExpectedConditions.visibilityOfElementLocated(address)).sendKeys("HIG-15,Near Nexus Mall ,KPHB,Hyderabad");
        wait.until(ExpectedConditions.visibilityOfElementLocated(province)).sendKeys("Telangana");
        wait.until(ExpectedConditions.visibilityOfElementLocated(postCode)).sendKeys("500085");
    }
    
    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }
    
    public void downloadPdf() {
        wait.until(ExpectedConditions.elementToBeClickable(downloadpdf)).click();
    }
    
    public void continueShopping() {
        wait.until(ExpectedConditions.elementToBeClickable(continueshopping)).click();
    }
    
    public void NewsletterEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newsletterEmail)).sendKeys("abc@gmail.com");
    }
    
    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(signin)).click();
    }
}