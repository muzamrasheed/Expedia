package mavenproject.expedia_BC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expedia {
 public static WebDriver driver = null;
 public static void wait1() {
	 WebDriverWait wait1= new WebDriverWait (driver, 15);
	 wait1.until(ExpectedConditions.elementToBeClickable(By.id("flight-returning-flp")));	 
 }
 public static void wait2() {
	 WebDriverWait wait2= new WebDriverWait (driver, 15);
	 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@class='continueBookingForm']")));	 
 }
 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muzam\\eclipse-workspace\\assainments\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver (); 
		driver.get("https://www.expedia.com/");
		
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
		wait2();
		driver.findElement(By.xpath("//form[@class='continueBookingForm']")).click();
	
	}
	

}
