package kalpeshSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headLessBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver();
		
		ChromeOptions co = new  ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
    	System.out.println(driver.getPageSource());
		
		
		driver.quit();
		

	}

}
