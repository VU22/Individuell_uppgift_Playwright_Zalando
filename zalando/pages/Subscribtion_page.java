package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import pagebase.PageBase;

public class Subscribtion_page extends PageBase {

	Page page;
	public Locator yourPost;
	Locator modeWoman;
	Locator more;
	Locator checkboxes;
	Locator itemAlerts;
	Locator prenumeration;

	public Subscribtion_page(Page page) {

		this.page = page;
		this.yourPost = page.getByLabel("Din e-postadress");
		this.modeWoman = page.getByText("Mode för dam");
		this.more = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Fler alternativ"));
		this.checkboxes = page.getByRole(AriaRole.CHECKBOX);
		this.itemAlerts = page.getByTestId("item-alerts");
		this.prenumeration = page.getByText("Jag vill prenumerera");
	}

	public void openPageTo() {
		String loginUrl = ("https://www.zalando.se/");
		page.navigate(loginUrl);
	}

	public void subscribtion(String post) {

		yourPost.fill(post);
		modeWoman.click();
		more.click();
		for (int i = 0; i < checkboxes.count(); i++) {
			checkboxes.nth(i).check();
			for (int b = 0; b < itemAlerts.count(); b++) {
				itemAlerts.nth(b).click();

				prenumeration.click();
			}
		}

	}
}
