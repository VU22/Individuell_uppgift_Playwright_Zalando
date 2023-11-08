package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import pagebase.PageBase;

public class InputPage extends PageBase {

	Page page;

	Locator button;
	Locator updatingButton;

	public InputPage(Page page) {
		this.page = page;
		this.button = page.locator("#newButtonName");
		this.updatingButton = page.locator("#updatingButton");
	}

	public void openTextInput() {
		String InputUrl = "http://uitestingplayground.com/textinput";
		page.navigate(InputUrl);

	}

	public void fillNewButton() {

		button.fill("Ny knapp");
		updatingButton.click();
	}
}
