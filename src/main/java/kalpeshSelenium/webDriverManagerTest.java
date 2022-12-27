package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com//");
		WebElement button = driver.findElement(By.id("L2AGLb"));
		button.click();
        String title = driver.getTitle();
        System.out.println("Page Title is :" + title);
        
        if(title.equals("google")) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
        System.out.println(driver.getCurrentUrl());
        driver.close();
        
	}

}
