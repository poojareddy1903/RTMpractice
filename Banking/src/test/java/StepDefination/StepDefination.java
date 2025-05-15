package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination 
{
	//tagged hooks
@Before("@test1") //tags written for multiple test scenario and tagged only for that test scenario start and end
public void beforeTest1tagged()
{
	System.out.println("connect to Mongo DB code");
}
	
@After("@test1")
public void afterTest1tagged()
{
	System.out.println("Disconnect to Mongo DB code");
}
	
	
	
@Before  //hooks --2type of hooks -- Before and After hooks
public void beforeTest()
{
	System.out.println("connect to DB code");
}
@After
public void afterTest()
{
	System.out.println("Disconnect to DB code");
}

		@Given("user opens the URL of the application")
		public void user_opens_the_url_of_the_application() {
		    
			System.out.println("Application Launched");
		}

		@Given("user enters the <{string}> in the username field")
		public void user_enters_the_in_the_username_field(String string) {
		   
			System.out.println("Username added");
		}
		

		@Given("user enters the <{string}> in the password field")
		public void user_enters_the_in_the_password_field(String string) {
		   
			System.out.println("Password added");
		}

		@When("user clicks on the submit button")
		public void user_clicks_on_the_submit_button() {
		  
			System.out.println("Submit button pressed ");
		}

		@When("user clicks on My Payment page of application")
		public void user_clicks_on_my_payment_page_of_application() {
		   
			System.out.println("payment page will open");	
		}

		
		@Then("user will be navigated to payment page of the application")
		public void user_will_be_navigated_to_payment_page_of_the_application() {
		  
			System.out.println("Navigate to payment page");
		}
		

		@Given("user opens the demo site of application")
		public void user_opens_the_demo_site_of_application() {
		 
			System.out.println("App opened");
		}

		@Given("user enters the below details")
		public void user_enters_the_below_details(io.cucumber.datatable.DataTable usercredentials) throws InterruptedException {
		   
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			List<List<String>> data = usercredentials.asLists(String.class);
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data.get(1).get(0));
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data.get(1).get(1));
			driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(data.get(1).get(2));
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(1).get(3));
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(data.get(1).get(4));
			driver.findElement(By.xpath("//input[@value='FeMale']")).sendKeys(data.get(1).get(5));
			
		}


	}


