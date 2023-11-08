package testrun;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import pages.InputPage;
import testbase.TestBase;

public class Input_test extends TestBase {

	@Test
	public void TextInputTextTest() {

		InputPage inputPage = new InputPage(page);
		inputPage.openTextInput();
		inputPage.fillNewButton();

		assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ny knapp"))).isVisible();

	}
}
