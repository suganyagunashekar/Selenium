package webdriver;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertMessageTTD {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://ttdsevaonline.com/#/registration");
			Thread.sleep(3000);
			// Maximize the screen
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//Click on Continue button
			driver.findElement(By.id("regi_continue")).click();
			Thread.sleep(5000);
			WebElement Element=driver.findElement(By.xpath("(//button[text()='Ok'])[2]"));
			Element.click();
		/*
		 * js.executeScript("arguments[0].scrollIntoView();", Element); String
		 * AlrMess=driver.switchTo().alert().getText(); System.out.println(AlrMess);
		 * driver.switchTo().alert().accept();
		 */
			Thread.sleep(3000);
			String actualFirstNameErrMsg =driver.findElement(By.xpath("(//*[contains(text(),'First Name c')])[1]")).getText();
			System.out.println(actualFirstNameErrMsg);
			
			//validate error message
		
			//**********************
			//First Name
			String expectedFirstNameErrMsg = "First Name cannot be empty";
			
			//if (expectedFirstNameErrMsg.equalsIgnoreCase(actualFirstNameErrMsg)) {
			//	System.out.println("Error message is as Expected");
			//} else {
			//	System.out.println("Error message is not as Expected-Fail");
			//}
						
			// using Assertions
			Assert.assertEquals(actualFirstNameErrMsg, expectedFirstNameErrMsg,"Error message is not as Expected-Fail....");
			
			//******************************
			//Mobile Number
			String actualMobileNumberErrMsg =driver.findElement(By.xpath("(//*[contains(text(),'Mobile Number c')])[1]")).getText();
			System.out.println(actualMobileNumberErrMsg);
			String expectedMobileNumberErrMsg="Mobile Number cannot be empty";
			
			Assert.assertEquals(actualMobileNumberErrMsg, expectedMobileNumberErrMsg,"Error message is not as Expected-Fail....");
			//Date of Birth 
			//******************
			String actualDOBErrMsg =driver.findElement(By.xpath("(//*[contains(text(),'Date of Birth')])[2]")).getText();
			System.out.println(actualDOBErrMsg);
			String expectedDOBErrMsg="Please select the calendar to enter ‘Date of Birth’";
			
			Assert.assertEquals(actualDOBErrMsg, expectedDOBErrMsg,"Error message is not as Expected-Fail....");
			//Address Line 1
			//***********************
			String actualAddressErrMsg =driver.findElement(By.xpath("(//*[contains(text(),'Address Line')])[2]")).getText();
			System.out.println(actualAddressErrMsg);
			String expectedAddressErrMsg="Address Line 1 cannot be empty";
			
			Assert.assertEquals(actualAddressErrMsg, expectedAddressErrMsg,"Error message is not as Expected-Fail....");
			//City 
			//***********
			
			String actualCityErrMsg =driver.findElement(By.xpath("(//*[contains(text(),'City')])[1]")).getText();
			System.out.println(actualCityErrMsg);
			String expectedCityErrMsg="City cannot be empty";
			
			Assert.assertEquals(actualCityErrMsg, expectedCityErrMsg,"Error message is not as Expected-Fail....");
					
						
			
			
			
			
			
			
}}
