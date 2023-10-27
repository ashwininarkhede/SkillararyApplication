package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
	//declaration 
	//address of  download Invoice
	@FindBy(name="downloadInvoice")
	private WebElement downloadInvoicebtn;
	//Initialization
	public DownloadInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization
	public WebElement getDownloadInvoicebtn() {
		return downloadInvoicebtn;
	}
	
	//Bussiness Logic
	public void downloadInvoice()
	{
		downloadInvoicebtn.click();
		
	}
	

}
