package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Filters {
	WebDriver driver;
	@Given("open the homepage in default browser")
	public void open_the_homepage_in_default_browser() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	
	}

	@When("selct multiple selections using dropdown")
	public void selct_multiple_selections_using_dropdown() {
		Pageclass pg=new Pageclass(driver);
		pg.filter();
	}

	@Then("close the driver2")
	public void close_the_driver2() {
	   driver.close();
	   System.out.println("Filters completed");
	}
}
