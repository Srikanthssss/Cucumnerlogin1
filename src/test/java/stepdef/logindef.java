package stepdef;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class logindef {
	WebDriver d;
	@Given("If user is on home page")
	public void if_user_is_on_home_page() {
		// Launch the browser
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		// Load web page
		d.get("https://demo.cyclos.org/ui/home");
		// Verify Home link
		assertTrue(d.findElement(By.linkText("Home")).isDisplayed());
	}

	@When("Click on login link")
	public void click_on_login_link() {
		d.findElement(By.id("login-link")).click();
	}
//Today task 
	@When("Enter login details")
	public void enter_login_details() throws Exception {
		// Enter user name
		d.findElement(By.xpath("//input[@type='text']")).clear();
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		// Enter password
		d.findElement(By.xpath("//input[@type='password']")).clear();
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		// Click on Submit button
		d.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		Thread.sleep(2000);
	}

	@Then("Verify logout link")
	public void verify_logout_link() {
	   
		assertTrue(d.findElement(By.id("logout-trigger")).isDisplayed());
		// Close the browser
		d.quit();
	}
	@When("Click on Receive QR-code payment")
	public void click_on_receive_qr_code_payment() throws Exception {
	    d.findElement(By.partialLinkText("Receive QR-code payment")).click();
	    Thread.sleep(1000);
	}
	@When("Enter amount")
	public void enter_amount() {
	    d.findElement(By.xpath("//input")).sendKeys("10");
	}
	@When("Click on Next button")
	public void click_on_next_button() throws Exception {
	    d.findElement(By.xpath("//button[contains(.,'Next')]")).click();
	    Thread.sleep(2000);
	}
	@Then("Verify QR Code and URL")
	public void verify_qr_code_and_url() {
	    assertTrue(d.findElement(By.xpath("//receive-qr-payment-step-pending/div/img")).isDisplayed());
	    assertTrue(d.findElement(By.xpath("//label-value[3]/div/div/div")).isDisplayed());
	    // Close the browser
	    d.quit();
	}
}



	
