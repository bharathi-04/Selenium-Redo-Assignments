package week2.day2.MyHomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsCreateAndDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Syntax for Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Attribute Based Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf - Always Ahead");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bharathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sivalingam");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();

	}

}
