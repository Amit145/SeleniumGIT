package seleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleImagesXpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  //Set Property to Chrome Driver
		
		WebDriver webdriver = new ChromeDriver();
		
		webdriver.get("https://www.google.com");
		
		webdriver.manage().window().maximize();
		
		
		/* 
		 * XPATH - Is a custom locator which gives unique id to element irespective of Design, display, location
		 * 
		 * SYNTAX  = //tagname[@attr='value']
		 * 
		 */
		
		
		webdriver.findElement(By.xpath("//a[@href='https://www.google.co.in/imghp?hl=en&tab=wi']")).click();
		
		/* As Selenium test cases execute faster than time required for loading
		 * it may produce object not found exception
		 * So we need synchronization here
		 * 
		 * Achieved by Two Ways
		 * 
		 * 1.) Explicit way
		 * 
		 * Thread.sleep(5000);   //5 seconds lag
		 * 
		 * 	Causes Time wastage, increases execution time
		 * 
		 * 2.) Implicit way
		 * 
		 * webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 * Timeout used across the program rather than using
		 * 
		 * Thread.sleep() at every line
		 * 
		 * Timeout 30 seconds is the maximum wait time, it may also pe possible it may exceute before 30 seconds
		 * rather than waiting for whole 30 seconds
		 * 
		 * Note - Selenium works from left to right while finding elemnts if with same name  
		 * 
		 */
		
		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		webdriver.navigate().back();  //Redirect to back page
		
		webdriver.navigate().forward();  //Redirect to forward page
		
		
		
		
	}

}
