package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class jeevansathi extends Base_class{

	public static void main(String[] args) throws Throwable {
		
		launch_Browser("edge");
		screenshot("edge_browser");
		
		Hiturl("https://www.jeevansathi.com/");
		screenshot("jeevansathi_webpage");
	
		driver.findElement(By.xpath("//div[@id='relationshipBlock']")).click();
		screenshot("select");
		
		driver.findElement(By.xpath("//li[text()='Relative/Friend']")).click();
		screenshot("option_selected");
		
		driver.findElement(By.cssSelector("div#gender")).click();
		screenshot("select_Gender");
		
		driver.findElement(By.xpath("//li[text()='Female']")).click();
		screenshot("Female");
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.click();
		email.sendKeys("jeevansathi@123");
		screenshot("email");
		
		WebElement pn = driver.findElement(By.cssSelector("input#phoneNumber"));
		pn.click();
		pn.sendKeys("1234567890");
		screenshot("phonenumber");
		
		WebElement pass = driver.findElement(By.cssSelector("input#password"));
		pass.click();
		pass.sendKeys("abcd1234");
		screenshot("password");
		
		WebElement eye = driver.findElement(By.cssSelector("div#eye"));
		eye.click();
		screenshot("pass_visible");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		screenshot("scroll to bottom");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		screenshot("scrollup");
		
		driver.navigate().back();
		screenshot("back to browser");
		
		driver.navigate().forward();
		screenshot("to jeevanasathi");
		
		driver.close();
	}

}
