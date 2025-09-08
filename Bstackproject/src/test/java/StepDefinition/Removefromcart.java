package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Removefromcart {
	WebDriver driver;
	
	@Given("Open homepage in default browser")
	public void open_homepage_in_default_browser() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	    
	}

	@When("click on sign in and then login")
	public void click_on_sign_in_and_then_login() {
		Pageclass pg=new Pageclass(driver);
		pg.login();
	}

	@When("add an item to cart")
	public void add_an_item_to_cart() {
		Pageclass pg=new Pageclass(driver);
		pg.addItemToCart();
		pg.addQuantity();
		pg.removeQuantity();
		pg.closeCart();
	   
	}

	@When("remove the item from cart")
	public void remove_the_item_from_cart() {
		Pageclass pg=new Pageclass(driver);
		pg.openCart();
		pg.removeItemFromCart();
		
		
	}

	@Then("close the cart popup")
	public void close_the_cart_popup() {
		Pageclass pg=new Pageclass(driver);
		pg.closeCart();
		driver.close();
		System.out.println("Item removed from cart");
	}
	

}
