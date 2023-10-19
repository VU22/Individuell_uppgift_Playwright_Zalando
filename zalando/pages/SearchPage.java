package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import pagebase.PageBase;

public class SearchPage extends PageBase {
	
	Page page;
	public static Locator searchInput;
	Locator suggestList;
	public Locator suggest;
	
	public SearchPage (Page page) {
		this.page = page;
		SearchPage.searchInput = page.getByLabel("Sök efter");
		this.suggestList = page.getByTestId("auto-suggest-list");
		this.suggest = page.getByText("klänningar", new Page.GetByTextOptions().setExact(true));
		
	}
	
	public void search (String suggest) {
		searchInput.fill(suggest);
		suggestList.isVisible();		
		
	}
	
	public void searchNegative (String search) {
		searchInput.fill(search);
	}

	

}
