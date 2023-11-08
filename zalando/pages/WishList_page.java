package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import pagebase.PageBase;

public class WishList_page extends PageBase {

	Page page;
	Locator wishList;
	Locator epostadress;
	Locator password;
	Locator loginBtn;

	public WishList_page(Page page) {
		this.page = page;
		this.wishList = page.getByRole(AriaRole.BUTTON)
				.and(page.getByLabel("Spara på önskelistan").and(page.getByTestId("pdp-wishlist-button")));
		this.epostadress = page.getByPlaceholder("E-postadress");
		this.password = page.getByPlaceholder("Lösenord");
		this.loginBtn = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logga in"));

	}

	public void openPageTo() {

		String productCardUrl = "https://www.zalando.se/tiger-of-sweden-jeans-shelly-jeans-skinny-fit-stay-tn221n03u-q11.html";
		page.navigate(productCardUrl);
	}

	public void addToWishList(String mail, String pass) {
		wishList.click();
		epostadress.fill(mail);
		password.fill(pass);
		loginBtn.click();

	}

}
