package testrun;
import org.junit.jupiter.api.Test;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;




public class Search_test extends TestBase {
	
	@Test
    void produktSearch() {
			
	
	Locator searchInput  = page.getByLabel("Sök efter");
	Locator suggestList = page.getByTestId("auto-suggest-list");
	Locator suggest  = page.getByText("klänningar", new Page.GetByTextOptions().setExact(true));
	
	
	searchInput.fill("klänningar");
	suggestList.isVisible();
	suggest.click();
	
	
	assertThat(searchInput).hasValue("klänningar");
	assertThat(page.getByText("Kläningar"));
	
	
	}	
	
	
	@Test
    void negativeSearch() {       
			
	
	Locator searchInput  = page.getByLabel("Sök efter");
	
		
	searchInput.fill("mjöl");
	searchInput.dblclick();
	
	
	assertThat(searchInput).hasValue("mjöl");
	assertThat(page.getByText("Kontrollera stavning eller testa att söka efter ett annat ord."));
	
	}	

}




	
