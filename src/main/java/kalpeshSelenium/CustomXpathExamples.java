package kalpeshSelenium;

public class CustomXpathExamples {

	public static void main(String[] args) {
		
		//1:
		//htmltag[@attr='value'] ----SYNTAX
		
		//input[@name='email'] ----EXAMPLE
		
//		//htmltag[@attr='value' and @attr1='value'] ----SYNTAX
//		//input[@name='email' and @type='text']  ___EXAMPLE
		
		
		//2:  text();
		
		//htmltag[text()='value']  ----SYNTAX
//		//a[text()='wish list']   ---EXAMPLE
//		//span[text()='value']    ---EXAMPLE
		
		
		//3: contains: to handle dynamic elements  with dynamic attributes
		
//		//htmltag[contains(@attr,'value')]
//		//input[contains(@id,'email')]
		
//		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
//     //input[contains(@id,'email') and contains(@name,'email')]	
		
		
		
		//4: contains with text():
//		//htmltag[contains(text(),'value')]
//		//h2[contains(text(),'customers')]
//		//a[contains(@href,'wishlist') and contains(text(),'WishList')]
		
		
		//5: starts-with
//		//htmltag[stars-with(@attr,'value')]
//		//input[starts-with(@id,'user')]
		
		
		//6: xpath with class names:
//		//htmltag[@class='value1 value2 value3']
//		//input[@class='form=control private-form_control login-email']
		
		
		//7:xpath with index:
		
//		(//div[@class='container'])[10]//a  -----all links
//		((//div[@class='container'])[10]//ul)[1] ------from main attribute to other attributes
//		((//div[@class='navFooterVerticalColumn navAccessibility']//ul)[4]//a)[10] ----from last colum's last link capture from amazon footer link 
//		((//div[@class='navFooterVerticalColumn navAccessibility']//ul)[last()]//a)[last()] ----use of last Keyword from last colum's last link capture from amazon footer link 
		
		
//		((//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']//td)[23]/a)[last()]
		
		
		
		
		
		
		
	}

}
