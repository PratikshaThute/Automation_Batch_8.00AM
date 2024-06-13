package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, Throwable {
		//launch browser
				WebDriver driver = new ChromeDriver();
				
				
				//maximize window
				driver.manage().window().maximize();
				
				String projectpath = System.getProperty("user.dir");
				
				System.out.println(projectpath);
				
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File target = new File("./Evidences/browsers.png");
				FileHandler.copy(source, target);
				
				//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//hit the url using get method
				driver.get("https://www.facebook.com/");
					
				//find the element you wants to perform action
				WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
				
				//use click method on the webelement you find
				username.click();
				
				// use sendkeys to enter input
				username.sendKeys("pthute29@gmail.com");

				WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
				password.click();
				
				Thread.sleep(3000);
				password.sendKeys("1234567");
				
				Thread.sleep(5000);

				//use clear method to remove the text enter as input
				password.clear();
				
				WebElement Fp = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
				
				//use gettext method to get the text of web element you have find
				System.out.println("the text of webelement is : " + Fp.getText());
				Fp.click();
				
				WebElement FYA = driver.findElement(By.cssSelector("input#identify_email"));
				FYA.click();
				FYA.sendKeys("pthute29@gmail.com");
				
				TakesScreenshot ts1 = (TakesScreenshot) driver;
				File source1 = ts1.getScreenshotAs(OutputType.FILE);
				File target1 = new File(projectpath+ "\\Evidences\\fb.png");
				FileHandler.copy(source1, target1);
				
				// use getattribute method if gettext() is not working and if you wants to get the value 
				// you had entered
				System.out.println("the text entered is : "+ FYA.getAttribute("value"));
				
				//use getattribute to capture the attribute value from dom file
				System.out.println("The value of id attribute is : "+ FYA.getAttribute("id"));
				
				WebElement search = driver.findElement(By.cssSelector("button#did_submit"));
				
				//use get location to get x and y coordinates
				System.out.println("the x coordinate of search button is at : "+ search.getLocation().x);
				System.out.println("the y coordinate of search button is at : "+ search.getLocation().y);
				
				//to get the size of button or searchbox
				System.out.println("the size of search btn is : "+ search.getSize());
				
				//to get the tagname of webelement from dom file
				System.out.println("the tagname for search btn is : " + search.getTagName());
				
				//to check web element is displayed or not
				System.out.println("search btn is displyed on UI : " + search.isDisplayed());
				
				//to check web element is enabled or not
				System.out.println("search btn is enabled on UI : " + search.isEnabled());
				
				// to refresh the page use navigate method of webdriver interface
				Thread.sleep(5000);
				driver.navigate().refresh();
				
				Thread.sleep(5000);
				
				// to go back, use navigate method 
				driver.navigate().back();
				
				Thread.sleep(5000);
				
				//to move forward, use navigate method 
				driver.navigate().forward();
				
				Thread.sleep(5000);
				
				//to close the webpage
				driver.close();
				
	}

}
