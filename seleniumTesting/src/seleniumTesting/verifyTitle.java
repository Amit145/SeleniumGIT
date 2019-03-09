package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  //Set Property to Chrome Driver
		
		WebDriver webdriver = new ChromeDriver();   //Create a object of chrome using WebDriver Class
		
		webdriver.get("https://www.facebook.com"); 	//Navigation URL of a website
		
		webdriver.manage().window().maximize();    //Maximize browser Window   
		
		String webTitle = webdriver.getTitle();	   //Get URL Title
		
		System.out.println("Title of url : "+webTitle);
		
		/*
		 * Exception in thread "main" java.lang.IllegalStateException: 
		 * The path to the driver executable must be set by the webdriver.chrome.driver system property; 
		 * for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. 
		 * The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html 
		 * 
		 * download and paste in project
		 */
		
		webdriver.findElement(By.id("u_0_j")).sendKeys("TestName");		//Set Name
		webdriver.findElement(By.id("u_0_l")).sendKeys("TestSurname");	//Set Surname
		webdriver.findElement(By.id("u_0_o")).sendKeys("9876543210");	//Set PhoneNo
		webdriver.findElement(By.id("u_0_v")).sendKeys("Password@777");  //Set Password
		
		webdriver.findElement(By.id("day")).sendKeys("14");   //Set BirthDay
		webdriver.findElement(By.id("month")).sendKeys("06"); //Set BirthMonth
		webdriver.findElement(By.id("year")).sendKeys("1990");  //Set BirthYear
		
		webdriver.findElement(By.id("u_0_a")).click();      //Click Radio button
		
		webdriver.findElement(By.id("u_0_11")).click();     //Click SignUp Button
	}

}
