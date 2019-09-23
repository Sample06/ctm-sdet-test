package Pages;

import org.openqa.selenium.By;

import selenium.BrowserClass;

public class ResultsClass extends BrowserClass {
	
	public static void resultsQuotes(){
		
		driver.findElement(By.xpath("//section[1]/div[1]/h3")).isDisplayed();
		driver.findElement(By.id("alerts-preferences-header")).isDisplayed();
		driver.findElement(By.id("alerts-preferences-sign-in")).isDisplayed();
	}

	public static void selectGasDeal(){
		
		driver.findElement(By.xpath("//label[@id='filters-recommendations-view']/span")).isSelected();
		driver.findElement(By.id("tariffSelectionG4914700-online-more-details")).click();
		driver.findElement(By.id("switch-now-tariffSelectionG4914700")).isDisplayed();
		driver.findElement(By.xpath("//li[@id='pricing-details-tab']/a")).isSelected();
		driver.findElement(By.id("tariffSelectionG4914700-online-close-details")).click();
	}
	
	public static void filters(){
		
		driver.findElement(By.xpath("//label[@id='filters-tariff-type-fixed']/span")).isSelected();
		driver.findElement(By.xpath("//label[@id='filters-payment-type-monthly']/span")).isSelected();
		driver.findElement(By.xpath("//label[@id='filters-supplier-rating-five-star']/span[1]")).click();
	}
	
	public static void selectElectricityDeal(){
		driver.findElement(By.xpath("//label[@id='filters-recommendations-view']/span")).isSelected();
		driver.findElement(By.id("tariffSelectionE4921282-online-more-details")).click();
		driver.findElement(By.id("switch-now-tariffSelectionE4921282")).isDisplayed();
		driver.findElement(By.xpath("//li[@id='pricing-details-tab']/a")).isSelected();
		driver.findElement(By.id("tariffSelectionE4921282-online-close-details")).click();
		
	}
	
public static void selectGasAndElectricityDeal(){
		
		driver.findElement(By.xpath("//label[@id='filters-recommendations-view']/span")).isSelected();
		driver.findElement(By.id("tariffSelectionG4976003_E4975835_S499-online-more-details")).click();
		driver.findElement(By.id("switch-now-tariffSelectionG4976003_E4975835_S499")).isDisplayed();
		driver.findElement(By.xpath("//li[@id='pricing-details-tab']/a")).isSelected();
		driver.findElement(By.id("tariffSelectionG4976003_E4975835_S499-online-close-details")).click();
		
	}
}
