package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Jquery_droppable extends Base_class {

	public static void main(String[] args) {
		
		launch_Browser("chrome");
		Hiturl("https://jqueryui.com/droppable/");
		
		WebElement sdfg = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(sdfg);
		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		//action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		//action.dragAndDrop(drag, drop).build().perform();
		
		action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		
		driver.switchTo().defaultContent();
		
	WebElement selectable = driver.findElement(By.xpath("//a[text()='Selectable']"));
	selectable.click();
	
		
		
	}

}
