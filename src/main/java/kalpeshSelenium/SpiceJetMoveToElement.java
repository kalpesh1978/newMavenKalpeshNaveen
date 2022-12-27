package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMoveToElement {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.get("https://www.spicejet.com/");
		
		WebElement addOnMenu = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(addOnMenu).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='SpiceMAX']")).click();
		
		

		
		
	}

}
