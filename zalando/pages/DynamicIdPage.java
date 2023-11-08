package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import pagebase.PageBase;

public class DynamicIdPage extends PageBase {

	Locator dynamicIdButton;

	public DynamicIdPage(Page page) {
		this.page = page;
		this.dynamicIdButton = page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Button with Dynamic ID"));
	}

	public void openDynamicIdPage() {
		String PageUrl = "http://uitestingplayground.com/dynamicid";
		page.navigate(PageUrl);
	}

	public void clickDynamicIdButton() {
		dynamicIdButton.click();
	}

	public Locator getDynamicIdButton() {
		return dynamicIdButton;
	}
}
