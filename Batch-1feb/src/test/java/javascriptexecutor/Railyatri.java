package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Railyatri extends Base_class{

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		screenshot("browser");
		
		Hiturl("https://www.railyatri.in/");
		screenshot("url");
		
		WebElement enter_txt = driver.findElement(By.cssSelector("input#search_status"));
		enter_txt.click();
		enter_txt.sendKeys("12106");
		screenshot("text");
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		screenshot("afterpagescroll");
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		screenshot("scroll_to_bottom");
		
		Thread.sleep(3000);
		//to refresh
		js.executeScript("window.history.go(0)");
		
		
		Thread.sleep(3000);
		//back
		js.executeScript("window.history.back()");
		screenshot("back_to_browser");
		
		
		Thread.sleep(3000);
		//forward
		js.executeScript("window.history.forward()");
		screenshot("return to railyatri");
		
		
		Thread.sleep(3000);
		driver.close();
	
	}

}
