package kr.re.ec.seleniumexample.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Selenium simple example
 * @author Taehee Kim
 */
public class SeleniumExample {
	public void start() throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver.loglevel", "DEBUG");
		System.setProperty("webdriver.ie.driver.logfile", "IEDriverServer.log");
		
		WebDriver driver = new InternetExplorerDriver(); 

		driver.get("http://webqamanh/wmweb/");
		
		driver.findElement(By.name("userID")).sendKeys("EB5235");
		driver.findElement(By.name("userPassword")).sendKeys("PEPETAPIAD");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(3000);
		// Abre menú
		driver.switchTo().frame("fraBottom");
		driver.switchTo().frame("fraNavigator");
		driver.findElement(By.xpath("//span[.='Mod Distribucion y Olas']")).click();
		driver.findElement(By.xpath("//span[.='Mod Wave Mgmt Inquiries']")).click();
		
		driver.quit();
	}
}

