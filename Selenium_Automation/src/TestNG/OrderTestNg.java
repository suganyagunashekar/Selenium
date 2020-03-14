package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OrderTestNg {
	@Test
	  public void f() {
		  System.out.println("@Ftest");
  }
	@Test
	  public void a() {
		  System.out.println("@Atest");
	}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BM");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AM");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BC");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AC");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AT");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BS");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AS");
  }

}
