package database_testing;

import org.openqa.selenium.By;

import dynamic_code.Database_testing;

public class Facebook extends Database_testing {

	public static void main(String[] args) throws Throwable {
		
		launch_Browser("chrome");
		takesscreenshot("Browser launched");
		
		Hiturl("https://www.facebook.com/");
		takesscreenshot("facebook");
		
		database_connection("stp", "select username, password from facebook where sr_no=1;");
		database_coloumn("username", "//input[@id='email']");
		takesscreenshot("username_entered");
		
		Thread.sleep(2000);
		database_coloumn("password", "//input[@id='pass']");
		takesscreenshot("password_entered");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_9lsa']")).click();
		takesscreenshot("show_password");
		
		Thread.sleep(2000);
		driver.close();
	}

}
