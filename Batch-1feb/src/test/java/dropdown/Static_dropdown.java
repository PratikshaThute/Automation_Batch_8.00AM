package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.Base_class;

public class Static_dropdown extends Base_class {

	public static void main(String[] args) throws Throwable {
		
	launch_Browser("chrome");
	
	Hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");
	
	 WebElement profile = driver.findElement(By.cssSelector("select#reg_relationship"));
	 profile.click();
	 
	 Select select = new Select(profile);
	 select.selectByVisibleText("Relative/Friend");
	
	WebElement day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
	day.click();
	Select select1 = new Select(day);
	select1.selectByValue("25");
	
	
	WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
	month.click();
	Select select2 = new Select(month);
	
	select2.selectByIndex(3);
	
	driver.findElement(By.xpath("//option[text()='Never Married']")).click();
	
	driver.findElement(By.xpath("(//a[@class='chzn-single chzn-default'])[1]")).click();
	List<WebElement> religion_options = driver.findElements(By.xpath("//ul[@class='chzn-results']//child::li"));
	System.out.println(religion_options.size());
	
	for(int a = 0; a<=religion_options.size(); a++ ) {
		if(religion_options.get(a).getText().equalsIgnoreCase("hindu")) {
			religion_options.get(a).click();
			
		}
	}
	
	driver.findElement(By.xpath("//div[@id='reg_city_res_chzn']")).click();
//	List<WebElement> caste = driver.findElements(By.xpath("//ul[@class='chzn-results']//child::li"));
//	System.out.println(caste.size());
//	
//	for(int b= 0; b<=caste.size(); b++) {
//		if(caste.get(b).getText().equalsIgnoreCase("Kanakkan Padanna")) {
//			caste.get(b).click();
//		}
 }
	
	}
	
	
	

