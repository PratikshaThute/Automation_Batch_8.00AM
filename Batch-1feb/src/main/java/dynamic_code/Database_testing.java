package dynamic_code;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Database_testing {
	
	public static WebDriver driver;
	public static String host = "localhost";
	public static String portnumber = "3306";
	public static ResultSet result ;
	
public static void launch_Browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();

		}else if(browser.equalsIgnoreCase("firefox")) {
			
			 driver = new FirefoxDriver();
			
		}else if (browser.equalsIgnoreCase("edge")) {
			
			 driver = new EdgeDriver();
		}
		
		System.out.println("The browser launched is : "+ browser);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println("The webpage title is : "+ driver.getTitle());
	}
	
	public static void takesscreenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Database_ss/"+screenshot_name+".png");
		FileHandler.copy(source, target);
	}
	
	public static void database_connection(String database, String query) throws Throwable{
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + portnumber + "/" + database, "root",
				"Pratiksha@25");
		
		Statement cs = connect.createStatement();
		
		result = cs.executeQuery(query);
		result.next();
		
	}
	
	public static void database_coloumn(String coloumn, String locator) throws Exception {
		System.out.println(result.getString(coloumn));
		driver.findElement(By.xpath(locator)).sendKeys(result.getString(coloumn));
		
	}
}
