package testrun;

import org.junit.jupiter.api.Test;

import pages.SorteraProductBy_Page;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class SorteraProduktBy extends TestBase {
	
	@Test
	void ProduktSortering() {
		
		SorteraProductBy_Page sorteraProductBy_Page = new SorteraProductBy_Page(page);
		sorteraProductBy_Page.openPageUrl();
		sorteraProductBy_Page.sortera();
 			
		
        assertThat(sorteraProductBy_Page.popular).isChecked();
        
	}
}
