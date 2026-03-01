package demo_green01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demotestng01 {
	
	@Test
	public void opu() throws InterruptedException {
		
		System.setProperty("Webdriver.chrom.driver", "C:\\Users\\abulb\\Documents\\ChromeDriver");
		WebDriver dallas = new ChromeDriver();
		
		dallas.get("https://www.dell.com/en-us");
		dallas.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		dallas.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		dallas.manage().window().maximize();
		
				
		//Actions ac = new Actions(dallas);
		
		//ac.moveToElement(dallas.findElement(By.xpath("//a[text() = 'Teams']"))).build().perform();
		//dallas.findElement(By.linkText("Bangladesh")).click();		
		
		//dallas.findElement(By.name("proceed")).click();
		//Thread.sleep(3000);
		
		//dallas.switchTo().alert().accept();
		//dallas.findElement(By.id("login1")).sendKeys("abulbari");
		
		//dallas.switchTo().frame("classFrame");
		//dallas.findElement(By.linkText("Deprecated")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor) dallas;
		//js.executeScript("scroll(0,200)");
		
		//((JavascriptExecutor)dallas).executeScript("scroll(0,500)");		
		//dallas.findElement(By.linkText("Help")).click();
		
		
		
	}

}
