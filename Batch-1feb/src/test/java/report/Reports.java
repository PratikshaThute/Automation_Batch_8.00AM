package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_class;

public class Reports extends Base_class {

	public static void main(String[] args) throws Throwable {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		//create object ExtentSparkReporter
 
	ExtentSparkReporter esr = new ExtentSparkReporter(projectpath+ "\\reports\\Report1");
	esr.config().setDocumentTitle("Automation report");
	esr.config().setReportName("Amazon report");
	esr.config().setTheme(Theme.STANDARD);

	
	ExtentReports er = new ExtentReports();
	er.attachReporter(esr);
	
	er.setSystemInfo("Batch 1 feb", "STP infotech");
	er.setSystemInfo("Testing", "Automation");
	er.setSystemInfo("OS", "Windows 11");
	er.setSystemInfo("Browser", "Chrome");
	er.setSystemInfo("Domain", "ecommerce");
	er.setSystemInfo("Application", "Amazon");
	er.setSystemInfo("software test engineer", "Pratiksha Thute");
	
	
	ExtentTest test1 = er.createTest("Amazon url");
	test1.log(Status.INFO, "Hit Amazon url");
	test1.addScreenCaptureFromPath(projectpath+"\\report_sc\\amazon_webpage.png");
	
	ExtentTest test2 = er.createTest("Searchbox");
	test2.log(Status.FAIL, "click on searchbox");
	
	ExtentTest test3 = er.createTest("sendkeys homedecor");
	test3.log(Status.PASS, "successfully send keys");
	test3.addScreenCaptureFromPath(projectpath+"\\report_sc\\search_product.png");
	
	ExtentTest test4 = er.createTest("select option");
	test4.log(Status.SKIP, "no option selected");
	test4.addScreenCaptureFromPath(projectpath+"\\report_sc\\selected_option.png");
	
	launch_Browser("chrome");
	Hiturl("https://www.amazon.in/");
	takesscreenshot("amazon webpage");
	
	WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	searchbox.sendKeys("Home decor");
	takesscreenshot("search product");
	
	
	driver.findElement(By.xpath("//span[text()=' items for living room']")).click();
	takesscreenshot("select options");
	
	er.flush();
	}

}
