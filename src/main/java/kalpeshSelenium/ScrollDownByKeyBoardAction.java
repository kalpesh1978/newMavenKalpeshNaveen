package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownByKeyBoardAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.uk/");
		driver.findElement(By.id("sp-cc-accept")).click();
		
    	Thread.sleep(1000);
		
		Actions action = new Actions(driver);
       
//		//scroll down by Using Actions Class
//		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
//		
//		Thread.sleep(1000);
//	    
//		//Scroll Up by Using Actions Class
//		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
//		
	//	Thread.sleep(1000);
		
	     action.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		
		 
		

	}

}
