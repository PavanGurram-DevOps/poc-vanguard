package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class Feature01{

	HomePage homePage;
	RegistrationPage regPage;
	SoftAssert sa;
	
	TestContext testContext;
	
	public Feature01(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		regPage = testContext.getPageObjectManager().getRegistrationPage();
		sa = new SoftAssert();
	}

	@Given("^I am on the HomePage$")
	public void launchHomePage() {		
		homePage.launchHomePage();
	}

	@When("^I click on openAccount button$")
	public void clickopenAccountBtn() throws Throwable {
		homePage.clickOpenAccountLink();
	}

	@Then("^I should be on the Registration page$")
	public void registrationPageNavigation() throws Throwable {
		regPage.waitForPageToLoad();
		sa.assertEquals("Vanguard: Helping you reach your investing goals | Vanguard", regPage.getPageHeading());
	}

	@And("^sleep for \"([^\"]*)\" millisec$")
	public void sleepForSec(String sec) throws Throwable {
		Thread.sleep(Long.parseLong(sec));
	}

	@Then("^I click on Start my application button$")
	public void iClickOnStartMyApplicationButton() {
		regPage.clickstartAppl();
	}
}
