package JavaBasics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class SocialWebSite {

      SearchPage page;
	
	
	
	
	@Before
	public void OpenBrowser(){
		page=PageFactory.initElements(new FirefoxDriver(), SearchPage.class);
		page.Open("http://www.facebook.com");
	}
	
	
	@Test
	public void TestFB(){
		System.out.println(page.getTitle());
		page.typeEmail("mukeshotwani@yahoo.com");
		page.clickLogin();
	}

	
	@After
	public void closeTheBrowser(){
		page.Close();
	}
}
