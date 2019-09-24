package Pages;

import org.openqa.selenium.By;

import selenium.BrowserClass;

public class DetailsClass extends BrowserClass {
	
	
	public static void gasPreferences(){
		
		driver.findElement(By.xpath("//div[@id='tariff-selection-question']/div/label[1]/span[1]/span")).click();
		driver.findElement(By.xpath("//div[@id='payment-selection-question']//div[1]/label[1]/span[1]")).click();
		yourContactDetails();
	}
	
	public static void electricityPreferences(){
		
		driver.findElement(By.xpath("//div[@id='tariff-selection-question']/div/label[2]/span[1]")).click();
		yourContactDetails();
	}

	public static void gasAndElectricityPreferences(){
		
		driver.findElement(By.xpath("//div[@id='tariff-selection-question']//label[3]/span[1]/span")).click();
		driver.findElement(By.xpath("//div[@id='payment-selection-question']//div[1]/label[4]/span[1]/span")).click();
		yourContactDetails();
	}

	private static void yourContactDetails(){
		
		driver.findElement(By.name("Email")).sendKeys("test1@mailinator.com");
		driver.findElement(By.xpath("//fieldset[@id='marketingT']//div[2]/label/span")).click();
		driver.findElement(By.xpath("//label[@id='terms-label']/span")).click();
		driver.findElement(By.id("email-submit")).click();
	}

}
