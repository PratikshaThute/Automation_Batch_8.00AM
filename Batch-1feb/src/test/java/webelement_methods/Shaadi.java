package webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadi {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://www.shaadi.com/");
		   
		//   different methods of web-element
		   
		   driver.findElement(By.xpath("//a[@class='common_login__2FLV3 css-ny049c']")).click();
		        
		   WebElement username =  driver.findElement(By.xpath("//input[@name='email']")); 
		   
		   username.click();
		   username.sendKeys("kalyani@gmail.com");
		 
		   WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		   
		   password.click();      
		   password.sendKeys("12345");
		   password.clear();
	
		   
	//	   driver.findElement(By.cssSelector("input[name='autologin']")).click();
		   
		  
		   Thread.sleep(5000);
		   
		   
		   WebElement forgot_p = driver.findElement(By.xpath("//a[text()=\"Forgot Password?\"]"));
		   forgot_p.click();
		   
		   WebElement enter_no = driver.findElement(By.cssSelector("input#username"));
		   enter_no.click();
		   enter_no.sendKeys("kalyani@gmail.com");

		   System.out.println("the text is entered is :"+enter_no.getAttribute("value"));
		   System.out.println("the value of id attribute is :"+enter_no.getAttribute("id"));
		   
		   
		 WebElement send_otp = driver.findElement(By.cssSelector("button[name=\"submit-form-username_form\"]"));
		   
		 
		   System.out.println("the coordinate of send otp button is at : "+send_otp.getLocation().x);
		   System.out.println("the coordinate of send otp button is at : "+send_otp.getLocation().y);
		   
		   System.out.println("the size of send otp button is : "+send_otp.getSize());
		   
		   System.out.println("the tagname for send opt button is :"+send_otp.getTagName());
		   
		   System.out.println("send opt button is displayed on UI or webpage :"+send_otp.isDisplayed());
		   
		   System.out.println("send opt button is enabled on UI or webpage :"+send_otp.isEnabled());
		   
		   send_otp.isSelected();
		   
		   Thread.sleep(3000);
		   driver.navigate().refresh();
		   Thread.sleep(3000);
		   
		   driver.navigate().back();
		   Thread.sleep(3000);
		   
		   driver.navigate().forward();
		   Thread.sleep(3000);
		   
		   driver.close();
		  
	}

}
