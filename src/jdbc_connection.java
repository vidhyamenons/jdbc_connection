import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;


public class jdbc_connection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String host = "localhost";

		String port = "3307";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "root",
				"@Qazwsxedcrfvt@#$uytbbnmboklp!");
		Statement s = con.createStatement();
		ResultSet result = s.executeQuery("select * from EmployeeInfo where name ='Psam';");
		result.next();
		String username = result.getString("name");
		String Age = result.getString("age");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=uk");
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(Age);
	}

}
