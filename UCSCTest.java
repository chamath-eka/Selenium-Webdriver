import java.io.IOException;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class UCSCTest {
        public static void main(String[] args) throws IOException,
InterruptedException {
		
		
                System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();

                
                WebDriver driver = new ChromeDriver(chromeOptions);

		
                driver.get("https://google.com");
                Thread.sleep(1000);

		
		driver.findElement(By.name("q")).sendKeys("UCSC Sri Lanka");
		Thread.sleep(5000);

		
		driver.findElement(By.name("btnK")).click();

		System.out.println(driver.findElement(By.className("st")).getText());
		
		

                driver.quit();
        }
}
