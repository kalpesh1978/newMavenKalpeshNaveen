package kalpeshSelenium;

public class AmazonTest {

	public static void main(String[] args) {
		
		browserUtil br = new browserUtil();
		br.launchBrowser("chrome");
		br.enterUrl("http://amazon.com");
        String  title = br.getPageTitle();
        System.out.println(title);
        if (title.contains("amazon")) {
        	System.out.println("correct title");
        }
       String url =  br.getappcurrenturl();
       System.out.println(url);
       
       br.closeBrowser();
	}

}
