package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import selenium.BrowserClass;

public class SupplierClass extends BrowserClass {
	
	public static void OpenEnergyQuotePage(){
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='ctm-logo']/img")).isDisplayed();
		driver.findElement(By.xpath("//nav[@id='header-container']/section/button/h1")).isDisplayed();
		driver.findElement(By.xpath("/html/body/footer")).isDisplayed();
	}
	
	public static void enterPostCode(){
		try {
			
			driver.findElement(By.id("your-postcode")).sendKeys("PE2 6YS");
			driver.findElement(By.id("find-postcode")).click();
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void gasCurrentSupplierDetails() throws InterruptedException{
		
		driver.findElement(By.id("have-bill-label")).click();
		driver.findElement(By.xpath("//label[@id='compare-gas-label']/span[1]")).click();
		driver.findElement(By.xpath("//fieldset[@id='gas-energy-suppliers-question']//label[3]/span[1]")).click();
		nextButton();
	}

	public static void electricityCurrentSupplierDetails() throws InterruptedException{
		
		noBill();
		driver.findElement(By.xpath("//label[@id='compare-electricity-label']/span[1]")).click();
		driver.findElement(By.xpath("//fieldset[@id='elec-energy-suppliers-question']/div/div/div[3]/label/span")).click();
		nextButton();
	}
	
	public static void gasAndElectricityCurrentSupplierDetails() throws InterruptedException{
		
		noBill();
		driver.findElement(By.xpath("//label[@id='compare-both-label']/span[1]")).click();
		driver.findElements(By.xpath("//select[@id='sel1']/option[2]")).get(0).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//fieldset[@id='gas-energy-suppliers-question']//div[3]/label/span")).click();
		nextButton();
	}
	
	private static void nextButton(){
		driver.findElement(By.id("goto-your-supplier-details")).click();
	}
	
	private static void noBill(){
		driver.findElement(By.id("no-bill-label")).click();
	}
	
	
}
