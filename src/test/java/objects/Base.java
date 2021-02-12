package objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	protected Properties prop;
	
	WebDriver driver;

	public WebDriver initialize() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Prerna Pandey\\eclipse-workspace\\Myntra\\resources\\data.properties");
		

		prop=new Properties();
		
		prop.load(fis);
		
		if(prop.getProperty("browser").contains("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
			
		}
		
		
		
		
		return driver;
	}
	
}
