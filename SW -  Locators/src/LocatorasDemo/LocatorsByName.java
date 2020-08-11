package LocatorasDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsByName {
	@Test
	public void TestRegister()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.name("firstName")).sendKeys("aparna");
		driver.findElement(By.name("lastName")).sendKeys("kadire");
		driver.findElement(By.name("phone")).sendKeys("9704772567");
		driver.findElement(By.name("userName")).sendKeys("aparna kaderi");
		driver.findElement(By.name("address1")).sendKeys("Byrapuram");
		driver.findElement(By.name("address2")).sendKeys("Nandikotkur");
		driver.findElement(By.name("city")).sendKeys("Kurnool");
		driver.findElement(By.name("state")).sendKeys("AP");
		driver.findElement(By.name("postalCode")).sendKeys("518405");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("email")).sendKeys("aparnakaderi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("aparna1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("aparna1234");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input\r\n" + 
				"")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table"));
        
	}
}
