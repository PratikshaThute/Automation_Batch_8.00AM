package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Dynamic_dropdown extends Base_class {

	public static void main(String[] args) {
		launch_Browser("chrome");
		Hiturl("https://www.railyatri.in/");
		
		// information about the code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement from_stn = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
		from_stn.sendKeys("Nagp");
		List<WebElement> from = driver.findElements(By.xpath("//ul[@id='ui-id-5']//child::li"));
		
		for(int x = 0; x<=from.size(); x++) {
			
				try {
					if(from.get(x).getText().contains("NAGPUR ROAD | NPRD")) {
						from.get(x).click();
					}
				} catch (IndexOutOfBoundsException e) {
				}
		}
		
		System.out.println("The entered stn name is : "+ from_stn.getAttribute("value"));
		
		 WebElement to_stn = driver.findElement(By.xpath("//input[@id='to_stn_input']"));
		 to_stn.sendKeys("Mum");
		 
		List<WebElement> to = driver.findElements(By.xpath("//ul[@id='ui-id-6']//child::li"));
		
		for(int y=0; y<=to.size(); y++) {
			
			try {
				if(to.get(y).getText().contains("MUMBAI CSMT | CSMT")) {
					to.get(y).click();
				}
				
			} catch (IndexOutOfBoundsException e) {
				
			}
			
		}
		System.out.println("The selected stn name is : "+ to_stn.getAttribute("value"));
	}

}
