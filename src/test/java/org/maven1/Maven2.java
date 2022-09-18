package org.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Nikhilsaran");
		driver.findElement(By.id("password")).sendKeys("6333CS");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s = Select(loc);
		s.selectByIndex(2);
	
		
		
	}

	private static Select Select(WebElement loc) {
		// TODO Auto-generated method stub
		return null;
	}

}
