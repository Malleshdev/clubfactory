package clubFactory_automate;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	
		String name = "marthxv";
		String website = "https://cfshare1.fromfactory.club/theme/collect_like/dispatch?product_id=494661&schedule=337&starter=64993502";
	
		for(int i=52700; i<=52730; i++) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MahiiPal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google S5");
		
		Map<String, Object> chromeOptionss = new HashMap<String, Object>();
		chromeOptionss.put("mobileEmulation", mobileEmulation);
		
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver.get(website);
	
		driver.findElement(By.className("like_btn")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"login-container\"]/div[6]/div[2]/input[1]")).click();
		
		driver.findElement(By.name("old_email")).sendKeys(name + i + "@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"login-container\"]/div[4]/div[1]/input[1]")).sendKeys("Mahipal5167");

		driver.findElement(By.xpath("//*[@id=\"login-container\"]/div[4]/input[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("like_btn")).click();
		
		
		
		}
	}
	
}
