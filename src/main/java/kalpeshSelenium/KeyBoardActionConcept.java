package kalpeshSelenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.id("L2AGLb")).click();
		//driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		action.keyDown(element, Keys.SHIFT).sendKeys("kalpesh shah").build().perform();
		
		

	}

}
