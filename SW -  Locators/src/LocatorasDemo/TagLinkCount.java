
/* TagLink Case Study: 

 * Step 1:  Open URL by using any Browser Chrome, IE, 
 * 			FireFox(https://store.webkul.com)
 * Step 2:  Use TestNG/Junit Annotations
 * Step 3:  Varify Title of Page and Validate PageTitle by Assertions
 * Step 4:  Count Number of Weblinks in Page and Print
 * */

package LocatorasDemo;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TagLinkCount {
	WebDriver driver;
	List<WebElement> list;
	int linkCount;

	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void findElementByTagName() throws InterruptedException {
		driver.navigate().to("https://store.webkul.com");
		String actual = driver.getTitle();
		assertEquals(actual, "Premium Magento Prestashop Openerp Plugins & Themes - WebKul");

		Thread.sleep(5000);

		list = driver.findElements(By.tagName("a"));
		System.out.println("Number of a links-" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		linkCount = list.size();
		System.out.println("Total no of links-" + linkCount);
	}

	@AfterTest
	public void tearDown() throws Exception {
		assertEquals(list.size(), linkCount);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
