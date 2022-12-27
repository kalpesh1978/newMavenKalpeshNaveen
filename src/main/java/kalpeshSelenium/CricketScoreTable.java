package kalpeshSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/india-vs-pakistan-16th-match-group-2-1298150/full-scorecard");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	    
		System.out.println(getWickectTakerName("Iftikhar Ahmed"));
		System.out.println(getPlayerScoreCard("Shan Masood"));
		System.out.println(getBowlerCard("View full profile of Hardik Pandya"));
		
		}
	
	public static String getWickectTakerName(String playerName) {
		String xpath = "//a[@title='"+playerName+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static List<String> getPlayerScoreCard(String playerName) {
		String xpath = "//a[@title='"+playerName+"']/parent::td/following-sibling::td";
		List<WebElement>scoreList =  driver.findElements(By.xpath(xpath));
		List<String> scoreValList = new ArrayList<String>();
		for(int i=1; i<scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			scoreValList.add(text);
			}
		return scoreValList;
		
	}
	public static List<String> getBowlerCard(String bowlerName) {
		String xpath = "//a[@title='"+bowlerName+"']/parent::td/following-sibling::td";
		List<WebElement>scoreList =  driver.findElements(By.xpath(xpath));
		List<String> bowlerValList = new ArrayList<String>();
		for(int i=0; i<scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			bowlerValList.add(text);
			}
		return bowlerValList;
		
	}
	
	

}
