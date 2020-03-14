package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\BrowserDriver\\geckodriver.exe");
		//webdrivermanger.gecko().setup();
		//webdrivermanger.gecko().version("75").setup();
		driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		// Maximize the screen
		driver.manage().window().maximize();

		// type the data into editboxes
		driver.findElement(By.id("email")).sendKeys("suganya123213@gmail.com");

		// type the data into password
		driver.findElement(By.id("pass")).sendKeys("Sukku***");

		// login
		driver.findElement(By.id("loginbutton")).click();

		// wait for few sec
		Thread.sleep(5000);

		// close the current browser
		driver.close();
		

	}

}
