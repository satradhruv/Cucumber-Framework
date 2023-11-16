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
import pageObjects.OffersPage;
import pageObjects.pageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	pageObjectManager PageObjectManager;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	
	@Then("^User searched for (.+) same shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
		
		switchToOffersPage();
		
		//OffersPage offerspage = new OffersPage(testContextSetup.driver);
		OffersPage offerspage= testContextSetup.PageObjectManager.OffersPage();
		offerspage.searchItem(shortName);
		Thread.sleep(2000);
		offerPageProductName= offerspage.getProductName();
		}
	
	public void switchToOffersPage() {
		//testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
		//PageObjectManager= new pageObjectManager(testContextSetup.driver);
		
		LandingPage landingPage= testContextSetup.PageObjectManager.getLandingPage();
		landingPage.selectTopDeals();
		testContextSetup.genericUtils.SwitchWindowToChild();
		}
	
	@And("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(offerPageProductName, testContextSetup.landingpageproductName);
	
	}


}
