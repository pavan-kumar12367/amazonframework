package seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebPage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone");
		Thread.sleep(3000);
		
		List<WebElement> productlist = driver.findElements(By.xpath("//div[@class = 's-suggestion-container']/div"));
		System.out.println(productlist.size());
		for(int i=0;i<=productlist.size();i++) {
			System.out.println(productlist.get(i).getText());
			if(productlist.get(i).getText().equalsIgnoreCase("iphone 15 pro")) {
				productlist.get(i).click();
				break;
			}
			}
		Thread.sleep(5000);
		driver.quit();
		

}
}