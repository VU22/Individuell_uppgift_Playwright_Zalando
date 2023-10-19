package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import pagebase.PageBase;

public class SorteraProductBy_Page extends PageBase {
	
	Page page;
	Locator clothes;
	Locator sortera;
    public Locator popular;
	
 public SorteraProductBy_Page(Page page) {
	
	this.page = page;
	this.clothes = page.getByRole(AriaRole.PRESENTATION).and (page.getByLabel("Kläder"));
	this.sortera = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sortera"));	
	this.popular = page.getByRole(AriaRole.RADIO).and (page.getByLabel("Mest populärt"));
			
			
			
	
}

 public void openPageUrl() {
	String pageUrl = "https://zalando.se/kvinna-home/";
	page.navigate(pageUrl);
	 
}
	


 public void sortera() {
	
	clothes.click();
    sortera.click();
    popular.check();
}
}