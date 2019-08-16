package simpleProjectCheckNumbers;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import simpleProjectCheckNumbers.CheckNumbers;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckNumbers check = new CheckNumbers();
		check.test();
	   
		//First Selenium Project
		
		//Driver object referencing WebDriver interface
		WebDriver driver;
		
		//Setting the browser driver property to its executable's location
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\DataDrivenFramework\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
	
	
		//Open a webpage
		driver.get("https://www.google.com/");
		
	//	driver.close();
		driver.quit();
		
		
	}


}
