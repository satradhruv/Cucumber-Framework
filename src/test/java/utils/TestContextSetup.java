package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String landingpageproductName;
	public pageObjectManager PageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		PageObjectManager= new pageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}

}
