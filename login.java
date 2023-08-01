package sqt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rafid\\Downloads\\Programs\\java\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/FinalProject/views/login.php");
		
		
		driver.findElement(By.id("Name")).sendKeys("arman");
		driver.findElement(By.id("Pass")).sendKeys("12345677");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("SUbmit")).click();
		
		
		String expected_title="Home_Page";
		String actual_title = driver.getTitle();
		//System.out.println(driver.getTitle());
		 if (expected_title.equals(actual_title)) {
	        	System.out.println("Login Successfull");
	        }else {
	        	System.out.println("Login Failed");
	        }

	}

}