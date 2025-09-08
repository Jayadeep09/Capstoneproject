package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Headerlinks {
	WebDriver driver;
	@Given("open website in default browser")
	public void open_website_in_default_browser() {
		   driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	   
	}

	@When("click on sign and signin")
	public void click_on_sign_and_signin() {
		Pageclass pg=new Pageclass(driver);
		pg.login();
	}

	@When("navigate to offers")
	public void navigate_to_offers() {
		Pageclass pg=new Pageclass(driver);
		pg.clickOffers();
		pg.clickLogo();
	   
	}

	@When("navigate to favourites")
	public void navigate_to_favourites() {
		Pageclass pg=new Pageclass(driver);
		pg.addToFavourites();
        pg.clickFavourites();
        pg.clickLogo();
        pg.addToFavourites();
		
	}

	@When("navigate to orders")
	public void navigate_to_orders() {
		
		Pageclass pg=new Pageclass(driver);
		pg.addItemToCart();
        pg.addQuantity();
        pg.removeQuantity();
        pg.clickBuy();
        pg.AddressInfo();
        pg.clickContinue();
        pg.downloadPdf();
        pg.continueShopping();
		pg.clickOrders();
		pg.clickLogo();
	    
	}

	@Then("close the browser4")
	public void close_the_browser4() {
	    driver.close();
	    System.out.println("Header links clicked");
	}

}
