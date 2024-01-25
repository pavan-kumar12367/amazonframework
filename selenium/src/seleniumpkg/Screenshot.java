package seleniumpkg;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("-remote--allow--origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;

		for (int i = 1; i <= 5; i++) {

			File source = ts.getScreenshotAs(OutputType.FILE);

			File dest = new File("D:\\New folder\\Image"+i+".jpeg");

			FileHandler.copy(source, dest);

			

		}
		driver.quit();
	}
}
