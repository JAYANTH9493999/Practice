package PracticeSeleniumScripts.PracticeSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main (String []arays)
	{
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get ("https://www.mycontactform.com/samples.php");
		
		driver.findElement(By.linkText("Simple Web Feedback")).click();
		driver.findElement(By.name("q[1]")).sendKeys("king");
		driver.findElement(By.name("email")).sendKeys("jaadjjh@gmail.com");
		driver.findElement(By.name("q[2]")).click();
		driver.findElement(By.name("q[3]")).click();
		driver.findElement(By.name("q[4]")).sendKeys("I am Facing Issues");
		driver.findElement(By.name("submit")).click();
	}
	
}

