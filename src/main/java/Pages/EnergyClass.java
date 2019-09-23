package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.BrowserClass;

public class EnergyClass extends BrowserClass {
	
	public static void gasEnergyDetails(){

		List<WebElement> gasTariff = driver.findElements(By.id("gas-tariff-additional-info"));
		gasTariff.get(0).click();
		
		List<WebElement> paymentOption = driver.findElements(By.id("gas-payment-method-dropdown-link"));
		paymentOption.get(0).click();

		driver.findElement(By.xpath("//fieldset[@id='gas-main-heating-source-question']//label[2]/span")).click();
		driver.findElement(By.xpath("//fieldset[@id='gas-type-of-bill-question']//label[2]/span")).click();
		driver.findElement(By.id("gas-spend")).sendKeys("39");
		driver.findElement(By.xpath("//fieldset[@id='gas-bill-date-field']//span[1]")).click();
		driver.findElement(By.xpath("//table[@id='gas-bill-day_table']//tr[1]/td[1]/div")).click();
		nextButton();
		
	}	
	
	public static void electricityEnergyDetails(){
		
		driver.findElement(By.xpath("//fieldset[@id='prepay-yes-no']//label[1]/span")).click();
		energyDeatils();
		nextButton();
	}	
	
	public static void gasAndElectricityEnergyDetails(){
		
		energyDeatils();
		driver.findElement(By.id("gas-current-spend")).sendKeys("45");
		List<WebElement> options = driver.findElements(By.id("gas-current-spend-period"));
		options.get(0).click();
		nextButton();
	}	
	
	private static void nextButton(){
		driver.findElement(By.id("goto-your-energy")).click();
	}
	
	private static void energyDeatils(){
		driver.findElement(By.xpath("//fieldset[@id='economy-7-question']//label[2]/span")).isSelected();
		driver.findElement(By.id("electricity-current-spend")).sendKeys("45");
		List<WebElement> options = driver.findElements(By.id("electricity-current-spend-period"));
		options.get(0).click();
	}
}

