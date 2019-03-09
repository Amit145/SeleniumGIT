package example.amit.demo.TestNG.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationExecutionTestNG {
	
	/*
	 * Class to execute TestCases using Annotation BeforeClass, Test & AfterClass
	 * 
	   * Annotations:
	   * 
	   * 1.) @BeforeClass - Method annotated with BeforeClass executes only once before 1st TestCase (Pre-Condition)
	   * 
	   * 	execution order :
	   * 
	   * 		1.) BeforeMethod -> verifyURL
	   * 		2.) BeforeMethod -> verifyTitle
	   * 
	   * 2.) Test - Method annotated with Test coniders it as a part of TestCase (Execution)
	   * 
	   * 3.) @AfterClass - Method annotated with AfterClass executes once after Last TestCase  (Post-Condition)
	   * 
	   * 	order of exceution Test Case:
	   * 		1.) BeforeClass - initializeWebDriver()
	   * 		2.) Test - verifyTitle()
	   * 		3.) Test - verifyURL()
	   * 		4.) AfterClass - closeBrowser()
	   * 
	*/
	
	
  WebDriver webdriver;   //Public WebDriver as it is used in each TestCase
 
  @BeforeClass
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
		
	  String expectedWebSiteURL = "https://www.facebook.com/";   //Expected URL
		
	  Assert.assertEquals(currentWebSiteURL, expectedWebSiteURL);   //Assert class to validate output
	  	  
  }
  
  @AfterClass
  public void closeBrowser() {
	  
	  webdriver.close();               //Close Browser after each Test Case
  }
}

