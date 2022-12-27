package kalpeshSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//CSS selector: Not an attribute
		
		//Syntax:----
		
		//id --> #id
		//class ---> .classname
		
		//By.cssSelector("#input-email");  ---using Id
		//By.cssSelector("input#input-email"); ----using Id and HtmlTag
		
		//By.cssSelector(".form-control");  ---using classname
		//By.cssSelector("input.form-control"); ----using classname and HtmlTag

		//By.cssSelector("#input-email.form-control");  ---using #Id.classname together
		
		// if Id and Class not available :
	    //---------------------------------
	    //htmalTag[attr='value']----CSS SYNTAX
		//htmalTag[@attr='value']------Xpath SYNTAX
		
		//By.cssSelector("input[name='Name']"); -----cssSelector
		//By.xpath("//input[@name='Name']"); -----Xpath
		
		
		//By.cssSelector("input[name='Name'][type='text']"); ---Using Two attributes
		
		
		//htmlTag[attr*='value'] ---using contains
		//By.cssSelector("input[id*='_Name']");----contains
		//By.cssSelector("input[placeholder^='Business']"); ---Starts with
		//By.cssSelector("input[placeholder$='Email*']"); ---Ends with
		
		
		//coma in CSS :
	   //-------------
		//input#username,input#password,button#loginBtn,label#UIFormControl-label-4
	   List<WebElement> formFields = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,label#UIFormControl-label-4"));
	   System.out.println(formFields.size());
	   if(formFields.size()==4) {
		   System.out.println("fields are available");
		   }
	   //footer CSS : ul.footer-nav a   --(freshworks.com)
	   
	   //nth of type :
	   //------------
	   //div.footer-main ul li:nth-of-type(1) ---indexing from  footerlinks
	   
	   
	   
		
		
		
		
		

	
		
		
		
		
		
		

	}

}
