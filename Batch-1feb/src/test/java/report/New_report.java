package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Report;

public class New_report extends Report {

	public static void main(String[] args) throws Throwable {
		reports("New report", "Meesho report", "Meesho");

		Test("browser", "chrome browser", "browser launched");
		Test("url", "Meesho", "url hit");
		Test("searchbox", "find searchbox", "click on searchbox");
		Test("test enter", "search text", "searched");

		launch_Browser("chrome");
		takesscreenshot("browser launched");
		
		Hiturl("https://www.meesho.com/");
		takesscreenshot("url hit");
		
		WebElement searchbox = 
				driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		searchbox.click();
		takesscreenshot("click on searchbox");
		
		searchbox.sendKeys("saree");
		takesscreenshot("searched");
		
		er.flush();

	}

}
