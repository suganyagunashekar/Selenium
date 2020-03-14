package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTDsevaRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://ttdsevaonline.com/#/registration");
		// Maximize the screen
		driver.manage().window().maximize();
		driver.findElement(By.name("fName")).sendKeys("Suganya");
		driver.findElement(By.name("lName")).sendKeys("Gunashekar");

		// select country code
		driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-country-code='us']")).click();
		driver.findElement(By.name("mobNo")).sendKeys("5714380341");

		// select DOB
		driver.findElement(By.name("date")).click();
		Select sel= new Select(driver.findElement(By.xpath("//*[@title='Change the month']")));
		sel.selectByVisibleText("May");
		new Select(driver.findElement(By.xpath("//*[@title='Change the year']"))).selectByVisibleText("1983");
		driver.findElement(By.linkText("21")).click();
		
		Select s = new Select(driver.findElement(By.name("countryS")));
		
		//https://www.collegeweeklive.com/go-signup/

	}

}
