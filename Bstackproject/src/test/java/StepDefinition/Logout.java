package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	WebDriver driver;
	@Given("open browser stack website in default browser")
	public void open_browser_stack_website_in_default_browser() {
			driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("click on signin and then signin")
	public void click_on_signin_and_then_signin() {
		Pageclass pg=new Pageclass(driver);
		pg.login();
	
	}

	@When("click on logout")
	public void click_on_logout() {
		Pageclass pg=new Pageclass(driver);
		pg.logout();
	}

	@Then("close the browser8")
	public void close_the_browser8() {
	    driver.close();
	    System.out.println("Logout done successfully");
	}

}
