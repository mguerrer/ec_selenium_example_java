package kr.re.ec.seleniumexample.java;

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

		driver.get("http://www.seoultech.ac.kr");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}

