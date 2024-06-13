package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Keyboard extends Base_class{
	
	public static void main(String[] args) throws Throwable {
		
	launch_Browser("chrome");
	Hiturl("https://www.jeevansathi.com/");
	
	Actions act = new Actions(driver);
	
	WebElement email = driver.findElement(By.cssSelector("input#email"));
	act.moveToElement(email).click().sendKeys("asdfghjkl").build().perform();
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	act.keyDown(Keys.TAB).perform();
	act.keyDown(Keys.TAB).perform();
	act.keyDown(Keys.TAB).perform();
	
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	driver.findElement(By.cssSelector("div#eye")).click();
	
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	act.keyDown(Keys.PAGE_UP).build().perform();
	Thread.sleep(2000);
	
	act.keyDown(Keys.PAGE_UP).build().perform();
	
	}

}
