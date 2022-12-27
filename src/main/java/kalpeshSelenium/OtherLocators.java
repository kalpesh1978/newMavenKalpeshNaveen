package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.get("https://crmpro.com/index.html");
	   // driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	    
    // 1. By Id :
	    
	    
	// 2. By Name  :
	    
	   // driver.findElement(By.name("username")).sendKeys("test@ gmail.com");
	   //driver.findElement(By.name("password")).sendKeys("test@123");
	    
	   // By emailId = By.name("username");
	   // ElementUtil eleutil = new  ElementUtil(driver);
	   // eleutil.doSendKeys(emailId, "kalp @ gmail.com");
	    
	// 3. By Class Name :
	    
	   // driver.findElement(By.className("form-control")).sendKeys("kalpesh");
	    
	    
	// 4. By xpath:
	    
	  //*[@id="input-email"]  -----relative Xpath
	  // /html/body/main/div[2]/div/div/div/div[2]/div/div/form/div[1]/input  ---absolute Xpath
	    
	   // driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
	   //driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("test@123");
	    
	   // By emailId  = By.xpath("//*[@id=\"input-email\"] ");
	   //By password = By.xpath("/html/body/main/div[2]/div/div/div/div[2]/div/div/form/div[2]/input");
	   // ElementUtil eleutil = new  ElementUtil(driver);
	   //eleutil.doSendKeys(emailId, "test@gmail.com");
	   //eleutil.doSendKeys(password, "test@123");
	    
	// 5. By cssSelector :
	    
	   // driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
	   // By emailId  = By.cssSelector("#input-email");
	   //ElementUtil eleutil = new  ElementUtil(driver);
	   //eleutil.doSendKeys(emailId, "kalpesh@gmail.com");
	    
	// 6. By linkText :
	    
	    //driver.findElement(By.linkText("Register")).click();
	   // By registerLink = By.linkText("Register");
	   //doClick(registerLink);
	    
	   //String register = "Register";
	   //ElementUtil eleutil = new  ElementUtil(driver);
	   //eleutil.doClick("linkText", register);
	    
   // 7. partialLinkText :
	    
	   // driver.findElement(By.partialLinkText("Sign")).click();
	    
  // 8. tagName :
  
	     //String header = driver.findElement(By.tagName("h1")).getText();
	     //System.out.println(header);
	     //if(header.equals("Power up your sales, customer service, and marketing")) {
	    //	 System.out.println("h1 header is correct");
	     //}
	     By header = By.tagName("h1");
	     if(doGetText(header).equals("Power up your sales, customer service, and marketing")) {
	    	 System.out.println("h1 header is correct"); 
	     }
	    
	 }
	
	
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

}
