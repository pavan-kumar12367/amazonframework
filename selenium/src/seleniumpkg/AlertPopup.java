package seleniumpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert.click();
		
			
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);
		
		WebElement okbutton = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel '] "));
		okbutton.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		alt.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		alt.sendKeys("hi pavan");
		
		String text=alt.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		driver.quit();

	}

}
