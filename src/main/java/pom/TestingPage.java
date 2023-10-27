package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//declaration
	//address of Facebook
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	//initialization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getFacebook() {
		return facebook;
	}
	
	//Business Logic
	public void facebookWebElement()
	{
		facebook.click();
	}
	

}

