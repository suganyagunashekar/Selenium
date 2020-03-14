
package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeekLive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/");
		// maximize window
		driver.manage().window().maximize();
		// Thread.sleep(3000);
		// click on signup link
		driver.findElement(By.linkText("Sign up/Log in")).click();
		Thread.sleep(5000);
		// click on Register with Email link
				driver.findElement(By.linkText("Register with Email")).click();
		// Enter FN,LN,Email,PH,Password and Confirm Password
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Rohan");
		driver.findElement(By.name("lastName")).sendKeys("Atturu");
		driver.findElement(By.name("emailAddress")).sendKeys("Rohan.Atturu@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("+12163909865");
		driver.findElement(By.name("password")).sendKeys("Rohan##");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Rohan##");
		//Gender
		new Select(driver.findElement(By.xpath("//*[@id='questions[q_17]']"))).selectByVisibleText("Male");
		// select Country of Citizenship
		new Select(driver.findElement(By.xpath("//*[@id='country']"))).selectByVisibleText("UNITED STATES");
		// select Iam a Dropdown
		new Select(driver.findElement(By.xpath("//*[@name='attendeeType']"))).selectByValue("Graduate");
		// Select anticipated start term
		new Select(driver.findElement(By.xpath("//*[@name='questions[q_134]']"))).selectByVisibleText("Fall 2020");
		// DOB
		new Select(driver.findElement(By.xpath("//*[@id='questions_16_Month']"))).selectByVisibleText("May");
		new Select(driver.findElement(By.xpath("//*[@id='questions_16_DayOfMonth']"))).selectByVisibleText("11");
		new Select(driver.findElement(By.xpath("//*[@id='questions_16_DOBYear']"))).selectByVisibleText("1983");
		// Major of Interest- multi select
		driver.findElement(By.className("multiselect")).click();
		/*
		 * Select g= new Select(driver.findElement(By.className("option-container")));
		 * g.selectByVisibleText("Engineering");
		 * g.selectByVisibleText("Engineering technologies/technicians");
		 */
		driver.findElement(By.id("questions[q_19][13]")).click();
		driver.findElement(By.id("questions[q_19][14]")).click();
		driver.findElement(By.id("questions[q_19][24]")).click();
		driver.findElement(By.className("multiselect")).click();
		//driver.findElement(By.className("icon close")).click();
		//Consent
		//driver.findElement(By.id("questions[q_135]")).click();
		//driver.findElement(By.id("questions[q_136]")).click();
		//driver.findElement(By.id("questions[q_137]")).click();
		//submit
		driver.findElement(By.id("submit")).click();
	}

}
