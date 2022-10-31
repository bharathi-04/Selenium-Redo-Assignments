package week2.day1_ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//		
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
//		
		driver.findElement(By.className("decorativeSubmit")).click();
//		
//		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
