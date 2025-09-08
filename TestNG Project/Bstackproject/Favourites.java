package Bstackproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Favourites {
	
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://bstackdemo.com/");	
	  driver.manage().window().maximize();
	  
  }
  
  @Test(priority=1)
  public void Signin() throws InterruptedException {
	  WebElement k=driver.findElement(By.id("signin"));
	  k.click();

	  Thread.sleep(3000);
	   
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(3000);
  }
  
 
  @Test(priority=2)
  public void favourites() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("favourites")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.className("Navbar_logo__26S5Y")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]/button")).click();
	  Thread.sleep(3000);
  }
  
  
  @Test(priority=3)
  public void Addtocart() throws InterruptedException {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,200)");
	  driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.className("float-cart__close-btn")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(priority=4)
  public void Removefromcart() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/span")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("div[class=\"shelf-item__del\"]")).click();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.className("float-cart__close-btn")).click();
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,-200)");
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority=5)
  public void Filters() throws InterruptedException{
	  WebElement dropdown=driver.findElement(By.cssSelector("div>select"));
	  Select pdropdown=new Select(dropdown);
	  pdropdown.selectByValue("lowestprice");
	  Thread.sleep(2000);
	  pdropdown.selectByIndex(2);
	  Thread.sleep(2000);
	  pdropdown.selectByVisibleText("Select");
	  Thread.sleep(2000);
  }
 
  
  
 @Test(priority=6)
  public void Search() throws InterruptedException{
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/input"));
	  search.sendKeys("Apple");
	  WebElement sb=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/button"));
	  sb.click();
	  
  }
  
 @Test(priority=7)
  public void FooterLinks() throws InterruptedException{
	  WebElement pp=driver.findElement(By.cssSelector("span>a"));
	  pp.click();
	  Thread.sleep(2000);
  }
  
  
  
  @Test(priority=8)
  public void Vendors() throws InterruptedException {
	 Thread.sleep(2000); 
	  WebElement samsung=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span"));
	  samsung.click();
	  Thread.sleep(2000);
	  samsung.click();
	  Thread.sleep(2000);
	  WebElement Google=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span"));
	  Google.click();
	  Thread.sleep(2000);
	  Google.click();
	  
	  Thread.sleep(2000);
	  WebElement OnePlus=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span"));
	  OnePlus.click();
	  Thread.sleep(2000);
	  WebElement Apple=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span"));
	  Apple.click();
	  Thread.sleep(2000);
	 
	  Apple.click();
	  OnePlus.click();
	  
	  
	  
  }
  
  
  @Test(priority=9)
  public void HeaderLinks() throws InterruptedException {
	  WebElement offers=driver.findElement(By.cssSelector("a[id=\"offers\"]"));
	  offers.click();
	  Thread.sleep(2000);
	  
	  
	  WebElement Orders=driver.findElement(By.cssSelector("a[id=\"orders\"]"));
	  Orders.click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("favourites")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.cssSelector("a[class=\"Navbar_logo__26S5Y\"]")).click();
	  Thread.sleep(2000);
	  
  }
  @Test(priority=10)
  public void Checkout() throws InterruptedException {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,200)");
	  driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
	  Thread.sleep(3000);
	  WebElement addq=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[4]/div/button[2]"));
	  addq.click();
	  addq.click();
	  Thread.sleep(3000);
	  WebElement remq=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[4]/div/button[1]"));
	  remq.click();
	  remq.click();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
	  Thread.sleep(3000);
	  WebElement fn=driver.findElement(By.id("firstNameInput"));
	  fn.sendKeys("Kota");
	  WebElement ln=driver.findElement(By.id("lastNameInput"));
	  ln.sendKeys("Jayadeep");
	  WebElement add=driver.findElement(By.id("addressLine1Input"));
	  add.sendKeys("HIG-15,Near Nexus Mall ,KPHB,Hyderabad");
	  
	  WebElement state=driver.findElement(By.id("provinceInput"));
	  state.sendKeys("Telangana");
	  
	  WebElement pc=driver.findElement(By.id("postCodeInput"));
	  pc.sendKeys("500085");
	  driver.findElement(By.id("checkout-shipping-continue")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("downloadpdf")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/div/a/button")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(priority=11)
  public void Subscribeletter() throws InterruptedException{
	  WebElement em=driver.findElement(By.id("newsletter-email"));
	  em.sendKeys("abc@gmail.com");
	  Thread.sleep(2000);
	  
  }
  
  
  @Test(priority=12)
  public void Logout() throws InterruptedException {
	  driver.findElement(By.id("signin")).click();
	  Thread.sleep(2000);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  

}
