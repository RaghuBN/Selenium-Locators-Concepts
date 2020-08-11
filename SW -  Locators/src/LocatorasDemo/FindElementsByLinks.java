package LocatorasDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementsByLinks {

	WebDriver driver;
	int Total = 0;

	@BeforeTest
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void findElementById() throws InterruptedException {

		/*-------------------------- Demo Calculator com--------------------------------------*/
		System.out.println("\n\n\nFirst Link");

		driver.navigate().to("https://www.easycalculation.com/");
		Thread.sleep(10000);

		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");

		driver.findElement(By.linkText("Calculators")).click();

		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links = driver.findElements(By.xpath("//a"));

		int linkCount = links.size();
		Total = Total + links.size();

		System.out.println("Number of Links:" + linkCount);

		for (int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());

		}

		System.out.println("\n\n\nSecond Link");

		/*-------------------------- Demo Converters com--------------------------------------*/

		driver.findElement(By.linkText("Converters")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links1 = driver.findElements(By.xpath("//a"));

		int linkCount1 = links1.size();
		Total = Total + links1.size();

		System.out.println("Number of Links:" + linkCount1);

		for (int i = 1; i < links1.size(); i++) {
			System.out.println(links1.get(i).getText());
		}

		System.out.println("\n\n\nThird Link");

		/*-------------------------- Demo Formulas com--------------------------------------*/

		driver.findElement(By.linkText("Formulas")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links2 = driver.findElements(By.xpath("//a"));

		int linkCount2 = links2.size();
		Total = Total + links2.size();

		System.out.println("Number of Links:" + linkCount2);

		for (int i = 1; i < links2.size(); i++) {
			System.out.println(links2.get(i).getText());
		}

		System.out.println("\n\n\nFourth Link");

		/*-------------------------- Demo Currencies  com--------------------------------------*/

		driver.findElement(By.linkText("Currencies")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links3 = driver.findElements(By.xpath("//a"));

		int linkCount3 = links3.size();
		Total = Total + links3.size();

		System.out.println("Number of Links:" + linkCount3);

		for (int i = 1; i < links3.size(); i++) {
			System.out.println(links3.get(i).getText());
		}

		System.out.println("\n\n\nFifth Link");

		/*-------------------------- Demo Charts com--------------------------------------*/

		driver.findElement(By.linkText("Charts")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links4 = driver.findElements(By.xpath("//a"));

		int linkCount4 = links4.size();
		Total = Total + links4.size();

		System.out.println("Number of Links:" + linkCount4);

		for (int i = 1; i < links4.size(); i++) {
			System.out.println(links4.get(i).getText());
		}

		System.out.println("\n\n\nSixth Link");

		/*-------------------------- Demo Charts com--------------------------------------*/

		driver.findElement(By.linkText("Examples")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links5 = driver.findElements(By.xpath("//a"));

		int linkCount5 = links5.size();
		Total = Total + links5.size();

		System.out.println("Number of Links:" + linkCount5);

		for (int i = 1; i < links5.size(); i++) {
			System.out.println(links5.get(i).getText());
		}

		System.out.println("\n\n\nSeventh Link");

		/*-------------------------- Demo  Tutorials  com--------------------------------------*/

		driver.findElement(By.linkText("Tutorials")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links6 = driver.findElements(By.xpath("//a"));

		int linkCount6 = links6.size();
		Total = Total + links6.size();

		System.out.println("Number of Links:" + linkCount6);

		for (int i = 1; i < links6.size(); i++) {
			System.out.println(links6.get(i).getText());
		}

		System.out.println("\n\n\nEighth Link");

		/*-------------------------- Demo  Answers  com--------------------------------------*/

		driver.findElement(By.linkText("Answers")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links7 = driver.findElements(By.xpath("//a"));

		int linkCount7 = links7.size();
		Total = Total + links7.size();

		System.out.println("Number of Links:" + linkCount7);

		for (int i = 1; i < links7.size(); i++) {
			System.out.println(links7.get(i).getText());
		}

		System.out.println("\n\n\nNinth Link");

		/*-------------------------- Demo  Others  com--------------------------------------*/

		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(10000);
		// driver.findElement(By.className("nav-input")).sendKeys("redmi");

		List<WebElement> links8 = driver.findElements(By.xpath("//a"));

		int linkCount8 = links8.size();
		Total = Total + links8.size();

		System.out.println("Number of Links:" + linkCount8);

		for (int i = 1; i < links8.size(); i++) {
			System.out.println(links8.get(i).getText());
		}

		System.out.println("Total no of links in websites-" + Total);

	}

	@AfterTest
	public void tearDown() {
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
