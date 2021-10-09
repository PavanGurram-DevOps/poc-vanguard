package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class PageObjectManager {

	private WebDriver driver;
	private WebDriverWait wait;
	private HomePage homePage;
	private RegistrationPage regPage;
	
	public PageObjectManager(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver,wait) : homePage;
	}
	
	public RegistrationPage getRegistrationPage() {
		return (regPage == null)? regPage = new RegistrationPage(driver,wait) : regPage;
	}
}
