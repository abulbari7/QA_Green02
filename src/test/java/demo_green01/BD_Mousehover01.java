package demo_green01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BD_Mousehover01 {
	
	@Test
	public void bari() throws InterruptedException {
		
		// System setup code
		System.setProperty("Webdriver.chrom.driver", "C:\\Users\\abulb\\Documents\\ChromeDriver");
		
		// Create Object of the WebDriver
		WebDriver dallas = new ChromeDriver();
		
		// Launch URL
		dallas.get("https://www.espncricinfo.com/");
		
		// Apply waits(Implicit)
		dallas.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		dallas.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Apply page Maximize		
		dallas.manage().window().maximize();
		
		Actions dhaka = new Actions(dallas); 	// Actions class for Mouse hover
		dhaka.moveToElement(dallas.findElement(By.xpath("//a[@title=\"Cricket Teams\"]"))).build().perform();
		dallas.findElement(By.xpath("//span[text()='Bangladesh']")).click();
		
		
	}

}
