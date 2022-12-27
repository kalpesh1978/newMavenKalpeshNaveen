package appTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {


		

	
	@Test(priority=1)
	public void searchTest() throws Exception {
	//	driver.get("https://www.google.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.id("L2AGLb")).click();
		

		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void googlesearchBtnTest() {
		boolean flag = driver.findElement(By.name("btnK")).isDisplayed();
		//Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}
	
	
	
	
	
	
	
}
