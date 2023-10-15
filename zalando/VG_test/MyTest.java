package VG_test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

import testbase.TestBase;

public class MyTest extends TestBase{
	
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
