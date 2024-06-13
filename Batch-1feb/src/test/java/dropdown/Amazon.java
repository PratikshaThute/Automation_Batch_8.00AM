package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Amazon extends Base_class{

	public static void main(String[] args) {
		launch_Browser("chrome");
		Hiturl("https://www.amazon.in/");
		
		 WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("shoes");
//		List<WebElement> options = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//child::div"));
//	for(int i = 0;i<=options.size(); i++) {
//		if(options.get(i).getText().equalsIgnoreCase(" for women sneakers")) {
//			options.get(i).click();
//		}
//	}
		
		driver.findElement(By.xpath("//div[@aria-label='shoes for women sneakers']")).click();
		
	
	}

}
