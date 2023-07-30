package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class loginpage {
	WebDriver driver;
	@Given("User on Facebook login page")
	public void user_on_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    
	}

	@When("User enters validate username")
	public void user_enters_validate_username() {
		driver.findElement(By.id("email")).sendKeys("admin");
	    
	}

	@When("User enters validate password")
	public void user_enters_validate_password() {
		driver.findElement(By.id("pass")).sendKeys("password");
	 
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
	}

	@Then("Home page displayed")
	public void home_page_displayed() {
		driver.quit();
	    
	}
	//@Given("User on Facebook login page")
	//public void user_on_facebook_login_page1() {
		//driver.get("https://www.facebook.com/");
	
	   
	//}

	@When("User enters invalide username")
	public void user_enters_invalide_username() {
		driver.findElement(By.id("email")).sendKeys("admin");
	    
	}

	@When("User enters invalide password")
	public void user_enters_invalide_password() {
		driver.findElement(By.id("pass")).sendKeys("12334456");
	   
	}

	@When("User Clicks on login button")
	public void user_clicks_on_login_button1() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("Source Error")
	public void source_error() {
		driver.close();
	  
	}

@Given("User is on signin page")
public void user_is_on_signin_page() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://automate-your-way.herokuapp.com/");
}
@When("^user enters username as (.+) and (.+)$")
public void user_enters_username_as_and(String username, String password) throws Throwable {
	driver.findElement(By.id("user")).sendKeys(username);
    driver.findElement(By.id("pass")).sendKeys(password);
}
	
    
@When("User clicks on Login")
public void user_clicks_on_login() {
	driver.findElement(By.id("submit")).click();

}
   

@Then("HomePage should be  displayed")
public void home_page_should_be_displayed() {
	driver.quit();
    
}

//@When("^user enters username as (.+) and (.+)$")
//public void user_enters_username_as_and1(String username, String password) throws Throwable {
 //driver.findElement(By.id("txtUsername")).sendKeys(username);
    //driver.findElement(By.id("txtPassword")).sendKeys(password);
//}

	}



