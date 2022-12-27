package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class webDriverBasics {

	public static void main(String[] args) {
	
     // System.setProperty("webdriver.chrome.driver", "/Users/mitkalp/Downloads/chromedriver-2" );
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new SafariDriver();
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
        
        
	}

}
