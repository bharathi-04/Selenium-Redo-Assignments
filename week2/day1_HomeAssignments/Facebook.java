package week2.day1_HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.partialLinkText("New")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Bharathi");
		
		driver.findElement(By.name("lastname")).sendKeys("Sivalingam");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9003052527");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");
		
		WebElement dayselection = driver.findElement(By.id("day"));
		Select obj= new Select(dayselection);
		obj.selectByValue("4");
				
		WebElement monthselection = driver.findElement(By.id("month"));
		Select obj1= new Select(monthselection);
		obj1.selectByVisibleText("Jul");
		
		WebElement yearselection = driver.findElement(By.id("year"));
		Select obj2= new Select(yearselection);
		obj2.selectByIndex(5);
		
		driver.findElement(By.name("sex")).click();
		
		
	}

}
