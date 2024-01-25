package seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrtc {
    public static void main(String[] args) throws Exception{
    
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
        driver.manage().window().maximize();

        WebElement fromPlace = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
        fromPlace.sendKeys("bhimavaram");
        Thread.sleep(3000);

        List<WebElement> aps = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a/span"));

        for (WebElement e:aps) {
            if (e.getText().equalsIgnoreCase("pydibhimavaram")) {
                e.click();
                break;  // Exit the loop after clicking the desired option
            }
        }

        // Close the browser
        
        Thread.sleep(4000);
        driver.quit();
    }
}
