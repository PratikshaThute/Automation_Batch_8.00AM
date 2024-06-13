package dynamic_code;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Action_Class {
	public static WebDriver driver;
	public static String Projectpath = System.getProperty("user.dir");
	public static WebElement element;

	public static void launch_Browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}

		System.out.println("The browser launched is : " + browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println("The webpage title is : " + driver.getTitle());
	}

	public static void move_to_element(String locator) {

		Actions action = new Actions(driver);

		element = driver.findElement(By.xpath(locator));

		action.moveToElement(element).build().perform();

	}
	
	public static void rightclick(String locator) {
		
		Actions action = new Actions(driver);

		element = driver.findElement(By.xpath(locator));

		action.moveToElement(element).contextClick().build().perform();
	}

	public static void double_click(String locator) {
		
		Actions action = new Actions(driver);

		element = driver.findElement(By.xpath(locator));

		action.moveToElement(element).doubleClick().build().perform();
	}
	
	public static void sendkeys(String locator, String text) {
		
		Actions action = new Actions(driver);

		element = driver.findElement(By.xpath(locator));

		action.moveToElement(element).sendKeys(text).build().perform();
		
	}
	
	
	
}
