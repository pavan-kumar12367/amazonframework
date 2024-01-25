package seleniumpkg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		
		WebElement alertbox = driver.findElement(By.xpath("//a[@class='w3-btn w3-margin-bottom']"));
		WebElement confirmationbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		alertbox.click();
		confirmationbox.click();
		prompt.click();
		line.click();
		Thread.sleep(2000);
		
		ArrayList<String>add=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(add.get(4));
		Thread.sleep(2000);
		driver.quit();
		
		
				
	}

}
