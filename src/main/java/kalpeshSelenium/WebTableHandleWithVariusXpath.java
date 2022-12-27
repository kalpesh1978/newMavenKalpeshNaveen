package kalpeshSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandleWithVariusXpath {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://classic.crmpro.com/index.html");
	    
	    driver.findElement(By.name("username")).sendKeys("newautomation");
	    driver.findElement(By.name("password")).sendKeys("Selenium@12345 ");
	    
	    driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame("mainpanel");
	    driver.findElement(By.linkText("CONTACTS")).click();
		
	    Thread.sleep(3000);

//		//a[text()='deepti gupta']/parent::td//preceding-sibling::td/input
//	  //a[text()="deepti gupta"]/../preceding-sibling::td/child::input
		selectContact("deepti gupta");
		selectContact("Romi singh");
		
		System.out.println(getCompanyName("Romi singh"));
		
		System.out.println(getContactPhoneList("Romi singh"));
		
		System.out.println(getContactEmail("deepti gupta"));
		
		
		}
	
	public static void selectContact(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td//preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();

	}
	
	public static String getCompanyName(String companyName) {
		String xpath = "//a[text()='"+companyName+"']/parent::td//following-sibling::td//a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();

	}
	public static String getContactEmail(String emailId) {
		String xpath = "//a[text()='"+emailId+"']//parent::td//following-sibling::td//a[text()='deeptigupta@xyz.com']";
		return driver.findElement(By.xpath(xpath)).getText();

	}
	
	public static List<String> getContactPhoneList(String contactName) {
		
//		xpath for single phone number :	(//a[text()='Romi singh']/parent::td//following-sibling::td//span[@context='phone'])[3]	

		
		String xpath = "//a[text()='"+contactName+"']/parent::td//following-sibling::td//span[@context='phone']";
		List<WebElement>phoneList = driver.findElements(By.xpath(xpath));
		List<String> phoneValList = new ArrayList<String>();
		for(WebElement e : phoneList) {
			String text =  e.getText();
			phoneValList.add(text);
		}
		return phoneValList;
		
	}

}
