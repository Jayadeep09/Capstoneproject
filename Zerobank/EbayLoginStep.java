package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EbayLoginStep {
	WebDriver driver;
	
	@Given("ebay login page should be open in default browser")
	public void ebay_login_page_should_be_open_in_default_browser() {
	    driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	}

	@And("click on sign link in home page")
	public void click_on_sign_link_in_home_page() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();
		Thread.sleep(10000);
	    
	}

	@And("click on username and add username")
	public void click_on_username_and_add_username() {
		WebElement name=driver.findElement(By.id("userid"));
		name.sendKeys("jayavenkatasaijayadeep.k@gmail.com");
	    
	}

	@And("click on continue")
	public void click_on_continue() throws InterruptedException {
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(2000);
	    
	}

	@And("click on password aand add password")
	public void click_on_password_aand_add_password() throws InterruptedException {
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("suG!i_399AN.PLN");
		Thread.sleep(4000);
		driver.findElement(By.id("sgnBt")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Then("successful home page is displayed after sign in")
	public void successful_home_page_is_displayed_after_sign_in() {
		System.out.println("Login done");
		
	}


}




