package report;

import dynamic_code.Report;

public class Flipkart extends Report{

	public static void main(String[] args) throws Throwable {
		reports("flipkart report" , "report_flipkart", "flipkart");
		
		Test("browser launch" , "chrome browser", "chrome browser");
		Test("url", "flipkart url", "flipkart app");

		launch_Browser("chrome");
		takesscreenshot("chrome browser");
		
		Hiturl("https://www.flipkart.com/");
		takesscreenshot("flipkart app");
		er.flush();
	}

}
