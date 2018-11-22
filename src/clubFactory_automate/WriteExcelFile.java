package clubFactory_automate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class WriteExcelFile {

	@Test
	public void test(){
		
	System.out.println("Selenium Script Excuted");

	}
	
	/*public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	
		String name = "ghdfbc";
		String website = "https://www.clubfactory.com/views/home.html";
		String itemLink = "https://cfshare1.fromfactory.club/theme/collect_like/progress?share=4844070";
		
		int i;
		
		for(i=5700; i<=5800; i++) {
		
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
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/a[1]/span[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/input[1]")).sendKeys(name + i + "@gmail.com");
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[3]/input[1]")).sendKeys("Mahipal5167");

		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/a[1]/span[1]")).click();
		
		driver.get(itemLink);
		
		driver.findElement(By.className("like_btn")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/button[2]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(name + i + "@gmail.com");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/input[1]")).sendKeys("Mahipal5167");
		
		driver.findElement(By.className("login")).click();
				
        Thread.sleep(2000);
		
		driver.findElement(By.className("like_btn")).click();
		
		driver.quit();
		
		File src= new File("G:\\cb\\cbdata.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0); 
		
		sheet1.getRow(a).createCell(0).setCellValue(name + i + "@gmail.com");
		
		sheet1.getRow(a).createCell(1).setCellValue("Mahipal5167");
		
		FileOutputStream fos = new FileOutputStream(src);
		
		wb.write(fos);
		
		a++;
		
		wb.close();

		}
		
	}*/
}
