package appTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {


		
	
	
//	@Test
//	public void searchTest() {
//		boolean flag = driver.findElement(By.name("q")).isDisplayed();
//		Assert.assertTrue(flag);
//	}
	
	@Test(priority = 1)
	public void ContactSalesTest() {
		
	//	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
        boolean flag = driver.findElement(By.linkText("Contact Sales")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm"));
	}
	
	
	
	
	
	
	
	
}
