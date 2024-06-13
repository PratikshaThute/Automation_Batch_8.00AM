package window_handles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Parent_child extends Base_class {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		takesscreenshot("Browser_launch");
		
		Hiturl("https://www.naukri.com/");
		takesscreenshot("naukri webpage");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takesscreenshot("scroll to bottom");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		takesscreenshot("clicked on about us");
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> id = windows.iterator();
		
		String parent_id = id.next();
		System.out.println("the parent id is : "+ parent_id);
		
		String child_id = id.next();
		System.out.println("the child id is : "+ child_id);
		
		Thread.sleep(2000);
		driver.switchTo().window(child_id);
		System.out.println("shifted to child window");
		takesscreenshot("child window");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='LEARN MORE']")).click();
		System.out.println("clicked on learn more");
		takesscreenshot("clicked on learn more");
		
		Thread.sleep(2000);
		driver.switchTo().window(parent_id);
		System.out.println("back to parent window");
		takesscreenshot("back to parent id");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		takesscreenshot("pageup");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
