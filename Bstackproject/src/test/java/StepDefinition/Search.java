package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	@Given("open home page in defaults browser1")
	public void open_home_page_in_defaults_browser1() {
			driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("^go to (.*) and add some text and click on search$")
	public void go_to_search_and_add_some_text_and_click_on_search(String search) {
		Pageclass pg=new Pageclass(driver);
		pg.searchFor(search);
	}

	@Then("close driver")
	public void close_driver() {
	    driver.close();
	    System.out.println("Search Completed");
	}

}
