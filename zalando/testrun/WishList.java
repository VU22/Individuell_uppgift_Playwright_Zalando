package testrun;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;

import pages.WishList_page;
import testbase.TestBase;

public class WishList extends TestBase {

	@Test

	void AddToWishList() {

		WishList_page wishList_page = new WishList_page(page);
		wishList_page.openPageTo();
		wishList_page.addToWishList("viktoria.zalando.test@gmail.com", "grp490grp490");

		assertThat(page.getByLabel("Ta bort från önskelistan"));

	}

}
