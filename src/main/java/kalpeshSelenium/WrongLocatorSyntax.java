package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrongLocatorSyntax {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
	    
	   // By firstName  = By.xpath("//*[id=\"Form_getForm_Name\"]");
	    By email = By.cssSelector("#Form_getForm_Email");
	    driver.findElement(email).sendKeys("Kalpesh@gmail.com");
	    
	}

}
