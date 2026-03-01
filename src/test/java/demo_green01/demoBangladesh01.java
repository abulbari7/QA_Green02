package demo_green01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoBangladesh01 {
	
	@Test
	public void bari() throws InterruptedException {
		
		// System setup code
		System.setProperty("Webdriver.chrom.driver", "C:\\Users\\abulb\\Documents\\ChromeDriver");
		
		// Create Object of the WebDriver
		WebDriver dallas = new ChromeDriver();
		
		// Launch URL
		dallas.get("https://demoblaze.com/index.html");
		
		// Apply waits(Implicit)
		dallas.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		dallas.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Apply page Maximize		
		dallas.manage().window().maximize();
		
		dallas.findElement(By.id("login2")).click();
		
		Thread.sleep(2000);		// used explicit wait
		
		dallas.findElement(By.id("loginusername")).sendKeys("abulbari");
		dallas.findElement(By.id("loginpassword")).sendKeys("arib123");
		
		Thread.sleep(3000);		// used explicit wait
		
		dallas.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
		
		Thread.sleep(5000); 		// used explicit wait
				
		dallas.findElement(By.id("logout2")).click();
		
		
	}

}
