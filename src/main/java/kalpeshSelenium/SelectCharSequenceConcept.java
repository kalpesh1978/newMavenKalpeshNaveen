package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCharSequenceConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement email = driver.findElement(By.id("input-email"));
		
		
		//StringBuilder, StringBuffer, String, Keys
		StringBuilder username = new StringBuilder()
		.append("Kalpesh")
		.append(" ")
		.append("Shah")
		.append(" ")
		.append("Test")
		.append(" ")
		.append("Selenium");
		
		String space = " ";
		
		StringBuilder userInfo = new StringBuilder()
				.append("Testing")
				.append(" ")
				.append("WebDriver");
		
		String author = "Kalpesh Shah";
		
		email.sendKeys(username, space, userInfo, space, author, Keys.TAB);
		
		
		
		

		
		
		
		
		
		
		
	}

}
