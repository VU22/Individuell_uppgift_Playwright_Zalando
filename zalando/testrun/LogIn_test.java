package testrun;

import org.junit.jupiter.api.Test;

import pages.LoginPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LogIn_test extends TestBase {

	@Test
	void loginAsUser() {

		LoginPage loginPage = new LoginPage(page);
		loginPage.openLoginPage();
		loginPage.login("viktoria.zalando.test@gmail.com", "grp490grp490");

		assertThat(page.getByText("Logga ut"));

	}

	@Test
	void loginUt() {

		LoginPage loginPage = new LoginPage(page);
		loginPage.openLoginPage();
		loginPage.login("viktoria.zalando.test@gmail.com", "grp490grp490");
		loginPage.logaut();

		assertThat(page.getByText("Logga in"));

	}

	@Test
	void loginWithWrongPassword() {

		LoginPage loginPage = new LoginPage(page);
		loginPage.openLoginPage();
		loginPage.login("viktoria.zalando.test@gmail.com", "grp450grp450");

		assertThat(page.getByTestId("login_error_notification")).isVisible();

	}

}
