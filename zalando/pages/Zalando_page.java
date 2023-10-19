package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import pagebase.PageBase;

public class Zalando_page extends PageBase {
	
	Page page;
	Locator mainLogo;
	
	public Zalando_page (Page page) {
		
		this.page = page;
		this.mainLogo = page.getByTestId("logo-main"); 
		
	}
	
	public void open_Zalando () {
		
		mainLogo.click();
		
	}

}
