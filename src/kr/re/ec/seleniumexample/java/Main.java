package kr.re.ec.seleniumexample.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Main {
	static WebDriver driver = null;
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver.loglevel", "DEBUG");
			System.setProperty("webdriver.ie.driver.logfile", "IEDriverServer.log");
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.ignoreZoomSettings();
			options.withInitialBrowserUrl("http://webqamanh/wmweb/");
			
			driver = new InternetExplorerDriver(options); 
			driver.manage().window().maximize();
	
			//driver.get("http://webqamanh/wmweb/");
			
			driver.findElement(By.name("userID")).sendKeys("EB5235");
			driver.findElement(By.name("userPassword")).sendKeys("PEPETAPIAD");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(3000);
			// Abre menú
			driver.switchTo().frame("fraBottom");
			driver.switchTo().frame("fraNavigator");
			driver.findElement(By.xpath("//span[.='Mod Distribucion y Olas']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Mod Wave Mgmt Inquiries']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//a[.='Cons/Mant: Pedido']")).click();
			String numeroOrden = "110363832";
			driver.switchTo().defaultContent();
			driver.switchTo().frame("fraBottom");
			driver.switchTo().frame("fraRight");
			driver.switchTo().frame("fraCriteria");
			WebElement Pickticket = driver.findElement(By.xpath("//input[@name='PKTCTRLNBR']"));
			HighLightElement(Pickticket);
			Pickticket.click();
			Pickticket.sendKeys(numeroOrden);
	
			driver.quit();
		} catch (InterruptedException e) {
			System.out.println("FATAL: " + e.getMessage());
			e.printStackTrace();
		}
	}
    public static void HighLightElement(WebElement element) {
		ExecuteJsScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid blue;');", element);
    }
	public static void ExecuteJsScript(String script, java.lang.Object... args) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script, args);
    }
}
