package LocatorasDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {
	public static void main(String arg[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "D:\\CTS Testing\\Tarun\\HyperLinks.html";

		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Click Here")).click();
		System.out.println("The Page Title Is:-" + driver.getTitle());
		Thread.sleep(5000);

		driver.navigate().back();

		driver.findElement(By.linkText("Now Click Me")).click();
		System.out.println("The Page Title Is:-" + driver.getTitle());
		Thread.sleep(5000);

		driver.navigate().back();

		driver.findElement(By.linkText("Click Me")).click();
		System.out.println("The Page Title Is:-" + driver.getTitle());

		/* Calculator */

		driver.findElement(By.linkText("Calculators")).click();
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		System.out.println("Number of Links:" + linkCount);
		for (int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

		/* Converter */

		System.out.println("\n\n\nSecond Link");

		driver.findElement(By.linkText("Converters")).click();
		Thread.sleep(5000);
		List<WebElement> links1 = driver.findElements(By.xpath("//a"));
		int linkCount1 = links1.size();
		System.out.println("Number of Links:" + linkCount1);
		for (int i = 1; i < links1.size(); i++) {
			System.out.println(links1.get(i).getText());
		}

		/* Formulas */

		System.out.println("\n\n\nThird Link");
		driver.findElement(By.linkText("Formulas")).click();
		Thread.sleep(5000);
		List<WebElement> links2 = driver.findElements(By.xpath("//a"));
		int linkCount2 = links2.size();
		System.out.println("Number of Links:" + linkCount2);
		for (int i = 1; i < links2.size(); i++) {
			System.out.println(links2.get(i).getText());
		}

		/* Currencies */

		System.out.println("\n\n\nFourth Link");
		driver.findElement(By.linkText("Currencies")).click();
		Thread.sleep(5000);
		List<WebElement> links3 = driver.findElements(By.xpath("//a"));
		int linkCount3 = links3.size();
		System.out.println("Number of Links:" + linkCount3);
		for (int i = 1; i < links3.size(); i++) {
			System.out.println(links3.get(i).getText());
		}

		/* Charts */

		System.out.println("\n\n\nFifth Link");
		driver.findElement(By.linkText("Charts")).click();
		Thread.sleep(5000);
		List<WebElement> links4 = driver.findElements(By.xpath("//a"));
		int linkCount4 = links4.size();
		System.out.println("Number of Links:" + linkCount4);
		for (int i = 1; i < links4.size(); i++) {
			System.out.println(links4.get(i).getText());
		}
		/* Examples */

		System.out.println("\n\n\nSixth  Link");
		driver.findElement(By.linkText("Examples")).click();
		Thread.sleep(5000);
		List<WebElement> links5 = driver.findElements(By.xpath("//a"));
		int linkCount5 = links5.size();
		System.out.println("Number of Links:" + linkCount5);
		for (int i = 1; i < links5.size(); i++) {
			System.out.println(links5.get(i).getText());
		}

		Thread.sleep(5000);
		driver.quit();

	}
}
