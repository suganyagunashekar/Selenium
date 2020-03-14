package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FB_login {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		// type the data into editboxes
		driver.findElement(By.id("email")).sendKeys("suganya123213@gmail.com");

		// type the data into password
		driver.findElement(By.id("pass")).sendKeys("Sukku***");

		// login
		driver.findElement(By.id("loginbutton")).click();

		// wait for few sec
		Thread.sleep(5000);

	}

	@AfterMethod
	public void afterMethod() {
		// Screenshot
	}

	@BeforeClass
	public void beforeClass() {
		// System.setProperty(key, value)
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// to type URL
		driver.get("https://www.facebook.com/");

		// Maximize the screen
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {

		// close the current browser
		driver.close();
	}

}
