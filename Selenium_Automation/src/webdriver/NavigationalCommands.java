package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws Exception {
		WebDriver driver;

		// to open chrome
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Click on Refresh icon
		driver.navigate().refresh();
		Thread.sleep(5000);
		//CLcik on Backward icon
		driver.navigate().back();
		Thread.sleep(5000);
		//Click on Forward icon
		driver.navigate().forward();
		Thread.sleep(5000);
		

	}

}
