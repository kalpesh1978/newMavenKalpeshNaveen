package kalpeshSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class browserUtil {

	public WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else {
	System.out.println("Pass the right Browser"+ browser);	
	
	
	}
	return driver;
	
	}
	public void enterUrl(String url) {
		if(url==null) {
			System.out.println("url is null");
			return;
		}
		if(url.indexOf("http")==-1) {
			System.out.println("http is missing");
			return;
		}
		driver.get(url);
		
	}
	
	public String getappcurrenturl() {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
