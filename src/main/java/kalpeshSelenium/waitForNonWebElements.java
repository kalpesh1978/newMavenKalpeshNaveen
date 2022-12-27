package kalpeshSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitForNonWebElements {

	static WebDriver driver;

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();		
		
		//Wait for Url:
		driver.get("");
		
		
		
		
		
	}

}
