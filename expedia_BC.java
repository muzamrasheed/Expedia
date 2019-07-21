package mavenproject.expedia_BC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class expedia_BC {
	public static WebDriver driver = null;
	public static void wait1() {
		 WebDriverWait wait1= new WebDriverWait (driver, 15);
		 wait1.until(ExpectedConditions.elementToBeClickable(By.id("flight-returning-flp")));	 
	 }
	 public static void wait2() {
		 WebDriverWait wait2= new WebDriverWait (driver, 15);
		 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@class='continueBookingForm']")));	 
	 }
	
  @Test
  public void f() throws InterruptedException {
	  	driver.findElement(By.id("primary-header-flight")).click();
	  	driver.findElement(By.xpath("(//input[@data-tooltip-id='typeaheadDataPlain'])[1]")).sendKeys("PHL-Philadelphia Intl.");
		driver.findElement(By.xpath("(//input[@data-tooltip-id='typeaheadDataPlain'])[2]")).sendKeys("MIA-Miami Intl.");
		driver.findElement(By.id("flight-departing-flp")).sendKeys("09/01/2019");
		Thread.sleep(8000);
		wait1();
		driver.findElement(By.id("flight-returning-flp")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='datepicker-cal-date'][contains(text(),'27')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='submit'])[11]")).click();
		Thread.sleep(8000);
		
		
		driver.findElement(By.xpath("//li[@id='flight-module-2019-09-01t08:35:00-04:00-coach-phl-mia-aa-1533_2019-09-27t16:40:00-04:00-coach-mia-phl-f9-2334_']//div[contains(@class,'grid-container standard-padding')]//button[@class='btn-secondary btn-action t-select-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='basic-economy-tray-content-4']//button[@class='btn-secondary btn-action t-select-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='flight-module-2019-09-01t08:35:00-04:00-coach-phl-mia-aa-1533_2019-09-27t06:15:00-04:00-coach-mia-clt-aa-2358-coach-clt-phl-aa-396_']//div[contains(@class,'grid-container standard-padding')]//button[@class='btn-secondary btn-action t-select-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='basic-economy-tray-content-8']//button[@class='btn-secondary btn-action t-select-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("forcedChoiceNoThanks")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\muzam\\eclipse-workspace\\assainments\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver (); 
		driver.get("https://www.expedia.com/");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
