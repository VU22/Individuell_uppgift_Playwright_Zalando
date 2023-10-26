package pagebase;
import com.microsoft.playwright.Page;

public class PageBase {

	protected Page page;
	
	public PageBase() {
	}
	
	public PageBase(Page page) {
		this.page = page;
	}

	public void openPage(String url) {
		page.navigate(url);
	}

}
