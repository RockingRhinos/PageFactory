package specimen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "username") WebElement eleUsername;
	
	@FindBy(how = How.ID, using = "password") WebElement elePassword;
	
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") WebElement eleLoginButton;
	
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA") WebElement eleCrmsfa;
	
	public HomePage enterUsername() {
		eleUsername.sendKeys("demosalesmanager");
		return this;
	}
	
	public HomePage enterPassword() {
		elePassword.sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickLogin() {
		eleLoginButton.click();
		return this;
	}
	
	public HomePage clickCRMSFA() {
		eleCrmsfa.click();
		System.out.println(driver.getTitle());
		driver.close();
		return this;
	}
	
	/* @FindBys({
	@FindBy(how = How.ID, using = "password"),
	@FindBy(how = How.CLASS_NAME, using = "PASSWORD")
		}) List<WebElement> elePassword;  */

	
}
