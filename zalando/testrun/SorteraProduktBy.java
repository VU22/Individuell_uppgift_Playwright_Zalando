package testrun;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;


import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class SorteraProduktBy extends TestBase {
	
	@Test
	void ProduktSortering() {
		
			String loginUrl = "https://zalando.se/kvinna-home/";
			page.navigate(loginUrl);
		
			
			
			
        Locator clothes = page.getByRole(AriaRole.PRESENTATION).and (page.getByLabel("Kläder"));
        Locator sortera = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sortera"));
        Locator menu = page.getByRole(AriaRole.MENU);
        Locator populärt =  menu.getByLabel("Mest populärt");
               
       
        clothes.click();
        sortera.click();
        populärt.check();
        
        assertThat(populärt).isChecked();
        
	}
}
