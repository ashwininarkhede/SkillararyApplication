package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillararyPage {

	// Declaration
	@FindBy(name = "addresstype")
	private WebElement selectDb;

	@FindBy(linkText = "FEEDBACK")
	private WebElement feedbackbtn;

	// Initialization
	public DemoSkillararyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getSelectDb() {
		return selectDb;
	}

	public WebElement getFeedbackbtn() {
		return feedbackbtn;
	}
}
