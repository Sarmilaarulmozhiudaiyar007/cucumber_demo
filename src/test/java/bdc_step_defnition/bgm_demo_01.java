package bdc_step_defnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Mydemo_01_Cucumber.Mydemo_01_Cucumber.dem;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class bgm_demo_01 {
	WebDriver driver;
	@Given("user has the valid credentials for the demowebshop")
	public void user_has_the_valid_credentials_for_the_demowebshop() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver = dem.ConfigureDriver("chrome");
	 	driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	}

	@Given("user enters the valid credentials as the input to the login page")
	public void user_enters_the_valid_credentials_as_the_input_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.id("Email")).sendKeys("sarmilaarul@gmail.com");
		driver.findElement(By.className("password")).sendKeys("sarmi007*");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("checks the login status")
	public void checks_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  System.out.println((driver.getTitle()));
		  Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
	}

	@Given("user gets access to the add item page")
	public void user_gets_access_to_the_add_item_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("U");
		search.sendKeys("S");
		Thread.sleep(1000);
		search.sendKeys("E");
		search.sendKeys("D");
		search.sendKeys(" ");
		search.sendKeys("P");
		search.sendKeys("H");
		search.sendKeys("O");
		search.sendKeys("N");
	search.sendKeys("E");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

	@Given("user selects the headphone under electronics")
	public void user_selects_the_headphone_under_electronics() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img")).click();;
	}

	@Then("user clicks the add to cart button")
	public void user_clicks_the_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	driver.findElement(By.xpath("//a[@href='/logout']")).click();;
	}

	@Given("user again goes to the add item page")
	public void user_again_goes_to_the_add_item_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("F");
		search.sendKeys("I");
		Thread.sleep(1000);
		search.sendKeys("C");
		search.sendKeys("T");
		
		search.sendKeys("I");
		search.sendKeys("O");
		search.sendKeys("N");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

	@Given("user selects fiction book under Books")
	public void user_selects_fiction_book_under_Books() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[1]")).click();
	}

	@Then("user selects add to card option")
	public void user_selects_add_to_card_option() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}


}
