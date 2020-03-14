package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class CrossbrowserTesting {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		// to type URL
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

	}

	@AfterMethod
	public void afterMethod() throws IOException {
		// Screenshot
		Date d = new Date();
		System.out.println(d);

		// ddMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		String screenshptsPath = ".\\Screenshots\\";
		// FileInputStream fi = new FileInputStream(screenshptsPath);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(screenshptsPath + "FB" + timeStamp + ".PNG"));
	}

	// String browser = "opera";
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\BrowserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\BrowserDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Please give valid browser type*****");
		}

	}

	@AfterClass
	public void afterClass() {

		// close the current browser
		driver.close();
	}

}
