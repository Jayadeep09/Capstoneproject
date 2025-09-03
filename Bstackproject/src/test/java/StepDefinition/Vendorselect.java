package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Vendorselect {
	WebDriver driver;
	
	@Given("open home page in defaults browser")
	public void open_home_page_in_defaults_browser() {
		 driver=new ChromeDriver();
		  driver.get("https://bstackdemo.com/");	
		  driver.manage().window().maximize();
	    
	}

	@When("select vendors and deselect vendors")
	public void select_vendors_and_deselect_vendors() {
		Pageclass pg=new Pageclass(driver);
		 pg.Samsung();
	        pg.Samsung();
	        pg.Google();
	        pg.Google();
	        pg.OnePlus();
	        pg.Apple();
	        pg.Apple();
	        pg.OnePlus();
	}

	@Then("close the driveer")
	public void close_the_driveer() {
		driver.close();
		System.out.println("Vendors selection completed");
	}

}
