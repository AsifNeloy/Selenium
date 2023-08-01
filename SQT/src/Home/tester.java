package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","G:\\PRACTICE\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/project/Online_Laundry_Service/deliveryman/view/dm_login.php");
		
		
		driver.findElement(By.id("name")).sendKeys("raiyan");
		driver.findElement(By.id("password")).sendKeys("123456789");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("submit")).click();
		
		
		String expected_title="Dashboard";
		String actual_title = driver.getTitle();
		//System.out.println(driver.getTitle());
		 if (expected_title.equals(actual_title)) {
	        	System.out.println("Login Successfull");
	        }else {
	        	System.out.println("Login Failed");
	        }


	}
}
