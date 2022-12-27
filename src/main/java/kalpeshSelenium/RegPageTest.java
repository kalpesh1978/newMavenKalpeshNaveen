package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		browserUtil brUtil = new browserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		String title = brUtil.getPageTitle();
		System.out.println("Page Title is :"+ title);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		
		//String userNameId = "input-email";
		//String passwordId = "input-password"; 
		
		ElementUtil eleUtil = new ElementUtil(driver);
		//eleUtil.doSendKeys("id", userNameId, "test@gmail.com");
		//eleUtil.doSendKeys("id", passwordId, "test123");
		
		eleUtil.doSendKeys(firstName, "kalpesh");
	    eleUtil.doSendKeys(lastName, "shah");
		eleUtil.doSendKeys(email, "kshah@gmail.com");
		
		Thread.sleep(3000);
		
		brUtil.closeBrowser();
		
		
		
		
		
		
		
	}

	

}
