package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Jeevansathi extends Base_class {

	public static void main(String[] args) throws Throwable {
		
		launch_Browser("chrome");
		
		Hiturl("https://www.jeevansathi.com/");
		
		Actions action = new Actions(driver);
		
	WebElement profile = driver.findElement(By.xpath("//p[text()='BROWSE PROFILES BY']"));
	
	action.moveToElement(profile).perform();
	
	WebElement occupation = driver.findElement(By.xpath("//p[text()='Occupation']"));
	action.moveToElement(occupation).perform();
	
	WebElement IT = driver.findElement(By.xpath("//a[text()='IT Software']"));
	action.moveToElement(IT).click().build().perform();
	
	System.out.println(" the current webpage title is : "+ driver.getTitle());
	
	WebElement help = driver.findElement(By.xpath("//a[text()='HELP']"));
	// action.moveToElement(help).contextClick().build().perform();
	
	WebElement mail = driver.findElement(By.xpath("//input[@placeholder='someone@example.com']"));
//	mail.click();
//	mail.sendKeys("asdfghjklqwertyuio");
//	action.doubleClick(mail).build().perform();
	
	action.moveToElement(mail).click().sendKeys("asdfghjklqwertyuiop").doubleClick().build().perform();

	Thread.sleep(2000);
	
	action.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	action.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	action.keyDown(Keys.PAGE_DOWN).build().perform();
	
	Thread.sleep(2000);
	action.keyDown(Keys.PAGE_UP).build().perform();
	
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_UP).build().perform();
	
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	}

}
