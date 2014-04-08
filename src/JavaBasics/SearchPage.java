package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class SearchPage {
	
	protected  WebDriver driver;
	
	public SearchPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	@FindBy(id="email")
	private WebElement fbemailid;
	
	@FindBy(how=How.ID,using="pass") WebElement fbpass;
	
	@FindBy(id="u_0_n")
	private WebElement login;
	
	public void Open(String URL){
		driver.get(URL);
	}
	
	public void Close(){
		driver.quit();
	}

	public String getTitle(){
		return driver.getTitle();
	}
	
	public void typeEmail(String emailid){
		fbemailid.sendKeys(emailid);
	}
	
	public void clickLogin(){
		login.click();
	}
}
