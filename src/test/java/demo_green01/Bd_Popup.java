package demo_green01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bd_Popup {
	
	@Test
	public void bari() throws InterruptedException {
		
		// System setup code
		System.setProperty("Webdriver.chrom.driver", "C:\\Users\\abulb\\Documents\\ChromeDriver");
		
		// Create Object of the WebDriver
		WebDriver dallas = new ChromeDriver();
		
		// Launch URL
		dallas.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Apply waits(Implicit)
		dallas.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		dallas.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Apply page Maximize		
		dallas.manage().window().maximize();
		
		dallas.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		dallas.switchTo().alert().accept();
		dallas.findElement(By.id("login1")).sendKeys("abulbari");
		
		
	}

}
