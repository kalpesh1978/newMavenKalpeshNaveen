package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefException {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		WebElement ele  = driver.findElement(By.id("input-email"));
		ele.sendKeys("kalpesh@gmail.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		ele  = driver.findElement(By.id("input-email"));
		ele.sendKeys("kalp@gmail.com");

		
		
		
		
		
		
		
	}

}
