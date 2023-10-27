package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	//Handle Dropdown
	public void dropdown(WebElement ele,String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	//Handling Mouseover
	public void mouseOvering(WebDriver driver,WebElement ele)
	{
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	}
	//Handling RightClick
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
	}
	//Double Click
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	
	//Drag And Drop
	public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2) {
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();
		
	}
	
	//Handling Frame
	public void frames(WebDriver driver,String value)
	{
		driver.switchTo().frame(value);
	}
	
	//Handling DefaultContent
	public void frames(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//Handling Child Browser
	public void childBrowser(WebDriver driver)
	{
		Set<String> childs = driver.getWindowHandles();
		for(String b:childs)
		{
			driver.switchTo().window(b);
		}
	}
	
	//Handling Scrolling
	
	public void scrolling(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	//Handling Pop Up
	public void popup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

}
