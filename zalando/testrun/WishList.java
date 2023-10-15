package testrun;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import testbase.TestBase;

public class WishList extends TestBase {
	
@Test
	
	void AddToWishList (){
		
		String productCardUrl = "https://www.zalando.se/tiger-of-sweden-jeans-shelly-jeans-skinny-fit-stay-tn221n03u-q11.html";
		page.navigate(productCardUrl);


		Locator wishList = page.getByRole(AriaRole.BUTTON).and (page.getByLabel("Spara på önskelistan").and (page.getByTestId("pdp-wishlist-button")));
		Locator epostadress = page.getByPlaceholder("E-postadress");
		Locator password =page.getByPlaceholder("Lösenord");
		Locator loginBtn = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logga in"));
	
		wishList.click();
		epostadress.fill("viktoria.zalando.test@gmail.com");
		password.fill("grp490grp490");
		loginBtn.click();
		
		
		
		assertThat(page.getByLabel("Ta bort från önskelistan"));
		
	}

}
