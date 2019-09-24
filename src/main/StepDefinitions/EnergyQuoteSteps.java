package StepDefinitions;

import selenium.BrowserClass;
import Pages.ResultsClass;
import Pages.SupplierClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnergyQuoteSteps {

	
	@Given("^User is on CTM energy quote page$")
	public void user_is_on_CTM_energy_quote_page() {
		BrowserClass.OpenBrowser();
	    SupplierClass.OpenEnergyQuotePage();
	}

	@When("^User enters the gas supplier details$")
	public void user_enters_the_gas_supplier_details() {
		SupplierClass.enterPostCode();
	    try {
			SupplierClass.gasCurrentSupplierDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	}

	@When("^User enters the gas energy details$")
	public void user_enters_the_gas_energy_details() {
		EnergyClass.gasEnergyDetails();
	}

	@When("^User enters the gas details$")
	public void user_enters_the_gas_details() {
	   try {
		DetailsClass.gasPreferences();
		Thread.sleep(200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

	@Then("^User redirects to the gas quotes results page$")
	public void user_redirects_to_the_gas_quotes_results_page() {
		ResultsClass.resultsQuotes();
		ResultsClass.selectGasDeal();
		ResultsClass.filters();
		BrowserClass.closeBrowser();
	}
	
	@When("^User enters the electricity supplier details$")
	public void user_enters_the_electricity_supplier_details() {
		SupplierClass.enterPostCode();
	    try {
			SupplierClass.electricityCurrentSupplierDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("^User enters the electricity energy details$")
	public void user_enters_the_electricity_energy_details() {
		EnergyClass.electricityEnergyDetails();
	}

	@When("^User enters the electricity details$")
	public void user_enters_the_electricity_details() {
		try {
			DetailsClass.electricityPreferences();
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^User redirects to the electricity quotes results page$")
	public void user_redirects_to_the_electricity_quotes_results_page() {
		ResultsClass.resultsQuotes();
		ResultsClass.selectElectricityDeal();
		BrowserClass.closeBrowser();
	}

	@When("^User enters the Gas and Electricity supplier details$")
	public void user_enters_the_Gas_and_Electricity_supplier_details() {
		SupplierClass.enterPostCode();
	    try {
			SupplierClass.gasAndElectricityCurrentSupplierDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("^User enters the Gas and Electricity energy details$")
	public void user_enters_the_Gas_and_Electricity_energy_details() {
		EnergyClass.gasAndElectricityEnergyDetails();
	}

	@When("^User enters the Gas and Electricity details$")
	public void user_enters_the_Gas_and_Electricity_details() {
		try {
			DetailsClass.gasAndElectricityPreferences();
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^User redirects to the Gas and Electricity quotes results page$")
	public void user_redirects_to_the_Gas_and_Electricity_quotes_results_page() {
		ResultsClass.resultsQuotes();
		ResultsClass.selectGasAndElectricityDeal();
		BrowserClass.closeBrowser();
	}
}
