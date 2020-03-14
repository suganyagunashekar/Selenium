package webdriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSceenshot {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		// System.setProperty(key, value)
//		System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		
//		System.setProperty("webdriver.gecko.driver", ".\\BrowserDriver\\geckodriver.exe");
//		driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.ie.driver", ".\\BrowserDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		// to type URL
		driver.get("https://www.facebook.com/");
		// Maximize the screen
		driver.manage().window().maximize();
		
		Date d = new Date();
		System.out.println(d);

		// ddMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		String screenshptsPath = ".\\Screenshots\\";
		//FileInputStream fi = new FileInputStream(screenshptsPath);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(screenshptsPath+"FB"+timeStamp+".PNG"));
	}
}
