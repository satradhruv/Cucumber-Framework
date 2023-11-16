package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	 public LandingPage(WebDriver driver) {
		 this.driver= driver;
	 }
	
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By increament = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");//#root > div > div.products-wrapper > div > div > div.product-action > button
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
		
	}
	
	public String  getSearchText() {
		return driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	public void selectTopDeals() {
		driver.findElement(topDeals).click();
		
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	public void increament(int quantity) {
		int i = quantity-1;
		while(i>0) {
			driver.findElement(increament).click();
			i--;
		}
	}
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	
//	public void Add_Items() {
//		driver.findElement(increament).click();
//		driver.findElement(addToCart).click();
//	}

}
