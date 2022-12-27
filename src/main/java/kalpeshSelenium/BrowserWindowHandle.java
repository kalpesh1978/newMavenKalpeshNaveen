package kalpeshSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");// Parent Window
		
		driver.findElement(By.xpath("//img[@alt='Facebook Marketing Partner']")).click();
		//Child Window/New Tab (Twitter Page) will appear
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("parent Window ID is :"+ parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("child Window ID is :"+ childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("child window url is :" + driver.getCurrentUrl());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window url is:"+ driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		
	}

}
