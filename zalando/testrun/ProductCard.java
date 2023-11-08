package testrun;

import org.junit.jupiter.api.Test;

import pages.ProductCardPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ProductCard extends TestBase {

	@Test

	void InformationAboutProduct() {

		ProductCardPage productCardPage = new ProductCardPage(page);
		productCardPage.OpenProductCardUrl();
		productCardPage.choose();

		assertThat(productCardPage.photo).isHidden();
		assertThat(productCardPage.productName).hasText("SHELLY - Jeans Skinny Fit - stay");
		assertThat(productCardPage.size).isHidden();
		assertThat(productCardPage.buy).isEnabled();

		System.out.println("Testet lyckades!");

	}

	@Test

	void BrandLink() {

		ProductCardPage productCardPage = new ProductCardPage(page);
		productCardPage.OpenProductCardUrl();
		productCardPage.brandLink();

		assertThat(page).hasURL("https://www.zalando.se/katalog/tiger-of-sweden/");

		System.out.println("Testet lyckades!");

	}
}
