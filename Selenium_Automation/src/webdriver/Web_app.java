package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_app {

	public static void main(String[] args) throws Exception {
		// webdrive object creation
		WebDriver driver;

		// to open chrome
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL
		driver.get("https://skiplagged.com/");
		driver.manage().window().maximize();
		System.out.println("Homepage URL:"+ driver.getCurrentUrl());
		Thread.sleep(6000);
		driver.findElement(By.linkText("Hotels")).click();
		System.out.println("Hotelpage URL:"+ driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("hotel")) {
			System.out.println("Hotel page successfully launched");
		} else {
			
			System.out.println("Not launched Hotel URL");

		}
	}

}
