package pageObjects;

import helpers.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePO{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		initialise(this);
	}

	@FindBy(how=How.ID, using = "utility-open-an-account") private WebElement openAccount;
	@FindBy(how=How.XPATH, using = "//*/div[@class='gbs-col-sm-2 gbs-col-md-1']/button[@id]") public WebElement cookiePopUp;
	
	public void launchHomePage() {
		try {
			String url = ConfigFileReader.getHomePageURL();
			driver.get(url);
			waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOpenAccountLink() {
		wait.until(ExpectedConditions.elementToBeClickable(cookiePopUp)).click();
		wait.until(ExpectedConditions.elementToBeClickable(openAccount)).click();
	}
}
