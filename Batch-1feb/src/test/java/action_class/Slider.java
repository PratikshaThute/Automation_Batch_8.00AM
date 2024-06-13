package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Slider extends Base_class {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		Hiturl("https://jqueryui.com/slider/");
		
		Actions act = new Actions(driver);
		
	WebElement slider_frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
	driver.switchTo().frame(slider_frame);
	
	WebElement box = driver.findElement(By.cssSelector("span.ui-slider-handle.ui-corner-all.ui-state-default"));
	
	act.dragAndDropBy(box, 300, 0).build().perform();
	
	Thread.sleep(2000);
	
	act.moveToElement(box).clickAndHold().moveByOffset(200, 0).release().build().perform();
	
	Thread.sleep(2000);
	
	act.clickAndHold(box).moveByOffset(-400, 0).release(box).build().perform();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	
	System.out.println("the current title is : "+ driver.getTitle());
	
	
	}

}
