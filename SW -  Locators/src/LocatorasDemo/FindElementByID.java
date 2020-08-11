package LocatorasDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByID {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void findElementById() throws InterruptedException {
		driver.navigate().to("https://www.easycalculation.com");
		driver.findElement(By.id("googleSearchId")).sendKeys("Hyderabad");
		// driver.findElement(By.name("q")).sendKeys("Hyderabad");
		// driver.findElement(By.className("search_txt")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/span[2]/button")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}
