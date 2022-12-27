package kalpeshSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForExplicitElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
//		driver.get("https://classic.freecrm.com/index.html");
	    driver.get("https://www.freshworks.com/");
	    Thread.sleep(3000);
	   
	    
	    
	    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	    
	    By footers = By.xpath("//footer//ul[@class='footer-nav']//a");
	   if( getElementsTextListWithWait(footers, 5).contains("Careers")) {
		   System.out.println("Pass");
	   }
//	   
//	    List<WebElement> footerList = waitForElementsToBeVisible(footers, 5);
//        for(WebElement e: footerList) {
//        	System.out.println(e.getText());
//        }

       		
 //       By username = By.name("username");
//		By password = By.name("password");
//		By loginBtn = By.xpath("//input[@type='submit']");
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		username_ele.sendKeys("Kalpesh");
//		
		//doSendKeys(username, "Kalpesh", 10);
//		dopresenceOfElementLocated(username, 10, 2000);
//		driver.findElement(password).sendKeys("kalpesh123");
//		driver.findElement(loginBtn).click();
		
		
	}
	
	public static void doSendKeys(By locator, String value, int timeOut) {
		dopresenceOfElementLocated(locator, timeOut).sendKeys(value);
	}
	
	public static WebElement dopresenceOfElementLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	   return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	} 
	
	public static WebElement dopresenceOfElementLocated(By locator, int timeOut, long intervalTime ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut),Duration.ofMillis(intervalTime));
	   return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	} 
	
	public static WebElement waitForElementToBeVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	   return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	} 
	
	public static WebElement waitForElementToBeVisible(By locator, int timeOut, long intervalTime ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut),Duration.ofMillis(intervalTime));
	   return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	} 
	
	public static WebElement waitForElementToBeVisibleWithWebElement(By locator, int timeOut, long intervalTime ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut),Duration.ofMillis(intervalTime));
	   return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));

	} 
	
	public static List<WebElement> waitForElementsToBeVisible(By locator, int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	   return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	} 
	
	
	public static List<WebElement> waitForElementsToBeVisible(By locator, int timeOut, long intervalTime ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut),Duration.ofMillis(intervalTime));
	   return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	} 
	
	public static List<String> getElementsTextListWithWait(By locator, int timeOut) {
		List<WebElement> eleList = waitForElementsToBeVisible(locator, timeOut);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	

}
