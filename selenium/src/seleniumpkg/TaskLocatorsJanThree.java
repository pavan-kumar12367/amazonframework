package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskLocatorsJanThree {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.starbucks.in/profile");
		WebElement login = driver.findElement(By.xpath("//button[text()='Login or Sign Up']"));
		String text = login.getText();
		System.out.println(text);
		if(text.equals("Login or Sign Up")) {
			System.out.println("Text verified");
		}
		else {
			System.out.println("Text Not verified");
		}
		driver.findElement(By.xpath("//button[@class=\"custom-btn btn-black btn-lg-rounded mt-2\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
