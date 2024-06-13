package robot_class;

import dynamic_code.Dynamic_Robot_class;

public class Robot extends Dynamic_Robot_class {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		Hiturl("https://www.ilovepdf.com/pdf_to_word");
		
		upload_file("//a[@id='pickfiles']", "\"C:\\Users\\JMS\\Desktop\\selenium notes\\selenium pdf\\7. Locators.pdf\"");

	}

}
