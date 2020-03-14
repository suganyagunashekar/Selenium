package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosevsQuit {

	public static void main(String[] args) {
		WebDriver driver;

		// to open chrome
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		// get the title of page
		System.out.println(driver.getTitle());

		// close: Close the windown where the cursor is available
		// driver.close();
		// Quit: it will close all the windows (main window + child window)
		driver.quit();
	}

}
