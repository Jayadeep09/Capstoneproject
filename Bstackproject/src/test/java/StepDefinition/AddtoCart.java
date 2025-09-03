package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCart {
	WebDriver driver;
	@Given("Home page in default browser")
	public void home_page_in_default_browser() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("click on sign and signin with details")
	public void click_on_sign_and_signin_with_details() {
		Pageclass pg=new Pageclass(driver);
		pg.login();
	}

	@When("Add an item to cart")
	public void add_an_item_to_cart() {
		Pageclass pg=new Pageclass(driver);
		pg.addItemToCart();
	}

	@Then("close the popup")
	public void close_the_popup() {
		Pageclass pg=new Pageclass(driver);
		pg.closeCart();
		driver.close();
		System.out.println("Item Added to cart ");
	    
	}
}
