package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Action_class extends Base_class{

	public static void main(String[] args) {
	launch_Browser("chrome");	
	Hiturl("https://www.amazon.in/");
	
	Actions act = new Actions(driver);
	
	WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
	act.moveToElement(prime).perform();
	
	WebElement lang = driver.findElement(By.cssSelector("a#icp-nav-flyout"));
	act.moveToElement(lang).perform();
	
	
	WebElement deals = driver.findElement(By.linkText("Today's Deals"));
	act.moveToElement(deals).contextClick().build().perform();
	
	WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	
	act.moveToElement(search).click().sendKeys("iphone").build().perform();
	act.doubleClick(search).build().perform();

	}

}
