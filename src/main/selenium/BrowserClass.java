package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {
	
	static String browser = "chrome";
	protected static WebDriver driver;
	protected static String URL = "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT";
	
	public static void OpenBrowser(){
		
		if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace\\CTM\\src\\main\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}else{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\workspace\\CTM\\src\\main\\java\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser(){
		driver.close();
	}

	

}
