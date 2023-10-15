package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import pagebase.PageBase;



public class LoginPage extends PageBase {
	Page page;
	
	Locator yourAccountButton;
	Locator emailInput;
	Locator passwordInput;
	Locator loginButton;
	
	

	public LoginPage(Page page) {
		this.page = page;
		this.yourAccountButton = page.getByTestId("user-account-icon");
		this.emailInput = page.getByPlaceholder("E-postadress");
		this.passwordInput = page.getByPlaceholder("Lösenord");
		this.loginButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logga in"));
		
	}

	public void openLoginPage() {
		String loginUrl = "https://zalando.se/";
		page.navigate(loginUrl);
	}

	public void login(String userName, String password) {
		yourAccountButton.click();
		emailInput.fill(userName);
		passwordInput.fill(password);
		loginButton.click();
	}

}

