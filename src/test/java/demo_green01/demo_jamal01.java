package demo_green01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_jamal01 {

	public static void main(String[] args) {
		// Create Setup code and Launch URL
		
		System.setProperty("Webdriver.chrom.driver", "C:\\Users\\abulb\\Documents\\ChromeDriver");
		
		WebDriver dallas = new ChromeDriver();
		
		dallas.get("https://demoblaze.com/index.html");
		dallas.manage().window().maximize();
		
		dallas.findElement(By.id("login2")).click();
		
		dallas.findElement(By.id("loginusername")).sendKeys("abulbari");
		dallas.findElement(By.id("loginpassword")).sendKeys("arib123");
		dallas.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
		
			
		
		//dallas.close();
			
		

	}

}
