package myTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsConcept {

	@BeforeSuite
	public void DBConnection() {
		System.out.println("BeforeSuite-----DBConnection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BeforeTest-----createUser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeClass-----launchBrowser/Url");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BeforeMethod-----loginToApp");
	}
	
	@Test
	public void userInfoTest() {
		System.out.println("Test------userInfoTest");
	}
	
	@Test
	public void accountInfoTest() {
		System.out.println("Test---- accountInfoTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AfterMethod------logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass-----closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AfterTest-----deleteUser");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AfterSuite----disconnectDB");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
