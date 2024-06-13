package locators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class Locator {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		//id
		driver.findElement(By.id("nav-iss-attach"));
		driver.findElement(By.id("desktop-grid-4"));
		driver.findElement(By.id("anonCarousel1"));
		
		//name -- facebook
		driver.findElement(By.name("login_source"));
		
		//class
		driver.findElement(By.className("copilot-secure-display"));
		
		//linktext
		driver.findElement(By.linkText("Today's Deals"));
		
		//partiallinktext
		driver.findElement(By.partialLinkText("Today'"));
		driver.findElement(By.partialLinkText("'s Deals"));
		
		//tagname
		driver.findElements(By.tagName("a"));
		
		//css selector - Cascading style sheet
		
		//tagname and id value :
		
		//   tagname#idvalue
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//tagname and classvalue
		//   tagname.classvalue
		driver.findElement(By.cssSelector("div.nav-search-scope.nav-sprite"));
		
		//tagname and attribute
		// tagname[attribute="valueofattribute"]
		driver.findElement(By.cssSelector("input[name=\"glow-validation-token\"]"));
		
		//tagname and multiple attribute
		// tagname[attribute1="valueofattribute1"][attribute2="valueofattribute2"]  
		driver.findElement(By.cssSelector("div[id=\"gw-layout\"][class=\"a-section a-spacing-none aok-relative\"]"));
		
		//contains
		// tagname[attribute*="attributevalue"]
		driver.findElement(By.cssSelector("input[id*=\"textbox\"]"));
		
		//startswith 
		// tagname[attribute^="attributevalue"]
		driver.findElement(By.cssSelector("input[id^=\"two\"]"));
		
		//endswith 
		// tagname[attribute$="attributevalue"]
		driver.findElement(By.cssSelector("input[id$=\"tbox\"]"));
		
		//pseudoclass
		//first child
		//     tagname[attribute='attributevalue'] :first-child
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :first-child"));
		
		//last child
		//      tagname[attribute='attributevalue'] :last-child
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :last-child"));
		
		//nth child
				//      tagname[attribute='attributevalue'] :nth-child(n)
		
	driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-child(8)"));
	
	//nth last child
	//      tagname[attribute='attributevalue'] :nth-last-child(n)
	
	driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-last-child(4)"));
	
	//     /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
	
	// absolute xpath
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[6]"));
	
	//relative xpath
	//                  //tagname[@attribute='attributevalue']
	
//	//html/body/div[1]/div[4]/div[1]/div/div[1]/ul/li[1]/a
	
	//xpath
	//tagname and attribute
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	//tagname and multiple attribute
	//tagname[@attri1='value'][@attri2='value']
	driver.findElement(By.xpath("//select[@name='url'][@id='searchDropdownBox']"));
	
	//AND operator
	driver.findElement(By.xpath("//select[@name='url' and @id='searchDropdownBox']"));
	
	//or operator
	driver.findElement(By.xpath("//select[@name='url' or @id='searc']"));
	
	//contains
	//tagname[contains(@attribute,'attributevalue')]
	driver.findElement(By.xpath("//input[contains(@id,'searchtext')]"));
	
	//startswith
	//tagname[starts-with(@attribute,'attributevalue')]
	driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
	
	//xpath using text
	//a[text()="Today's Deals"]
	
	//xpath using text and index
	//  (//a[text()="Best Sellers"])[1]
	
	
	
	//parent and child relationship
	//    //parenttagname[@parentattribute ='parentattribute value]//childtagname[@chidattribute ='childattribute value]
				
	// eg. : //select[@name='url']//option[@value='search-alias=todays-deals']
	
	
	//select current node
	//   //tagname[@attribute=attributevalue]//self::currenttagname
	//eg.: (//div[@class='layoutToolbarPadding']//self::div)[1]
	
	
	//select parent of current element/node
	//  //tagname[@attribute='attributevalue']//parent::parenttagname
	//eg.: //option[@value='search-alias=collectibles']//parent::select
	
	//selectchild node
	//   //parenttaganame[@parentattribute='value]//child::childattribute
	//eg.: (//select[@id='searchDropdownBox']//child::option)[3]
	
	driver.findElement(By.xpath("(//select[@id='searchDropdownBox']//child::option)[3]"));
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\JMS\\eclipse-workspace\\Project_001\\Evidences"+"\\Evidences\\dashboard.png");
	org.openqa.selenium.io.FileHandler.copy(source, target);
	}
	
	
	
	

}
