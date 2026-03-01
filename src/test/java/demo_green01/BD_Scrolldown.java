package demo_green01;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BD_Scrolldown {
	
	@Test
	public void bari() throws InterruptedException {
		
		// System setup code
		System.setProperty("Webdriver.chrom.driver", "C:\\Users\\abulb\\Documents\\ChromeDriver");
		
		// Create Object of the WebDriver
		WebDriver dallas = new ChromeDriver();
		
		// Launch URL
		dallas.get("https://www.google.com/finance/");
		
		// Apply waits(Implicit)
		dallas.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		dallas.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Apply page Maximize		
		dallas.manage().window().maximize();

		JavascriptExecutor irving = (JavascriptExecutor)dallas;		
		irving.executeScript("scroll(0,2000)");
		
		((JavascriptExecutor)dallas).executeScript("scroll(0,2000)");
		//dallas.findElement(By.linkText("Help")).click();
		
	}

}
