package kalpeshSelenium;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	    driver.findElement(By.id("accept-choices")).click();
	    
	  //table[@id="customers"]/tbody/tr[2]/td[1]
	//    String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
	  //  String afterXpath = "]/td[1]";
	    
	//    int rowCount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
	    
	  //  for (int i=2; i<=rowCount; i++) {
	  //  	String  compXpath = beforeXpath+i+afterXpath;
	  //  	//System.out.println(compXpath);
	  //  	String compName =  driver.findElement(By.xpath(compXpath)).getText();
	  //  	System.out.println(compName);
	  //  }
	    By row = By.xpath("//table[@id=\"customers\"]/tbody/tr");
	    By col = By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th");
	    String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
	    String afterXpath = "]/td[";
	    printTable(row,col,beforeXpath,afterXpath);
	    
	}
	
	public static void  printTable(By rowlocator, By colLocator,String beforeXpath, String afterXpath) {
	    int rowCount = driver.findElements(rowlocator).size();
	    int colCount = driver.findElements(colLocator).size();
	    for(int row = 2; row <=rowCount; row++ ) {
	    	for(int col = 1; col<=colCount; col++) {
	    		String xpath = beforeXpath +row+afterXpath+col+"]";
	    		String text = driver.findElement(By.xpath(xpath)).getText();
	    		System.out.print(text+"   |    ");
	    	}
	    	System.out.println();
	    }
	    

	}
	

}
