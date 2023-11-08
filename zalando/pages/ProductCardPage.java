package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

import pagebase.PageBase;

public class ProductCardPage extends PageBase {

	Page page;

	public Locator photo;
	public Locator productName;
	public Locator size;
	Locator choose;
	Locator chooseSize;
	public Locator buy;
	Locator brandLink;

	Locator tigerOfSweden;

	public ProductCardPage(Page page) {

		this.page = page;
		this.brandLink = page.getByRole(AriaRole.LINK, new GetByRoleOptions().setName("Tiger of Sweden"));
		this.photo = page.getByRole(AriaRole.IMG)
				.and(page.getByAltText("Tiger of Sweden - SHELLY -Jeans Skinny Fit - Stay"));
		this.productName = page.getByText("SHELLY - JEANS SKINNY FIT").nth(0);
		this.size = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Välj storlek"));
		this.choose = page.getByRole(AriaRole.BUTTON).and(page.getByTestId("pdp-size-picker-trigger"));
		this.chooseSize = page.getByText("25x30");
		this.buy = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Handla"));

	}

	public void OpenProductCardUrl() {
		String productCardUrl = "https://www.zalando.se/tiger-of-sweden-jeans-shelly-jeans-skinny-fit-stay-tn221n03u-q11.html";
		page.navigate(productCardUrl);
	}

	public void choose() {

		choose.click();
		chooseSize.click();
		buy.click();

	}

	public void brandLink() {

		brandLink.click();

	}

}
