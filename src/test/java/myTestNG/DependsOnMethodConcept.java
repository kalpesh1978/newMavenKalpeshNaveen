package myTestNG;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void createUserTest() {
		System.out.println("createUserTest");
		int i = 9/0;
	}
	
	@Test
	public void loginTest() {
		System.out.println("loginTest");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = {"loginTest", "createUserTest"}, priority = 1)
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	
	@Test(dependsOnMethods = "loginTest", priority = 2)
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	
	
}
