package database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import dynamic_code.Base_class;

public class Linkedin extends Base_class {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String portnumber = "3306";

		launch_Browser("chrome");
		Hiturl("https://in.linkedin.com/");

		driver.findElement(By.xpath("//a[@class='nav__button-secondary btn-md btn-secondary-emphasis']")).click();

		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + portnumber + "/stp", "root",
				"Pratiksha@25");

		Statement cs = connect.createStatement();

		ResultSet result = cs.executeQuery("select email,password from linkedin where sr_no =4;");
		result.next();

		System.out.println(result.getString("email"));
		System.out.println(result.getString("password"));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(result.getString("email"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(result.getString("password"));
		driver.findElement(By.xpath("//span[@class='button__password-visibility']")).click();

	}

}
