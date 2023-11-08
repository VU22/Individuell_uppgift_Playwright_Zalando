package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import pagebase.PageBase;

public class NavigationMenuPage extends PageBase {

	Page page;

	Locator header;
	public Locator kvinnaButton;
	public Locator manButton;
	public Locator barnButton;

	public NavigationMenuPage(Page page) {

		this.page = page;
		this.header = page.getByTestId("header");
		this.kvinnaButton = header.getByText("kvinna").filter(new Locator.FilterOptions().setHasText("Kvinna"));
		this.manButton = header.getByText("Man").filter(new Locator.FilterOptions().setHasText("Man"));
		this.barnButton = header.getByText("Barn").filter(new Locator.FilterOptions().setHasText("Barn"));

	}

	public void openPageTo() {
		String loginUrl = ("https://www.zalando.se/");
		page.navigate(loginUrl);
	}

	public void navigate() {

		kvinnaButton.click();
		manButton.click();
		barnButton.click();
	}

}
