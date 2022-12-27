package kalpeshSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConceptTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("http://babynames.merschat.com/popular.cgi");
		
		List<WebElement> namesList = driver.findElements(By.xpath("//a[contains(text(),'Hela')]"));
		
		while(true) {
			
			if(!(namesList.size()==1)) {
				driver.findElement(By.linkText("Next")).click();
				namesList = driver.findElements(By.xpath("//a[contains(text(),'Hela')]"));
				
			}else {
				String title = driver.findElement
				(By.xpath("(//a[contains(text(),'Hela')]/../parent::td//following-sibling::td)[2]//a"))
				.getAttribute("title");
				System.out.println(title);
				break;
			}
			
		}
		
		
		
		

	}

}
