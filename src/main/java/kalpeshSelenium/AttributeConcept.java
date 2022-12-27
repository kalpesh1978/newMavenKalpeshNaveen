package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.com/");
	    //String hrefValue = driver.findElement(By.linkText("Amazon Devices")).getAttribute("href");
		//System.out.println(hrefValue);
	    
	    By AmazonDevicesLink = By.linkText("Amazon Devices");
	    String hrefValue = getAttributeValue(AmazonDevicesLink, "href");
	    if(hrefValue.contains("footer_devices")) {
	    	System.out.println("href is correct");
	    }
	}
	
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	
	public static String getAttributeValue(By locator,String attrName) {
		String attrValue =  getElement(locator).getAttribute(attrName);
		System.out.println(attrValue);
		return attrValue;
	}
	

}
