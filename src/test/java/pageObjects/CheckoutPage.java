package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	
	 public CheckoutPage(WebDriver driver) {
		 this.driver= driver;
	 }
	
	By cartBag = By.cssSelector("[alt = 'Cart']");
	By checkOutButton = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
	//By checkOutButton = By.xpath("//button[contains(text().'PROCEED TO CHECKOUT')]");
	By placeOrder= By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	//By placeOrder= By.xpath("//button[contains(text().'Place Order')]");
	By promoBtn= By.cssSelector(".promoBtn");
	
	public void CheckoutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public boolean VerifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public boolean VerifyPlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
}
