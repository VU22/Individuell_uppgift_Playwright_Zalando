package pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

import pagebase.PageBase;

public class SorteraProductBy_Page extends PageBase {
	
	Page page;
	Locator clothes;
	Locator toppval;
	Locator sortera;
    public Locator popular;
	
 public SorteraProductBy_Page(Page page) {
	
	this.page = page;
	this.clothes = page.getByRole(AriaRole.PRESENTATION).and (page.getByLabel("Kläder"));
	this.toppval = page.getByRole(AriaRole.BUTTON).and (page.getByTestId("filter-count").and (page.getByLabel("filtrera på Toppval")));
	this.sortera = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Sortera"));	
	this.popular = page.getByText("Nyast");
			
			
			
	
}

 public void openPageUrl() {
	String pageUrl = "https://zalando.se/kvinna-home/";
	page.navigate(pageUrl);
	
} 

	


 public void sortera() {
	
	clothes.click();
	toppval.dblclick();
    sortera.click();
    popular.click();
}
}