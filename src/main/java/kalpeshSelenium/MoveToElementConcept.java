package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how+to+create+menu+with+submenu+using++css+html&o=rec");
		
//		WebElement parentMenu = driver.findElement(By.cssSelector("a.menulink"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(parentMenu).build().perform();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("COURSES")).click();
		
		By contentMenu =  By.cssSelector("a.menulink");
		By coursesLink =  By.linkText("COURSES");
		doClickOnChildMenu(contentMenu, coursesLink);
		

	}
	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).build().perform();
	}
	
	public  static void doClickOnChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
		doMoveToElement(parentMenuLocator);
		Thread.sleep(3000);
		getElement(childMenuLocator).click();
	}

}
