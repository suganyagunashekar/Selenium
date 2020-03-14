package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) throws Exception {
		WebDriver driver;

		// to launch the chrome browser
		//System.setProperty(key, value)
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// to type URL
		driver.get("https://www.facebook.com/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//type the data into editboxes
		driver.findElement(By.id("email")).sendKeys("suganya123213@gmail.com");
		
		//type the data into password 
		driver.findElement(By.id("pass")).sendKeys("Sukku***");
		
		//login
		driver.findElement(By.id("loginbutton")).click();
		
		// wait for few sec
		Thread.sleep(5000);
		
		//close the current browser
		driver.close();
		
				
		
		
	}
}