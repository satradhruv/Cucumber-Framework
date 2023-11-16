package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingpageproductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.landingPage= testContextSetup.PageObjectManager.getLandingPage();
		
	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
//	   System.setProperty("webdriver.chrome.driver","/Users/DSATRA/eclipse-workspace/CucumberFramework/chromedriver.exe");
//	   testContextSetup.driver= new ChromeDriver();
//	   testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));		
	}
	@When("^User searched with short name (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		
		
		//LandingPage landingPage= testContextSetup.PageObjectManager.getLandingPage();
		//LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.searchItem(shortName);
		
		Thread.sleep(2000);
		testContextSetup.landingpageproductName= landingPage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.landingpageproductName+" is extracted from Home page");
		
	    
	}
	@When("User added {string} items in cart")
	public void Added_Items_Product(String quantity) {
		landingPage.increament(Integer.parseInt(quantity));
		landingPage.addToCart();
	}



}
