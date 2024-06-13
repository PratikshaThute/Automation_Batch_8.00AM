package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Railyatri extends Base_class{

	public static void main(String[] args) throws Exception{
		
		launch_Browser("chrome");
		Hiturl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement calender = driver.findElement(By.xpath("//input[@id='datepicker_train']"));
		calender.click();

		int date = 30;
		while(true){

			String month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();

			System.out.println("the current month and year is : " + month_year);

			if (!(month_year.equalsIgnoreCase("October 2024"))) {

				// Click on Next Button
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();

			} else {
				break;
			}
		}

		// Click on Date
		driver.findElement(By.xpath("//td[text()='" + date + "']")).click();
		
		//driver.findElement(By.xpath("//td[text()='30']")).click();
		System.out.println("the selected date is : " + calender.getAttribute("value"));
	}

}