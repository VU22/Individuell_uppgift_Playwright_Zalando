package testrun;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import testbase.TestBase;

public class Subscription extends TestBase {
	
	@Test
	void SubscripeTo () {
		
		Locator yourPost = page.getByLabel("Din e-postadress");
		Locator modeWoman = page.getByText("Mode för dam");
		Locator more =page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Fler alternativ"));
		Locator checkboxes = page.getByRole(AriaRole.CHECKBOX);
		Locator itemAlerts = page.getByTestId("item-alerts");
		Locator prenumeration = page.getByText("Jag vill prenumerera");
		
		yourPost.fill("viktoria.zalando.test@gmail.com");
		modeWoman.click();
		more.click();
		for (int i = 0; i < checkboxes.count(); i++) {
            checkboxes.nth(i).check();	        
            for (int b = 0; b < itemAlerts.count(); b++) {
                itemAlerts.nth(b).click();
            
         prenumeration. click();       

		
		assertThat(yourPost).not().isEmpty();
		assertThat(page.getByText("Vi har skickat dig ett välkomstmejl")).isVisible();
		
	}

}
	}
}
	
