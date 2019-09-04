package Mydemo_01_Cucumber.Mydemo_01_Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BDC6_Demo1 {
	WebDriver driver;
	@Given("Application is launched by guest user")
	public void application_is_launched_by_guest_user() {
		driver = dem.ConfigureDriver("chrome");
	 	driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
		 driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("user clicks on sign Up link available")
	public void user_clicks_on_sign_Up_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@When("Provider the requied data in the form")
	public void provider_the_requied_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Lali");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sarmila");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Arul");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password456");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Password456");
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("sarmila@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8870166890");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
			Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
			year.selectByValue("1997");
		Select mon =  new Select(driver.findElement(By.className("ui-datepicker-month")));
				mon.selectByVisibleText("Oct");
				driver.findElement(By.linkText("1")).click();
	    driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("10/2,Gorimedu,Salem");
	    Select secQn = new Select(driver.findElement(By.id("securityQuestion")));
	    secQn.selectByVisibleText("What is your favour color?");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("White");
	}

	@Then("user submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(driver.getTitle());
		 Assert.assertEquals(driver.getTitle(), "Login");
		
	}

}
