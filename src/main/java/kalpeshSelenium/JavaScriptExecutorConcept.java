package kalpeshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	//	driver.findElement(By.id("sp-cc-rejectall-link")).click();
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('hi')");
//	//	driver.findElement(By.className("optanon-allow-all"));


		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleJS();
		System.out.println(title);
		
//		jsUtil.generateAlert("this is  my Js alert");
		
//		String innerText = jsUtil.getPageInnerText();
//		System.out.println(innerText);
//	    System.out.println(innerText.contains("+1-914-908-4886"));

//		jsUtil.refreshBrowserByJS();
//		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
//		WebElement loginForm = driver.findElement(By.id("loginForm"));
//		jsUtil.drawBorder(loginForm);
		
// 	    WebElement emailId = driver.findElement(By.id("input-email"));
// 	    WebElement password = driver.findElement(By.id("input-password"));
 	    
// 	    jsUtil.flash(emailId);
//	    emailId.sendKeys("kalpesh@gmail.com");
// 	    jsUtil.flash(password);
// 	    password.sendKeys("test123");

// 	    WebElement register = driver.findElement(By.linkText("Register"));
// 	    jsUtil.clickElementByJS(register);
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(3000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(3000);
//		jsUtil.scrollPageDown("500");
		
//		WebElement heading = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
//		jsUtil.scrollIntoView(heading);
//		System.out.println(heading.getText());
		
        WebElement emailId = driver.findElement(By.id("input-email"));
        emailId.sendKeys("kalpesh@gmail.com");
       // System.out.println(emailId.getText());
        String val = emailId.getAttribute("value");
		System.out.println(val);
	}

}
