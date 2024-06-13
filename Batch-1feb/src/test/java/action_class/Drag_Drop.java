package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Drag_Drop extends Base_class{

	public static void main(String[] args) {
		
		launch_Browser("chrome");
		Hiturl("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame1);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
	
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		// act.dragAndDrop(drag, drop).build().perform();
		
		// act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		
		driver.switchTo().defaultContent();
		
	WebElement draggable = driver.findElement(By.xpath("//a[text()='Draggable']"));
	act.moveToElement(draggable).click().build().perform();
	
	}

}
