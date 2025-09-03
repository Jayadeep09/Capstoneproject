package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Favourites {
	
	WebDriver driver;

	@Given("Home page should be opened in default browser")
	public void home_page_should_be_opened_in_default_browser() {
	
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("Click on signlink and signin")
	public void click_on_signlink_and_signin() {
		Pageclass pg=new Pageclass(driver);
		pg.login();
	}

	@When("add an item to favourites")
	public void add_an_item_to_favourites() {
		Pageclass pg=new Pageclass(driver);
		pg.addToFavourites();
	
	}

	@When("check in favourites section")
	public void check_in_favourites_section() {
		Pageclass pg=new Pageclass(driver);
	    pg.clickFavourites();
	}

	@When("click on the logo")
	public void click_on_the_logo() {
		Pageclass pg=new Pageclass(driver);
	 pg.clickLogo();
	}

	@When("remove from favourites")
	public void remove_from_favourites() {
		Pageclass pg=new Pageclass(driver);
	   pg.addToFavourites();
	   
	}
	@Then("close the driver")
	public void close_the_driver() {
	    System.out.println("Favourites Done ");
	    driver.close();
	}
}
