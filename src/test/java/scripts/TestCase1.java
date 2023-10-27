package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.DemoSkillararyPage;
import pom.SkillaryHomePage;
import pom.TestingPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable
	{
		
		SkillaryHomePage s=new SkillaryHomePage(driver);
		s.gearButton();
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementIfVisible(s.skillaryDemoApplication()));
		s.skillaryDemoApplication();
		
		utilities.childBrowser(driver);
		DemoSkillararyPage ds=new DemoSkillararyPage(driver);
		utilities.dropdown(ds.getSelectDb(), pdata.getPropertyData("coursedd"));
		TestingPage t=new TestingPage(driver);
		utilities.scrolling(driver, t.getFacebook());
		Thread.sleep(2000);
		t.facebookWebElement();
	}

}
