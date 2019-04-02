package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class StepDefinitions {

	WebDriver driver;
	
	@Given("^The User Launches the Calorie Calculator BMI Page$")
	public void the_User_Launches_the_Calorie_Calculator_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.calculator.net/bmi-calculator.html");
	    driver.manage().window().maximize();
	}

	@And("^The User enters 45 in the age text box$")
	public void the_user_enters_45_in_the_age_textbox() throws Throwable {
	    WebElement ageTextbox = driver.findElement(By.id("cage"));
	    ageTextbox.clear();
	    ageTextbox.sendKeys("45");
	}
	
	// take age param from feature spec / examples
	@And("^The User enters the age as ([^\"]*)")
	public void the_User_Provides_the_age_as(String age) throws Throwable {
	    WebElement ageTextbox = driver.findElement(By.id("cage"));
	    ageTextbox.clear();
	    ageTextbox.sendKeys(age);
	}
	
	// take height param from feature spec
	@And("^The User enters the height / inches as ([^\"]*)")
	public void the_User_Provides_the_height_as(String height) throws Throwable {
	    WebElement heightInchesTextbox = driver.findElement(By.cssSelector("#cheightinch"));
	    heightInchesTextbox.clear();
	    heightInchesTextbox.sendKeys(height);
	}

	@When("^The user clicks on the Calculate Button$")
	public void the_user_clicks_on_the_Calculate_Button() throws Throwable {
		Thread.sleep(1500);
	    WebElement calculatebtn = driver.findElement(By.xpath("//*[@alt='Calculate']"));
	    calculatebtn.click();
	}

	@Then("^The user is provided with BMI Value and BMI Category$")
	public void the_user_is_provided_with_BMI_Value_and_BMI_Category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //String BMIString = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/b")).getText();
	    String BMIString = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
	    System.out.println("\nBMIString = " + BMIString + "\n");
	    driver.close();
	}
}
