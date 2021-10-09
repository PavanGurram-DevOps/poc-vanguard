package pageObjects;

import helpers.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage extends BasePO{

	public RegistrationPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		initialise(this);
	}

	@FindBy(how=How.XPATH, using = "//*/div[@class='mod-new-client-action']/button") private WebElement startAppl;
	@FindBy(how=How.XPATH, using = "//*/div[@class='container text-center']/h1") private WebElement pageHeading;

	public String getPageHeading() {
		return pageHeading.getText();
	}
	public void clickstartAppl() {
		wait.until(ExpectedConditions.elementToBeClickable(startAppl)).click();
	}
}
