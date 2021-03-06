package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoTestNG {
	
	/* 
	 * Class to execute TestCases using Annotation Test
	 * 
	 * TestNG doesn't have main Method instead it has Anotations
	 * 
	 */
	
  @Test
  public void verifyTitle() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  //Set Property to Chrome Driver
		
		WebDriver webdriver = new ChromeDriver();   //Create a object of chrome using WebDriver Class
		
		webdriver.get("https://www.facebook.com"); 	//Navigation URL of a website
		
		webdriver.manage().window().maximize();    //Maximize browser Window   
		
		String webTitle = webdriver.getTitle();	   //Get URL Title
		
		Assert.assertEquals(webTitle, webTitle);   //Assert class to validate output
  }
  
  @Test
  public void verifyURL() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  //Set Property to Chrome Driver
		
		WebDriver webdriver = new ChromeDriver();   //Create a object of chrome using WebDriver Class
		
		webdriver.get("https://www.facebook.com"); 	//Navigation URL of a website
		
		webdriver.manage().window().maximize();    //Maximize browser Window   
		
		String currentWebSiteURL = webdriver.getCurrentUrl(); //Get Current URL
		
		String expectedWebSiteURL = "https://www.facebook.com";   //Expected URL
		
		Assert.assertEquals(currentWebSiteURL, expectedWebSiteURL);   //Assert class to validate output
  }
}
