package kalpeshSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
	    
	   // WebElement firstName = driver.findElement(By.id("Form_getForm_Name"));
	    //firstName.sendKeys("kalpesh");
	    
	    List<WebElement> list = driver.findElements(By.className("text"));
	    System.out.println(list.size());
	}

} 
