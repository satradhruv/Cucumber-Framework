package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	
	public pageObjectManager(WebDriver driver) {
		this.driver= driver;
	}
	
	
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	public OffersPage OffersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}



	
	

}
