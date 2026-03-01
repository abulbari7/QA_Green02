package demo_green01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BD_dropdown01 {
	
	@Test
	public void bari() throws InterruptedException {
		
		// System setup code
		System.setProperty("Webdriver.chrom.driver", "C:\\Users\\abulb\\Documents\\ChromeDriver");
		
		// Create Object of the WebDriver
		WebDriver dallas = new ChromeDriver();
		
		// Launch URL
		//dallas.get("https://www.ebay.com/");
		dallas.get("https://www.amazon.com/ref=nav_logo");
		
		// Apply waits(Implicit)
		dallas.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		dallas.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Apply page Maximize		
		dallas.manage().window().maximize();
		
		//Select irving = new Select(dallas.findElement(By.id("gh-cat")));
		//irving.selectByVisibleText("Books");
		//irving.selectByValue("2984");
		//irving.selectByIndex(2);
		
		Select irving = new Select(dallas.findElement(By.id("searchDropdownBox")));
		irving.selectByVisibleText("Amazon Autos");
		
		
	}	

}
