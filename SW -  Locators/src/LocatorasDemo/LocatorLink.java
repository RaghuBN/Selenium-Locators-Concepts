package LocatorasDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorLink {
	@Test
	public void TestLink() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.easycalculation.com");
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int nolinks=links.size();
		System.out.println("No.Of links in Calculation: " +nolinks);
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			
			String str=links.get(i).getText();
			String str1="Love Calculator";
			if(str.equals(str1)) {
				driver.findElement(By.linkText("Love Calculator")).click();
				driver.findElement(By.xpath("//*[@id=\"alarmContentDisplay\"]/div[1]/div[6]/div[2]/div[1]/ul/li[2]/a")).click();

			}
		}
	}
}
