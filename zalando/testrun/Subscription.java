package testrun;

import org.junit.jupiter.api.Test;

import pages.Subscribtion_page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import testbase.TestBase;

public class Subscription extends TestBase {
	
	@Test
	void SubscripeTo () {
		
		Subscribtion_page subscribtion_page = new Subscribtion_page(page);
		subscribtion_page.openPageTo();
		subscribtion_page.subscribtion("viktoria.zalando.test@gmail.com");

		
		assertThat(subscribtion_page.yourPost).not().isEmpty();
		assertThat(page.getByText("Vi har skickat dig ett välkomstmejl")).isHidden();		

	}
}
	
