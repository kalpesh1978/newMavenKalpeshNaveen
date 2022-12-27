package kalpeshSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://apnetv.to/Hindi-Serials?/Hindi-Serials");
	    //driver.findElement(By.xpath("//div[@class=\"col-sm-9\"]//li"));
	    
	    Thread.sleep(3000);
	    By langLinks = By.xpath("//div[@class=\"col-sm-9\"]//li");
	    //clickOnElement(langLinks, "News");
	    List<String> actualLinksTextList = getLinksTextList(langLinks);
	    if (actualLinksTextList.contains("News")) {
			System.out.println("News is present");
		}
	}
	
	public static List<String> getLinksTextList(By locator) {
		List<WebElement> linksList = driver.findElements(locator);
		List<String> linksTextList = new ArrayList<String>();
	    System.out.println(linksList.size());
	    for (WebElement e : linksList) {
			String text = e.getText().trim();
			linksTextList.add(text);
			}
	    return linksTextList;
	}
	
	public static void clickOnElement(By locator, String linkText) {
		 List<WebElement> langList = driver.findElements(locator);
		    System.out.println(langList.size());
		    
			for (WebElement e : langList) {
				String text = e.getText().trim();
				System.out.println(text);
				if (text.equals(linkText)) {
					e.click();
					break;
				}
			}
	}

}
