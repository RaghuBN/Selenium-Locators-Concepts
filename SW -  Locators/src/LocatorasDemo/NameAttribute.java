package LocatorasDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAttribute
{
	public static void main (String arg[]) throws Exception
	{
		
	/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();	
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
	driver.findElement(By.id("layered_id_attribute_group_1")).click();
*/

/*	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/bnuft/Desktop/id.html");
	driver.manage().window().maximize();	
	
	driver.findElement(By.name("username")).sendKeys("raghavendra");
	driver.findElement(By.name("password")).sendKeys("raghu");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/input[3]")).click();
	
	driver.quit();*/
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/bnuft/Desktop/Name.html");
	driver.manage().window().maximize();	
	
	driver.findElement(By.name("")).sendKeys("");
	driver.findElement(By.name("password")).sendKeys("raghu");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/input[3]")).click();
	
	driver.quit();
}
}