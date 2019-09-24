# ctm-sdet-test

## Prerequisites:

1. JDK 8
2. Maven 4
3. Eclipse Neon
4. Selenium standalone server

Note: pom.xml has all the dependencies required for this framework. You may required Natural plugin (if not installed already in your Eclipse)

## Install Natural plugin:
1. Click on help tab from your Eclipse
2. Select Eclipse Marketplace..
3. Type Natural in your search input box 
4. Install Natural 0.7.6 or any version 
5. Restart your Eclipse  

## To run the tests locally  

* Open CTM Project into your Eclipse and the specified browser has to be installed (update the correct file path of your driver in the BrowserClass.java) as below:

Ex: System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace\\CTM\\src\\main\\java\\drivers\\chromedriver.exe");

## Browser (String)

1. CHROME
2. FIREFOX 

Note: If no browser is specified it will default to Chrome.

## Environment (String)

URL = "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT"

## Cucumber tags (String)

Specify the test suite(s) to run.

* @ctm
* @test
* @gas-quotes
* @electricity-quotes
* @gas-and-electricity-quotes

## How to run the test:

1. Open the RunTest.java class from the package TestRunner under folder the src/test/java
2. Set tags the test you want to run ex: tags = {"@test"}
3. Right click anywhere on the current page 
4. Select the Run As option and 
5. Select 1 JUnit test 

Sit back and wait for test to run........... complete

## Results reports: 

 To see the test results reports click on index.html for results reports under test-outout folder 
 Ex: C:\Users\admin\workspace\CTM\test-outout\index.html

## Three tests are covered in the framework as follow:

# Scenario: Energy quotes to compare with Gas 
  Step 1:
	* Verify header and footer displayed
	* Enter post code 
	* Yes, I have a bill option
	* Compare with Gas 
	* Supplier e-on option selected
	
  Step 2:
    * Gas tariff option first from the drop down
	 * Payment by Monthly direct debit 
	 * Main source of hitting - NO
	 * Current gas usage £XX
	 * Bill date - Starting date of the current month selected
	  
  Step 3:
  	* Fixed traffic
  	* Monthly direct debit
  	* Email address 
  	* Email marketing - up to date 
  	* Confirm T&C
  	
  Step 4:
  	* Summary component displayed
  	* Sign in component displayed 
  	* Our recommendations selected
  	* Click on first deal from the list 
  	* Verify Switch now button displayed
  	* Pricing details tab pre-selected
  	* Close the deal by clicking close details button
  	* Supplier rating filter applied...end test
  	
# Scenario: Energy quotes to compare with Electricity
  Step 1:
	* Verify header and footer displayed
	* Enter post code 
	* No, I do not have a bill option
	* Compare with Electricity 
	* I do not know - Supplier 
	
  Step 2:
    * Pre-payment pay as you go - Yes
	 * Economy 7 meter - NO 
	 * Currently spend on electricity £xx - monthly

  Step 3:
  	* Variable traffic
  	* Email address
  	* Email marketing - up to date 
  	* Confirm T&C
  	
  Step 4:
  	* Summary component displayed
  	* Sign in component displayed 
  	* Our recommendations pre-selected
  	* Click on third deal from the list 
  	* Verify Switch now button displayed
  	* Pricing details tab pre-selected
  	* Close the deal by clicking close details button...end test
  	 	
#  Scenario: Energy quotes to compare with Gas and Electricity
  Step 1:
	* Verify header and footer displayed
	* Enter post code 
	* No, I do not have a bill option
	* Compare with Gas&Electricity 
	* Electricity supplier - Other supplier option from the drop down- Affect Energy
	* Gas Supplier - I do not know 
	
  Step 2:
	 * Economy 7 meter - NO 
	 * Currently spend on electricity £xx - monthly
	 * Currently spend on gas £xx - monthly

  Step 3:
  	* All traffic
  	* All payment types
  	* Email address
  	* Email marketing - up to date 
  	* Confirm T&C
  	
  Step 4:
  	* Summary component displayed
  	* Sign in component displayed 
  	* Our recommendations pre-selected
  	* Click on first deal from the list 
  	* Verify Switch now button displayed
  	* Pricing details tab pre-selected
  	* Close the deal by clicking close details button...end test

