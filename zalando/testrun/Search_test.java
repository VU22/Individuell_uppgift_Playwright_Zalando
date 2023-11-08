package testrun;

import org.junit.jupiter.api.Test;

import pages.SearchPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Search_test extends TestBase {

	@Test
	void produktSearch() {

		SearchPage searchPage = new SearchPage(page);
		searchPage.openPageTo();
		searchPage.search("klänningar");

		searchPage.suggest.click();

		assertThat(SearchPage.searchInput).hasValue("klänningar");
		assertThat(page.getByText("Kläningar"));

	}

	@Test
	void negativeSearch() {

		SearchPage searchPage = new SearchPage(page);
		searchPage.openPageTo();
		searchPage.search("mjöl");

		assertThat(SearchPage.searchInput).hasValue("mjöl");
		assertThat(page.getByText("Kontrollera stavning eller testa att söka efter ett annat ord."));

	}

}
