package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
	WebDriver driver;
	@Given("open homepage in the default browser window")
	public void open_homepage_in_the_default_browser_window() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("click on signin link and then sign in")
	public void click_on_signin_link_and_then_sign_in() {
		Pageclass pg=new Pageclass(driver);
		pg.login();
	}

	@When("add a product to cart and click on checkout")
	public void add_a_product_to_cart_and_click_on_checkout() {
		Pageclass page=new Pageclass(driver);
		page.addItemToCart();
        page.addQuantity();
        page.removeQuantity();
        page.clickBuy();
        
        
       
       
	}

	@When("add all information and click on continue")
	public void add_all_information_and_click_on_continue() {
		Pageclass page=new Pageclass(driver);
		page.AddressInfo();
		page.clickContinue();
	}

	@When("click on download pdf")
	public void click_on_download_pdf() {
		Pageclass page=new Pageclass(driver);
		 page.downloadPdf();
	}

	@When("click on continue shopping")
	public void click_on_continue_shopping() {
		Pageclass page=new Pageclass(driver);
		 page.continueShopping();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    System.out.println("Checkout process completed");
	}
}
