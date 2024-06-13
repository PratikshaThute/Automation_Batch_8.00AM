package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Alerts extends Base_class{

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		Hiturl("https://demo.automationtesting.in/Alerts.html");
		
		//simple
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert simplealert = driver.switchTo().alert();
		System.out.println(simplealert.getText());
		Thread.sleep(2000);
		simplealert.accept();
		
		System.out.println("--------------------------------------------------------------");
		
		//confirmation
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert confirmalert = driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		Thread.sleep(2000);
		
		//to press ok
		confirmalert.accept();
		
		//to press cancel
		//confirmalert.dismiss();
		WebElement textmsg = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(textmsg.getText());
		
		System.out.println("------------------------------------------------------------");
		
		//prompt alert
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		Thread.sleep(2000);
		promptalert.sendKeys("STP infotech");
		promptalert.accept();
		WebElement msg = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(msg.getText());
		
	}

}
