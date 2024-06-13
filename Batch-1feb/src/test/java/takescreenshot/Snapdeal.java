package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/Snapdeal_browser.png");
		FileHandler.copy(source, target);
		
		
		driver.get("https://snapdeal.com/");
		System.out.println(driver.getTitle());
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./Screenshot/Snapdeal_application.png");
		FileHandler.copy(source1, target1);
		
		WebElement search = driver.findElement(By.cssSelector("input#inputValEnter"));
		search.click();
		search.sendKeys("sarees");
		
		
		String Projectpath = System.getProperty("user.dir");
		System.out.println(Projectpath);
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File(Projectpath + "\\Screenshot\\Snapdeal_search.png");
		FileHandler.copy(source2, target2);
		
		WebElement btn = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
		btn.click();
		
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File source3 = ts3.getScreenshotAs(OutputType.FILE);
		File target3 = new File(Projectpath + "\\Screenshot\\Snapdeal_searchbtn.png");
		FileHandler.copy(source3, target3);
		

	}

}
