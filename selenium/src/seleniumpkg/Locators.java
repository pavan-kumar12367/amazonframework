package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("-remote--allow--origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		//Thread.sleep(6000);
		//driver.quit();
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input")).sendKeys("7893001042");
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		driver.findElement(By.id("YINDrQTZApixlgM")).click();
//		Thread.sleep(2000);
//		driver.quit();
//		

		
		
		
		
		
		
		
	}

}
