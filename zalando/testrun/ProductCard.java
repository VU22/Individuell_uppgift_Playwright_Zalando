package testrun;

import org.junit.jupiter.api.Test;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;



public class ProductCard extends TestBase {
	
	
	
	@Test
	
	void InformationAboutProduct () {
		
		String productCardUrl = "https://www.zalando.se/tiger-of-sweden-jeans-shelly-jeans-skinny-fit-stay-tn221n03u-q11.html";
		page.navigate(productCardUrl);

	
	Locator photo = page.getByRole(AriaRole.IMG).and (page.getByAltText("Tiger of Sweden - SHELLY -Jeans Skinny Fit - Stay")); 
	Locator productName = page.getByText("SHELLY - JEANS SKINNY FIT").nth(0);
	Locator size = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Välj storlek"));
	Locator choose = page.getByRole(AriaRole.BUTTON).and (page.getByTestId("pdp-size-picker-trigger"));
	Locator chooseSize = page.getByText("25x30");
	Locator buy = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Handla"));
	
					        
	choose.click();
	chooseSize.click();
	buy.click();
		
	
	assertThat(photo).isHidden();
	assertThat(productName).hasText("SHELLY - Jeans Skinny Fit - stay");
	assertThat(size).isHidden();
	assertThat(buy).isEnabled();
	
	
        System.out.println("Testet lyckades!");
	
}
	@Test
	
	void BrandLink () {
		
		String productCardUrl = "https://www.zalando.se/tiger-of-sweden-jeans-shelly-jeans-skinny-fit-stay-tn221n03u-q11.html";
		page.navigate(productCardUrl);
	
	Locator tigerOfSweden = page.getByRole(AriaRole.LINK, new GetByRoleOptions().setName("TIGER OF SWEDEN"));
	
	tigerOfSweden.click();
	
	assertThat(page).hasURL("https://www.zalando.se/tiger-of-sweden/");
	
	 System.out.println("Testet lyckades!");
	
	}
}	
	
