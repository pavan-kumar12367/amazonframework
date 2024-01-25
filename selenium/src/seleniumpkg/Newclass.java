package seleniumpkg;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //WebDriver driver = new ChromeDriver();
		WebDriver driver = new SafariDriver();
		driver.get("https://www.amazon.com/");

}
}