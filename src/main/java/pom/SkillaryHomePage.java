package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryHomePage {
	// Declaration
	// adderress of gears
	@FindBy(linkText = "GEARS")
	private WebElement gearsbtn;

	@FindBy(xpath = "(//a[.=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;

	@FindBy(name = "q")
	private WebElement searchTf;

	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchIcon;

	// Initialization
	public SkillaryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public WebElement getSkillraryDemoApp() {
		return skillraryDemoApp;
	}

	public WebElement getSearchTf() {
		return searchTf;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	// Bussiness Logic
	public void gearButton() {
		gearsbtn.click();
	}

	public void skillaryDemoApplication() {
		skillraryDemoApp.click();
	}

	public void searchTextField(String data) {
		searchTf.sendKeys("data");
	}

}
