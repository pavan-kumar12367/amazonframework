package seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws Exception {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("-remote--allow--origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("hyd");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
		for(WebElement t : list) {
			System.out.println(t.getText());
			if(t.getText().equals("Hyderabad")) {
				t.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
