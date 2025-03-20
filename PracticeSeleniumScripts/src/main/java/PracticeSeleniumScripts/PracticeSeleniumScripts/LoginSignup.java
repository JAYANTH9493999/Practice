package PracticeSeleniumScripts.PracticeSeleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSignup{

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("testusername");
		driver.findElement(By.name("pass")).sendKeys("password1");
		driver.findElement(By.name("btnSubmit")).click();
		driver.findElement(By.id("right_col_top_err")).getText();
		driver.findElement(By.linkText("Sign Up For Free")).click();
		driver.findElement(By.id("name")).sendKeys("Jayanth");
	    driver.findElement(By.name("email")).sendKeys("jayanth@gmail.com");
	    driver.findElement(By.name("user_signup")).sendKeys("Jayanth02");
	    driver.findElement(By.name ("pass_signup")).sendKeys("123456");
	    driver.findElement(By.id("pass2")).sendKeys("123456");
	    driver.findElement(By.id("useragree")).click();
	    driver.findElement(By.name("Submit")).click();
	}
}
	    