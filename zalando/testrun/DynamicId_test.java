package testrun;

import org.junit.jupiter.api.Test;

import pages.DynamicIdPage;
import testbase.TestBase;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class DynamicId_test extends TestBase {
	@Test
	void clickDynamicIdButton() {

		DynamicIdPage dynamicIdPage = new DynamicIdPage(page);
		dynamicIdPage.openDynamicIdPage();
		dynamicIdPage.clickDynamicIdButton();

		assertThat(dynamicIdPage.getDynamicIdButton()).isFocused();
	}
}
