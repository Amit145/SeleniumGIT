package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationTestNG {
	
	/* Class to execute TestCases using Annotation BeforeMethod, Test & AfterMethod
	 * 
	   * Annotations:
	   * 
	   * 1.) BeforeMethod - Method annotated with BeforeMethod executes once before each TestCase (Pre-Condition)
	   * 
	   * 	execution order :
	   * 
	   * 		1.) BeforeMethod -> verifyURL
	   * 		2.) BeforeMethod -> verifyTitle
	   * 
	   * 2.) Test - Method annotated with Test coniders it as a part of TestCase (Execution)
	   * 
	   * 3.) AfterMethod - Method annotated with AfterMethod executes after each TestCase  (Post-Condition)
	   * 
	   * 	order of exceution 1st Test Case:
	   * 		1.) BeforeMethod - initializeWebDriver()
	   * 		2.) Test - verifyTitle()
	   * 		3.) AfterMethod - closeBrowser()
	   * 
	   * 	order of exceution 2nd Test Case:
	   * 		1.) BeforeMethod - initializeWebDriver()
	   * 		2.) Test - verifyURL()
	   * 		3.) AfterMethod - closeBrowser()
	   * 
	*/
	
	
  WebDriver webdriver;   //Public WebDriver as it is used in each TestCase
 
  @BeforeMethod
  public void initializeWebDriver() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  //Set Property to Chrome Driver
		
	  	webdriver = new ChromeDriver();   //Create a object of chrome using WebDriver Class
		
		webdriver.get("https://www.facebook.com"); 	//Navigation URL of a website
		
		webdriver.manage().window().maximize();    //Maximize browser Window 
  }
  
  
  @Test
  public void verifyTitle() {
	  
	  String webTitle = webdriver.getTitle();	   //Get URL Title
		
	  Assert.assertEquals(webTitle, webTitle);   //Assert class to validate output
  }
  
  @Test
  public void verifyURL() {
	  
	  String currentWebSiteURL = webdriver.getCurrentUrl(); //Get Current URL
		
	  String expectedWebSiteURL = "https://www.facebook.com";   //Expected URL
		
	  Assert.assertEquals(currentWebSiteURL, expectedWebSiteURL);   //Assert class to validate output
	  	  
  }
  
  @AfterMethod
  public void closeBrowser() {
	  
	  webdriver.close();               //Close Browser after each Test Case
  }
}
